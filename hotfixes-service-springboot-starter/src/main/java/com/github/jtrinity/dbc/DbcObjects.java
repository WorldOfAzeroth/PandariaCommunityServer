package com.github.jtrinity.dbc;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.dbc.domain.*;

public enum DbcObjects {
    Achievement(Achievement.class),
    AchievementCategory(AchievementCategory.class),
    AdventureJournal(AdventureJournal.class),
    AdventureMapPoi(AdventureMapPoi.class),
    AnimationData(AnimationData.class),
    AnimKit(AnimKit.class),
    AreaGroupMember(AreaGroupMember.class),
    AreaTable(AreaTable.class),
    AreaTrigger(AreaTrigger.class),
    AreaTriggerActionSet(AreaTriggerActionSet.class),
    ArmorLocation(ArmorLocation.class),
    Artifact(Artifact.class),
    ArtifactAppearance(ArtifactAppearance.class),
    ArtifactAppearanceSet(ArtifactAppearanceSet.class),
    ArtifactCategory(ArtifactCategory.class),
    ArtifactPower(ArtifactPower.class),
    ArtifactPowerLink(ArtifactPowerLink.class),
    ArtifactPowerPicker(ArtifactPowerPicker.class),
    ArtifactPowerRank(ArtifactPowerRank.class),
    ArtifactQuestXp(ArtifactQuestXp.class),
    ArtifactTier(ArtifactTier.class),
    ArtifactUnlock(ArtifactUnlock.class),
    AuctionHouse(AuctionHouse.class),
    BankBagSlotPrice(BankBagSlotPrice.class),
    BannedAddon(BannedAddon.class),
    BarberShopStyle(BarberShopStyle.class),
    BattlePetAbility(BattlePetAbility.class),
    BattlePetBreedQuality(BattlePetBreedQuality.class),
    BattlePetBreedState(BattlePetBreedState.class),
    BattlePetSpecie(BattlePetSpecie.class),
    BattlePetSpeciesState(BattlePetSpeciesState.class),
    BattleMasterList(BattleMasterList.class),
    BroadcastText(BroadcastText.class),
    CfgCategory(CfgCategory.class),
    CfgRegion(CfgRegion.class),
    CharacterFacialHairStyle(CharacterFacialHairStyle.class),
    CharBaseSection(CharBaseSection.class),
    CharSection(CharSection.class),
    CharStartOutfit(CharStartOutfit.class),
    CharTitle(CharTitle.class),
    ChatChannel(ChatChannel.class),
    ChrClass(ChrClass.class),
    ChrClassesXPowerType(ChrClassesXPowerType.class),
    ChrRace(ChrRace.class),
    ChrSpecialization(ChrSpecialization.class),
    CinematicCamera(CinematicCamera.class),
    CinematicSequence(CinematicSequence.class),
    ConversationLine(ConversationLine.class),
    CreatureDisplayInfo(CreatureDisplayInfo.class),
    CreatureDisplayInfoExtra(CreatureDisplayInfoExtra.class),
    CreatureFamily(CreatureFamily.class),
    CreatureModelData(CreatureModelData.class),
    CreatureType(CreatureType.class),
    Criteria(Criteria.class),
    CriteriaTree(CriteriaTree.class),
    CurrencyType(CurrencyType.class),
    Curve(Curve.class),
    CurvePoint(CurvePoint.class),
    DestructibleModelData(DestructibleModelData.class),
    Difficulty(Difficulty.class),
    DungeonEncounter(DungeonEncounter.class),
    DurabilityCost(DurabilityCost.class),
    DurabilityQuality(DurabilityQuality.class),
    Emote(Emote.class),
    EmotesText(EmotesText.class),
    EmotesTextSound(EmotesTextSound.class),
    Faction(Faction.class),
    FactionTemplate(FactionTemplate.class),
    GameObjectArtKit(GameObjectArtKit.class),
    FriendshipRepReaction(FriendshipRepReaction.class),
    FriendshipReputation(FriendshipReputation.class),
    GameObjectDisplayInfo(GameObjectDisplayInfo.class),
    GameObject(GameObject.class),
    GarrAbility(GarrAbility.class),
    GarrBuilding(GarrBuilding.class),
    GarrBuildingPlotInst(GarrBuildingPlotInst.class),
    GarrClassSpec(GarrClassSpec.class),
    GarrFollower(GarrFollower.class),
    GarrFollowerXAbility(GarrFollowerXAbility.class),
    GarrPlot(GarrPlot.class),
    GarrPlotBuilding(GarrPlotBuilding.class),
    GarrPlotInstance(GarrPlotInstance.class),
    GarrSiteLevel(GarrSiteLevel.class),
    GarrSiteLevelPlotInst(GarrSiteLevelPlotInst.class),
    GarrTalentTree(GarrTalentTree.class),
    GemProperty(GemProperty.class),
    GlyphBindableSpell(GlyphBindableSpell.class),
    GlyphProperty(GlyphProperty.class),
    GlyphRequiredSpec(GlyphRequiredSpec.class),
    GuildColorBackground(GuildColorBackground.class),
    GuildColorBorder(GuildColorBorder.class),
    GuildColorEmblem(GuildColorEmblem.class),
    GuildPerkSpell(GuildPerkSpell.class),
    Heirloom(Heirloom.class),
    Holiday(Holiday.class),
    ImportPriceArmor(ImportPriceArmor.class),
    ImportPriceQuality(ImportPriceQuality.class),
    ImportPriceShield(ImportPriceShield.class),
    ImportPriceWeapon(ImportPriceWeapon.class),
    ItemAppearance(ItemAppearance.class),
    ItemArmorQuality(ItemArmorQuality.class),
    ItemArmorShield(ItemArmorShield.class),
    ItemArmorTotal(ItemArmorTotal.class),
    ItemBagFamily(ItemBagFamily.class),
    ItemBonus(ItemBonus.class),
    ItemBonusListLevelDelta(ItemBonusListLevelDelta.class),
    ItemBonusTreeNode(ItemBonusTreeNode.class),
    ItemChildEquipment(ItemChildEquipment.class),
    ItemClass(ItemClass.class),
    ItemCurrencyCost(ItemCurrencyCost.class),
    ItemDamageAmmo(ItemDamageAmmo.class),
    ItemDamageOneHand(ItemDamageOneHand.class),
    ItemDamageOneHandCaster(ItemDamageOneHandCaster.class),
    ItemDamageTwoHand(ItemDamageTwoHand.class),
    ItemDamageTwoHandCaster(ItemDamageTwoHandCaster.class),
    ItemDisenchantLoot(ItemDisenchantLoot.class),
    ItemEffect(ItemEffect.class),
    Item(Item.class),
    ItemExtendedCost(ItemExtendedCost.class),
    ItemLevelSelector(ItemLevelSelector.class),
    ItemLevelSelectorQuality(ItemLevelSelectorQuality.class),
    ItemLevelSelectorQualitySet(ItemLevelSelectorQualitySet.class),
    ItemLimitCategory(ItemLimitCategory.class),
    ItemLimitCategoryCondition(ItemLimitCategoryCondition.class),
    ItemModifiedAppearance(ItemModifiedAppearance.class),
    ItemModifiedAppearanceExtra(ItemModifiedAppearanceExtra.class),
    ItemNameDescription(ItemNameDescription.class),
    ItemPriceBase(ItemPriceBase.class),
    ItemRandomPropertie(ItemRandomProperty.class),
    ItemRandomSuffix(ItemRandomSuffix.class),
    ItemSearchName(ItemSearchName.class),
    ItemSet(ItemSet.class),
    ItemSetSpell(ItemSetSpell.class),
    ItemSparse(ItemSparse.class),
    ItemSpec(ItemSpec.class),
    ItemSpecOverride(ItemSpecOverride.class),
    ItemUpgrade(ItemUpgrade.class),
    ItemXBonusTree(ItemXBonusTree.class),
    JournalEncounter(JournalEncounter.class),
    JournalEncounterSection(JournalEncounterSection.class),
    JournalEncounterItem(JournalEncounterItem.class),
    JournalInstance(JournalInstance.class),
    JournalTier(JournalTier.class),
    Keychain(Keychain.class),
    KeystoneAffix(KeystoneAffix.class),
    LanguageWord(LanguageWord.class),
    Language(Language.class),
    LfgDungeon(LfgDungeon.class),
    Light(Light.class),
    LiquidType(LiquidType.class),
    Location(Location.class),
    Lock(Lock.class),
    MailTemplate(MailTemplate.class),
    Map(MapEntity.class),
    MapChallengeMode(MapChallengeMode.class),
    MapDifficulty(MapDifficulty.class),
    MapDifficultyXCondition(MapDifficultyXCondition.class),
    ModifierTree(ModifierTree.class),
    MountCapability(MountCapability.class),
    Mount(Mount.class),
    MountTypeXCapability(MountTypeXCapability.class),
    MountXDisplay(MountXDisplay.class),
    Movie(Movie.class),
    NameGen(NameGen.class),
    NamesProfanity(NamesProfanity.class),
    NamesReserved(NamesReserved.class),
    NamesReservedLocale(NamesReservedLocale.class),
    OverrideSpellData(OverrideSpellData.class),
    ParagonReputation(ParagonReputation.class),
    Path(Path.class),
    PathNode(PathNode.class),
    PathProperty(PathProperty.class),
    Phase(Phase.class),
    PhaseXPhaseGroup(PhaseXPhaseGroup.class),
    PlayerCondition(PlayerCondition.class),
    PowerDisplay(PowerDisplay.class),
    PowerType(PowerType.class),
    PrestigeLevelInfo(PrestigeLevelInfo.class),
    PvpDifficulty(PvpDifficulty.class),
    PvpItem(PvpItem.class),
    PvpReward(PvpReward.class),
    PvpTalent(PvpTalent.class),
    PvpTalentUnlock(PvpTalentUnlock.class),
    QuestFactionReward(QuestFactionReward.class),
    QuestInfo(QuestInfo.class),
    QuestMoneyReward(QuestMoneyReward.class),
    QuestPackageItem(QuestPackageItem.class),
    QuestSort(QuestSort.class),
    QuestV2(QuestV2.class),
    QuestXp(QuestXp.class),
    RandPropPoint(RandPropPoint.class),
    RewardPack(RewardPack.class),
    RewardPackXCurrencyType(RewardPackXCurrencyType.class),
    RewardPackXItem(RewardPackXItem.class),
    RulesetItemUpgrade(RulesetItemUpgrade.class),
    SandboxScaling(SandboxScaling.class),
    ScalingStatDistribution(ScalingStatDistribution.class),
    Scenario(Scenario.class),
    ScenarioStep(ScenarioStep.class),
    SceneScript(SceneScript.class),
    SceneScriptGlobalText(SceneScriptGlobalText.class),
    SceneScriptPackage(SceneScriptPackage.class),
    SceneScriptText(SceneScriptText.class),
    ServerMessages(ServerMessage.class),
    SkillLine(SkillLine.class),
    SkillLineAbility(SkillLineAbility.class),
    SkillRaceClassInfo(SkillRaceClassInfo.class),
    SoundKit(SoundKit.class),
    SpecializationSpell(SpecializationSpell.class),
    Spell(Spell.class),
    SpellAuraOption(SpellAuraOption.class),
    SpellAuraRestriction(SpellAuraRestriction.class),
    SpellCastTime(SpellCastTime.class),
    SpellCastingRequirement(SpellCastingRequirement.class),
    SpellCategories(SpellCategories.class),
    SpellCategory(SpellCategory.class),
    SpellClassOption(SpellClassOption.class),
    SpellCooldown(SpellCooldown.class),
    SpellDuration(SpellDuration.class),
    SpellEffect(SpellEffect.class),
    SpellEquippedItem(SpellEquippedItem.class),
    SpellFocusObject(SpellFocusObject.class),
    SpellInterrupt(SpellInterrupt.class),
    SpellItemEnchantment(SpellItemEnchantment.class),
    SpellItemEnchantmentCondition(SpellItemEnchantmentCondition.class),
    SpellKeyboundOverride(SpellKeyboundOverride.class),
    SpellLabel(SpellLabel.class),
    SpellLearnSpell(SpellLearnSpell.class),
    SpellLevel(SpellLevel.class),
    SpellMisc(SpellMisc.class),
    SpellPower(SpellPower.class),
    SpellPowerDifficulty(SpellPowerDifficulty.class),
    SpellProcsPerMinute(SpellProcsPerMinute.class),
    SpellProcsPerMinuteMod(SpellProcsPerMinuteMod.class),
    SpellRadiu(SpellRadius.class),
    SpellRange(SpellRange.class),
    SpellReagent(SpellReagent.class),
    SpellScaling(SpellScaling.class),
    SpellShapeshift(SpellShapeshift.class),
    SpellShapeshiftForm(SpellShapeshiftForm.class),
    SpellTargetRestriction(SpellTargetRestriction.class),
    SpellTotem(SpellTotem.class),
    SpellVisual(SpellVisual.class),
    SpellVisualEffectName(SpellVisualEffectName.class),
    SpellVisualMissile(SpellVisualMissile.class),
    SpellVisualKit(SpellVisualKit.class),
    SpellXSpellVisual(SpellXSpellVisual.class),
    SummonProperty(SummonProperty.class),
    TactKey(TactKey.class),
    Talent(Talent.class),
    TaxiNode(TaxiNode.class),
    TaxiPath(TaxiPath.class),
    TaxiPathNode(TaxiPathNode.class),
    TotemCategory(TotemCategory.class),
    Toy(Toy.class),
    TransmogHoliday(TransmogHoliday.class),
    TransmogSet(TransmogSet.class),
    TransmogSetGroup(TransmogSetGroup.class),
    TransmogSetItem(TransmogSetItem.class),
    TransportAnimation(TransportAnimation.class),
    TransportRotation(TransportRotation.class),
    UnitCondition(UnitCondition.class),
    UnitPowerBar(UnitPowerBar.class),
    Vehicle(Vehicle.class),
    VehicleSeat(VehicleSeat.class),
    Vignette(Vignette.class),
    WmoAreaTable(WmoAreaTable.class),
    WorldEffect(WorldEffect.class),
    WorldMapArea(WorldMapArea.class),
    WorldMapOverlay(WorldMapOverlay.class),
    WorldMapTransform(WorldMapTransform.class),
    WorldSafeLoc(WorldSafeLoc.class),
    WorldStateExpression(WorldStateExpression.class),;

    private final Class<? extends DbcEntity> clazz;

    DbcObjects(Class<? extends DbcEntity> clazz) {
        this.clazz = clazz;
    }


    public Class<? extends DbcEntity> clazz() {
        return clazz;
    }

}