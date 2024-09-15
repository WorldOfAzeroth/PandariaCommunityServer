package com.github.jtrinity.hotfixes;


import com.github.jtrinity.hotfixes.domain.*;
import com.github.jtrinity.cache.CacheProvider;

import java.util.Map;

public class DefaultHotfixObjectManager implements HotfixObjectManager {

    Map<Integer, Achievement>                    sAchievementStore;
    Map<Integer, AchievementCategory>            sAchievementCategoryStore;
    Map<Integer, AnimationDatum>                 sAnimationDataStore;
    Map<Integer, AnimKit>                        sAnimKitStore;
    Map<Integer, AreaGroupMember>                sAreaGroupMemberStore;
    Map<Integer, AreaTable>                      sAreaTableStore;
    Map<Integer, AreaTrigger>                    sAreaTriggerStore;
    Map<Integer, AreaTriggerActionSet>           sAreaTriggerActionSetStore;
    Map<Integer, ArmorLocation>                  sArmorLocationStore;
    Map<Integer, AuctionHouse>                   sAuctionHouseStore;
    Map<Integer, BankBagSlotPrice>               sBankBagSlotPricesStore;
    Map<Integer, BannedAddon>                    sBannedAddonsStore;
    Map<Integer, BarberShopStyle>                sBarberShopStyleStore;
    Map<Integer, BattlePetAbility>               sBattlePetAbilityStore;
    Map<Integer, BattlePetBreedQuality>          sBattlePetBreedQualityStore;
    Map<Integer, BattlePetBreedState>            sBattlePetBreedStateStore;
    Map<Integer, BattlePetSpecie>                sBattlePetSpeciesStore;
    Map<Integer, BattlePetSpeciesState>          sBattlePetSpeciesStateStore;
    Map<Integer, BattlemasterList>               sBattlemasterListStore;
    Map<Integer, BroadcastText>                  sBroadcastTextStore;
    Map<Integer, CfgCategory>                    sCfgCategoriesStore;
    Map<Integer, CfgRegion>                      sCfgRegionsStore;
    Map<Integer, CharTitle>                      sCharTitlesStore;
    Map<Integer, CharacterLoadout>               sCharacterLoadoutStore;
    Map<Integer, CharacterLoadoutItem>           sCharacterLoadoutItemStore;
    Map<Integer, ChatChannel>                    sChatChannelsStore;
    Map<Integer, ChrClassUiDisplay>              sChrClassUIDisplayStore;
    Map<Integer, ChrClass>                       sChrClassesStore;
    Map<Integer, ChrClassesXPowerType>           sChrClassesXPowerTypesStore;
    Map<Integer, ChrCustomizationChoice>         sChrCustomizationChoiceStore;
    Map<Integer, ChrCustomizationDisplayInfo>    sChrCustomizationDisplayInfoStore;
    Map<Integer, ChrCustomizationElement>        sChrCustomizationElementStore;
    Map<Integer, ChrCustomizationOption>         sChrCustomizationOptionStore;
    Map<Integer, ChrCustomizationReq>            sChrCustomizationReqStore;
    Map<Integer, ChrCustomizationReqChoice>      sChrCustomizationReqChoiceStore;
    Map<Integer, ChrModel>                       sChrModelStore;
    Map<Integer, ChrRaceXChrModel>               sChrRaceXChrModelStore;
    Map<Integer, ChrRace>                        sChrRacesStore;
    Map<Integer, CinematicCamera>                sCinematicCameraStore;
    Map<Integer, CinematicSequence>              sCinematicSequencesStore;
    Map<Integer, ConditionalChrModel>            sConditionalChrModelStore;
    Map<Integer, ConditionalContentTuning>       sConditionalContentTuningStore;
    Map<Integer, ContentTuning>                  sContentTuningStore;
    Map<Integer, ConversationLine>               sConversationLineStore;
    Map<Integer, CreatureDisplayInfo>            sCreatureDisplayInfoStore;
    Map<Integer, CreatureDisplayInfoExtra>       sCreatureDisplayInfoExtraStore;
    Map<Integer, CreatureFamily>                 sCreatureFamilyStore;
    Map<Integer, CreatureModelDatum>             sCreatureModelDataStore;
    Map<Integer, CreatureType>                   sCreatureTypeStore;
    Map<Integer, Criteria>                       sCriteriaStore;
    Map<Integer, CriteriaTree>                   sCriteriaTreeStore;
    Map<Integer, CurrencyContainer>              sCurrencyContainerStore;
    Map<Integer, CurrencyType>                   sCurrencyTypesStore;
    Map<Integer, Curve>                          sCurveStore;
    Map<Integer, CurvePoint>                     sCurvePointStore;
    Map<Integer, DestructibleModelDatum>         sDestructibleModelDataStore;
    Map<Integer, Difficulty>                     sDifficultyStore;
    Map<Integer, DungeonEncounter>               sDungeonEncounterStore;
    Map<Integer, DurabilityCost>                 sDurabilityCostsStore;
    Map<Integer, DurabilityQuality>              sDurabilityQualityStore;
    Map<Integer, Emote>                          sEmotesStore;
    Map<Integer, EmotesText>                     sEmotesTextStore;
    Map<Integer, EmotesTextSound>                sEmotesTextSoundStore;
    Map<Integer, ExpectedStat>                   sExpectedStatStore;
    Map<Integer, ExpectedStatMod>                sExpectedStatModStore;
    Map<Integer, Faction>                        sFactionStore;
    Map<Integer, FactionTemplate>                sFactionTemplateStore;
    Map<Integer, FriendshipRepReaction>          sFriendshipRepReactionStore;
    Map<Integer, FriendshipReputation>           sFriendshipReputationStore;
    Map<Integer, GameobjectArtKit>               sGameObjectArtKitStore;
    Map<Integer, GameobjectDisplayInfo>          sGameObjectDisplayInfoStore;
    Map<Integer, Gameobject>                     sGameObjectsStore;
    Map<Integer, GemProperty>                    sGemPropertiesStore;
    Map<Integer, GlyphBindableSpell>             sGlyphBindableSpellStore;
    Map<Integer, GlyphSlot>                      sGlyphSlotStore;
    Map<Integer, GlyphProperty>                  sGlyphPropertiesStore;
    Map<Integer, GlyphRequiredSpec>              sGlyphRequiredSpecStore;
    Map<Integer, GossipNpcOption>                sGossipNPCOptionStore;
    Map<Integer, GuildColorBackground>           sGuildColorBackgroundStore;
    Map<Integer, GuildColorBorder>               sGuildColorBorderStore;
    Map<Integer, GuildColorEmblem>               sGuildColorEmblemStore;
    Map<Integer, GuildPerkSpell>                 sGuildPerkSpellsStore;
    Map<Integer, Heirloom>                       sHeirloomStore;
    Map<Integer, Holiday>                        sHolidaysStore;
    Map<Integer, ImportPriceArmor>               sImportPriceArmorStore;
    Map<Integer, ImportPriceQuality>             sImportPriceQualityStore;
    Map<Integer, ImportPriceShield>              sImportPriceShieldStore;
    Map<Integer, ImportPriceWeapon>              sImportPriceWeaponStore;
    Map<Integer, ItemAppearance>                 sItemAppearanceStore;
    Map<Integer, ItemArmorQuality>               sItemArmorQualityStore;
    Map<Integer, ItemArmorShield>                sItemArmorShieldStore;
    Map<Integer, ItemArmorTotal>                 sItemArmorTotalStore;
    Map<Integer, ItemBagFamily>                  sItemBagFamilyStore;
    Map<Integer, ItemBonus>                      sItemBonusStore;
    Map<Integer, ItemBonusListLevelDelta>        sItemBonusListLevelDeltaStore;
    Map<Integer, ItemBonusTreeNode>              sItemBonusTreeNodeStore;
    Map<Integer, ItemChildEquipment>             sItemChildEquipmentStore;
    Map<Integer, ItemClass>                      sItemClassStore;
    Map<Integer, ItemContextPickerEntry>         sItemContextPickerStore;
    Map<Integer, ItemCurrencyCost>               sItemCurrencyCostStore;
    Map<Integer, ItemDamageAmmo>                 sItemDamageAmmoStore;
    Map<Integer, ItemDamageOneHand>              sItemDamageOneHandStore;
    Map<Integer, ItemDamageOneHandCaster>        sItemDamageOneHandCasterStore;
    Map<Integer, ItemDamageTwoHand>              sItemDamageTwoHandStore;
    Map<Integer, ItemDamageTwoHandCaster>        sItemDamageTwoHandCasterStore;
    Map<Integer, ItemDisenchantLoot>             sItemDisenchantLootStore;
    Map<Integer, ItemEffect>                     sItemEffectStore;
    Map<Integer, Item>                           sItemStore;
    Map<Integer, ItemExtendedCost>               sItemExtendedCostStore;
    Map<Integer, ItemLevelSelector>              sItemLevelSelectorStore;
    Map<Integer, ItemLevelSelectorQuality>       sItemLevelSelectorQualityStore;
    Map<Integer, ItemLevelSelectorQualitySet>    sItemLevelSelectorQualitySetStore;
    Map<Integer, ItemLimitCategory>              sItemLimitCategoryStore;
    Map<Integer, ItemLimitCategoryCondition>     sItemLimitCategoryConditionStore;
    Map<Integer, ItemModifiedAppearance>         sItemModifiedAppearanceStore;
    Map<Integer, ItemModifiedAppearanceExtra>    sItemModifiedAppearanceExtraStore;
    Map<Integer, ItemNameDescription>            sItemNameDescriptionStore;
    Map<Integer, ItemPriceBase>                  sItemPriceBaseStore;
    Map<Integer, ItemReforge>                    sItemReforgeStore;
    Map<Integer, ItemSearchName>                 sItemSearchNameStore;
    Map<Integer, ItemSet>                        sItemSetStore;
    Map<Integer, ItemSetSpell>                   sItemSetSpellStore;
    Map<Integer, ItemSparse>                     sItemSparseStore;
    Map<Integer, ItemXBonusTree>                 sItemXBonusTreeStore;
    Map<Integer, JournalEncounter>               sJournalEncounterStore;
    Map<Integer, JournalEncounterSection>        sJournalEncounterSectionStore;
    Map<Integer, JournalInstance>                sJournalInstanceStore;
    Map<Integer, JournalTier>                    sJournalTierStore;
    Map<Integer, Keychain>                       sKeychainStore;
    Map<Integer, KeystoneAffix>                  sKeystoneAffixStore;
    Map<Integer, LanguageWord>                   sLanguageWordsStore;
    Map<Integer, Language>                       sLanguagesStore;
    Map<Integer, LfgDungeon>                     sLFGDungeonsStore;
    Map<Integer, Light>                          sLightStore;
    Map<Integer, LiquidType>                     sLiquidTypeStore;
    Map<Integer, Location>                       sLocationStore;
    Map<Integer, Lock>                           sLockStore;
    Map<Integer, MailTemplate>                   sMailTemplateStore;
    Map<Integer, Map>                            sMapStore;
    Map<Integer, MapChallengeMode>               sMapChallengeModeStore;
    Map<Integer, MapDifficulty>                  sMapDifficultyStore;
    Map<Integer, MapDifficultyXCondition>        sMapDifficultyXConditionStore;
    Map<Integer, ModifierTree>                   sModifierTreeStore;
    Map<Integer, MountCapability>                sMountCapabilityStore;
    Map<Integer, Mount>                          sMountStore;
    Map<Integer, MountTypeXCapability>           sMountTypeXCapabilityStore;
    Map<Integer, MountXDisplay>                  sMountXDisplayStore;
    Map<Integer, Movie>                          sMovieStore;
    Map<Integer, MythicPlusSeason>               sMythicPlusSeasonStore;
    Map<Integer, NameGen>                        sNameGenStore;
    Map<Integer, NamesProfanity>                 sNamesProfanityStore;
    Map<Integer, NamesReserved>                  sNamesReservedStore;
    Map<Integer, NamesReservedLocale>            sNamesReservedLocaleStore;
    Map<Integer, NumTalentsAtLevel>              sNumTalentsAtLevelStore;
    Map<Integer, OverrideSpellDatum>             sOverrideSpellDataStore;
    Map<Integer, ParagonReputation>              sParagonReputationStore;
    Map<Integer, Path>                           sPathStore;
    Map<Integer, PathNode>                       sPathNodeStore;
    Map<Integer, PathProperty>                   sPathPropertyStore;
    Map<Integer, Phase>                          sPhaseStore;
    Map<Integer, PhaseXPhaseGroup>               sPhaseXPhaseGroupStore;
    Map<Integer, PlayerCondition>                sPlayerConditionStore;
    Map<Integer, PowerDisplay>                   sPowerDisplayStore;
    Map<Integer, PowerType>                      sPowerTypeStore;
    Map<Integer, PrestigeLevelInfo>              sPrestigeLevelInfoStore;
    Map<Integer, PvpDifficulty>                  sPVPDifficultyStore;
    Map<Integer, PvpItem>                        sPVPItemStore;
    Map<Integer, PvpSeason>                      sPvpSeasonStore;
    Map<Integer, PvpTier>                        sPvpTierStore;
    Map<Integer, QuestFactionReward>             sQuestFactionRewardStore;
    Map<Integer, QuestInfo>                      sQuestInfoStore;
    Map<Integer, QuestLineXQuest>                sQuestLineXQuestStore;
    Map<Integer, QuestMoneyReward>               sQuestMoneyRewardStore;
    Map<Integer, QuestPackageItem>               sQuestPackageItemStore;
    Map<Integer, QuestSort>                      sQuestSortStore;
    Map<Integer, QuestV2>                        sQuestV2Store;
    Map<Integer, QuestXp>                        sQuestXPStore;
    Map<Integer, RandPropPoint>                  sRandPropPointsStore;
    Map<Integer, RewardPack>                     sRewardPackStore;
    Map<Integer, RewardPackXCurrencyType>        sRewardPackXCurrencyTypeStore;
    Map<Integer, RewardPackXItem>                sRewardPackXItemStore;
    Map<Integer, Scenario>                       sScenarioStore;
    Map<Integer, ScenarioStep>                   sScenarioStepStore;
    Map<Integer, SceneScript>                    sSceneScriptStore;
    Map<Integer, SceneScriptGlobalText>          sSceneScriptGlobalTextStore;
    Map<Integer, SceneScriptPackage>             sSceneScriptPackageStore;
    Map<Integer, SceneScriptText>                sSceneScriptTextStore;
    Map<Integer, ServerMessage>                  sServerMessagesStore;
    Map<Integer, SkillLine>                      sSkillLineStore;
    Map<Integer, SkillLineAbility>               sSkillLineAbilityStore;
    Map<Integer, SkillRaceClassInfo>             sSkillRaceClassInfoStore;
    Map<Integer, SoundKit>                       sSoundKitStore;
    Map<Integer, SpellAuraOption>                sSpellAuraOptionsStore;
    Map<Integer, SpellAuraRestriction>           sSpellAuraRestrictionsStore;
    Map<Integer, SpellCastTime>                  sSpellCastTimesStore;
    Map<Integer, SpellCastingRequirement>        sSpellCastingRequirementsStore;
    Map<Integer, SpellCategories>                sSpellCategoriesStore;
    Map<Integer, SpellCategory>                  sSpellCategoryStore;
    Map<Integer, SpellClassOption>               sSpellClassOptionsStore;
    Map<Integer, SpellCooldown>                  sSpellCooldownsStore;
    Map<Integer, SpellDuration>                  sSpellDurationStore;
    Map<Integer, SpellEffect>                    sSpellEffectStore;
    Map<Integer, SpellEquippedItem>              sSpellEquippedItemsStore;
    Map<Integer, SpellFocusObject>               sSpellFocusObjectStore;
    Map<Integer, SpellInterrupt>                 sSpellInterruptsStore;
    Map<Integer, SpellItemEnchantment>           sSpellItemEnchantmentStore;
    Map<Integer, SpellItemEnchantmentCondition>  sSpellItemEnchantmentConditionStore;
    Map<Integer, SpellKeyboundOverride>          sSpellKeyboundOverrideStore;
    Map<Integer, SpellLabel>                     sSpellLabelStore;
    Map<Integer, SpellLearnSpell>                sSpellLearnSpellStore;
    Map<Integer, SpellLevel>                     sSpellLevelsStore;
    Map<Integer, SpellMisc>                      sSpellMiscStore;
    Map<Integer, SpellName>                      sSpellNameStore;
    Map<Integer, SpellPower>                     sSpellPowerStore;
    Map<Integer, SpellPowerDifficulty>           sSpellPowerDifficultyStore;
    Map<Integer, SpellProcsPerMinute>            sSpellProcsPerMinuteStore;
    Map<Integer, SpellProcsPerMinuteMod>         sSpellProcsPerMinuteModStore;
    Map<Integer, SpellRadius>                    sSpellRadiusStore;
    Map<Integer, SpellRange>                     sSpellRangeStore;
    Map<Integer, SpellReagent>                   sSpellReagentsStore;
    Map<Integer, SpellReagentsCurrency>          sSpellReagentsCurrencyStore;
    Map<Integer, SpellScaling>                   sSpellScalingStore;
    Map<Integer, SpellShapeshift>                sSpellShapeshiftStore;
    Map<Integer, SpellShapeshiftForm>            sSpellShapeshiftFormStore;
    Map<Integer, SpellTargetRestriction>         sSpellTargetRestrictionsStore;
    Map<Integer, SpellTotem>                     sSpellTotemsStore;
    Map<Integer, SpellVisual>                    sSpellVisualStore;
    Map<Integer, SpellVisualEffectName>          sSpellVisualEffectNameStore;
    Map<Integer, SpellVisualMissile>             sSpellVisualMissileStore;
    Map<Integer, SpellVisualKit>                 sSpellVisualKitStore;
    Map<Integer, SpellXSpellVisual>              sSpellXSpellVisualStore;
    Map<Integer, SummonProperty>                 sSummonPropertiesStore;
    Map<Integer, TactKey>                        sTactKeyStore;
    Map<Integer, Talent>                         sTalentStore;
    Map<Integer, TalentTab>                      sTalentTabStore;
    Map<Integer, TalentTreePrimarySpell>         sTalentTreePrimarySpellsStore;
    Map<Integer, TaxiNode>                       sTaxiNodesStore;
    Map<Integer, TaxiPath>                       sTaxiPathStore;
    Map<Integer, TaxiPathNode>                   sTaxiPathNodeStore;
    Map<Integer, TotemCategory>                  sTotemCategoryStore;
    Map<Integer, Toy>                            sToyStore;
    Map<Integer, TransmogHoliday>                sTransmogHolidayStore;
    Map<Integer, TransmogSet>                    sTransmogSetStore;
    Map<Integer, TransmogSetGroup>               sTransmogSetGroupStore;
    Map<Integer, TransmogSetItem>                sTransmogSetItemStore;
    Map<Integer, TransportAnimation>             sTransportAnimationStore;
    Map<Integer, TransportRotation>              sTransportRotationStore;
    Map<Integer, UiMap>                          sUiMapStore;
    Map<Integer, UiMapAssignment>                sUiMapAssignmentStore;
    Map<Integer, UiMapLink>                      sUiMapLinkStore;
    Map<Integer, UiMapXMapArt>                   sUiMapXMapArtStore;
    Map<Integer, UnitCondition>                  sUnitConditionStore;
    Map<Integer, UnitPowerBar>                   sUnitPowerBarStore;
    Map<Integer, Vehicle>                        sVehicleStore;
    Map<Integer, VehicleSeat>                    sVehicleSeatStore;
    Map<Integer, Vignette>                       sVignetteStore;
    Map<Integer, WmoAreaTable>                   sWMOAreaTableStore;
    Map<Integer, WorldEffect>                    sWorldEffectStore;
    Map<Integer, WorldMapOverlay>                sWorldMapOverlayStore;
    Map<Integer, WorldStateExpression>           sWorldStateExpressionStore;


    private CacheProvider cacheProvider;


}
