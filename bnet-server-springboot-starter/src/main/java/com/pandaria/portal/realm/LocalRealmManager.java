package com.pandaria.portal.realm;

import com.pandaria.auth.domain.BuildAuthKey;
import com.pandaria.auth.domain.BuildAuthKeyId;
import com.pandaria.auth.domain.BuildInfo;
import com.pandaria.auth.repository.BuildInfoRepository;
import com.pandaria.auth.repository.RealmlistRepository;
import com.pandaria.common.Logs;
import com.pandaria.portal.boot.PortalProperties;
import com.pandaria.utils.SecureUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocalRealmManager implements RealmManager, InitializingBean {


    private final ScheduledExecutorService scheduledExecutorService;
    private final PortalProperties portalProperties;
    private final BuildInfoRepository buildInfoRepo;
    private final RealmlistRepository realmlistRepo;
    private final Map<Integer, ClientBuild> buildInfoMap;

    private final ConcurrentHashMap<RealmKey, Realm> realmMap = new ConcurrentHashMap<>(5, .1f);


    @Override
    public ClientBuild getBuildInfo(int build) {
        return buildInfoMap.get(build);
    }

    @Override
    public Set<RealmKey> realmKeys() {
        return realmMap.keySet();
    }

    @Override
    public Realm getRealmByKey(RealmKey key) {
        return realmMap.get(key);
    }

    public void loadBuildInfo() {
        this.buildInfoMap = buildInfoRepo.stream().collect(
                Collectors.groupingBy(e -> e.buildInfo().getId(), Collectors.collectingAndThen(Collectors.toList(), list -> {
                    BuildInfo buildInfo = list.getFirst().buildInfo();
                    ClientBuild clientBuild = new ClientBuild();
                    clientBuild.setBuild(buildInfo.getId());
                    clientBuild.setBugfixVersion(buildInfo.getBugfixVersion());
                    clientBuild.setMinorVersion(buildInfo.getMinorVersion());
                    clientBuild.setMajorVersion(buildInfo.getMajorVersion());
                    char[] hotfixVersion = new char[ClientBuild.HOTFIX_VERSION_LENGTH];
                    String vHotfixVersion = buildInfo.getHotfixVersion();
                    if (StringUtils.hasText(vHotfixVersion)) {
                        char[] chars = vHotfixVersion.toCharArray();
                        System.arraycopy(chars, 0, hotfixVersion, 0, Math.min(chars.length, hotfixVersion.length));
                    }
                    clientBuild.setHotfixVersion(hotfixVersion);
                    List<ClientBuild.AuthKey> authKeys = list.stream().filter(view -> {
                        BuildAuthKey buildAuthKey = view.authKey();
                        boolean result = true;
                        if (!ClientBuild.PLATFORM_TYPE.contains(buildAuthKey.getId().getPlatform())) {
                            Logs.sql.error("ClientBuild::LoadBuildInfo: Invalid platform {} for `build` {} in `build_auth_key`, skipped.", buildAuthKey.getId().getPlatform(), buildInfo.getId());
                            result = false;
                        }
                        if (!ClientBuild.ARCH.contains(buildAuthKey.getId().getArch())) {
                            Logs.sql.error("ClientBuild::LoadBuildInfo: Invalid `arch` {} for `build` {} in `build_auth_key`, skipped.", buildAuthKey.getId().getArch(), buildInfo.getId());
                            result = false;
                        }

                        if (!ClientBuild.TYPE.contains(buildAuthKey.getId().getType())) {
                            Logs.sql.error("ClientBuild::LoadBuildInfo: Invalid `type` {} for `build` {} in `build_auth_key`, skipped.", buildAuthKey.getId().getType(), buildInfo.getId());
                            result = false;
                        }
                        return result;
                    }).map(view -> {
                        BuildAuthKey buildAuthKey = view.authKey();
                        BuildAuthKeyId keyId = buildAuthKey.getId();
                        return new ClientBuild.AuthKey(new ClientBuild.VariantId(keyId.getPlatform(), keyId.getArch(), keyId.getType()), SecureUtils.hexStringToByteArray(buildAuthKey.getKey()));
                    }).toList();
                    clientBuild.setAuthKeys(authKeys);
                    return buildInfo;
                }))
        );
    }



    public void updateRealmList() {
        realmlistRepo.stream().map(v -> {
            Realm realm = new Realm();
            realm.setId(RealmKey.createRealmKey(v.getRegion().byteValue(), v.getBattlegroup().byteValue(), v.getId().intValue()));
            realm.setBuild(v.getGamebuild().intValue());
            realm.setName(v.getName());
            realm.setExternalAddress(toInetAddress(v.getAddress()));
            realm.setLocalAddress(toInetAddress(v.getLocalAddress()));
            realm.setLocalSubnetMask(toInetAddress(v.getLocalSubnetMask()));
            int icon = v.getIcon() == null ? 0 : v.getIcon();
            icon = icon == Realm.REALM_TYPE_FFA_PVP ? Realm.REALM_TYPE_PVP : icon;
            icon = icon >= Realm.REALM_TYPE_FFA_PVP ? Realm.REALM_TYPE_NORMAL : icon;
            realm.setType(icon);
            realm.setTimezone(v.getTimezone());
            realm.setAllowedSecurityLevel(v.getAllowedSecurityLevel());
            realm.setPort(v.getPort());
            realm.setPopulationLevel(v.getPopulation());
            return realm;
        }).forEach(realm -> {
            realmMap.put(realm.getId(), realm);
        });
    }

    private InetAddress toInetAddress(String hostName) {
        try {
            return Inet4Address.getByName(hostName);
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(e);
        }
    }


    @Override
    @Transactional
    public void afterPropertiesSet() throws Exception {
        loadBuildInfo();
        int updateDelay = portalProperties.getRealmsStateUpdateDelay();
        scheduledExecutorService.scheduleWithFixedDelay(this::updateRealmList, updateDelay, updateDelay, TimeUnit.SECONDS);
    }
}
