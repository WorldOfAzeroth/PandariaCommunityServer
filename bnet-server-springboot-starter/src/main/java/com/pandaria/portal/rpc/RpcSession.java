package com.pandaria.portal.rpc;

import com.pandaria.auth.dto.AccountInfo;
import com.pandaria.auth.dto.GameAccount;
import lombok.Data;

@Data
public class RpcSession {
    private String locale;
    private String platform;
    private int build;
    private String ipCountry;
    private boolean authed;
    private boolean authorized;
    private AccountInfo accountInfo;
    private byte[] clientSecret;
    private GameAccount identityAccount;
}
