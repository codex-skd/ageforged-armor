# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor  (2026-07-24)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 857 nodes · 1853 edges · 88 communities (64 shown, 24 thin omitted)
- Extraction: 96% EXTRACTED · 4% INFERRED · 0% AMBIGUOUS · INFERRED: 81 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- ModelProviderRegistry.java
- HatItem.java
- .sinPI
- HumanoidRenderState
- ArmorSetEffectHandler
- AgeforgedArmor.java
- PatronConfig
- ChestQuetzalcoatlArmorModel
- PreferredModel
- OYoroiSkin
- AgeforgedArmorLootModifier.java
- ArmorMaterialRegistry
- AOTAConfig.java
- NeoForgePacketHandlers.java
- ArmorModel
- ChestCenturionArmorModel
- ChestExaltedAurumArmorModel
- LegsExaltedAurumArmorModel
- ChestIronPlateArmorModel
- ChestJapaneseLightArmorModel
- ChestOYoroiArmorModel
- ChestPharaohArmorModel
- ChestRaijinArmorModel
- HeadRaijinArmorModel
- LegsRaijinArmorModel
- ItemRegistry.java
- AotAMaterials.java
- FeetAnubisArmorModel
- LegsAnubisArmorModel
- FeetCenturionArmorModel
- HeadCenturionArmorModel
- LegsCenturionArmorModel
- FeetExaltedAurumArmorModel
- HeadExaltedAurumArmorModel
- LegsHolyArmorModel
- FeetIronPlateArmorModel
- HeadIronPlateArmorModel
- LegsIronPlateArmorModel
- FeetJapaneseLightArmorModel
- HeadJapaneseLightArmorModel
- LegsJapaneseLightArmorModel
- FeetOYoroiArmorModel
- HeadOYoroiArmorModel
- FeetPharaohArmorModel
- HeadPharaohArmorModel
- LegsPharaohArmorModel
- FeetQuetzalcoatlArmorModel
- HeadQuetzalcoatlArmorModel
- LegsQuetzalcoatlArmorModel
- FeetRaijinArmorModel
- GlobalPreferenceSyncPayload
- GlobalSkinSyncPayload
- SkinSyncPayload
- CustomPacketPayload
- LootModifierProvider.java
- .templateLayerDefinition
- HeadAnubisArmorModel
- LootModifiers.java
- DisableSkinSyncPayload
- PatronTierPayload
- PreferenceSyncPayload
- AgeforgedArmorClient.java
- AotATags.java
- gradlew
- NeoForgePayloadRegistry.java
- HumanoidRenderState
- CallbackInfo
- Identifier
- Inject
- Mixin
- PoseStack
- SubmitNodeCollector
- Unique
- CallbackInfo
- EquipmentSlot
- HumanoidModel
- HumanoidRenderState
- Inject
- ItemStack
- Logger
- Mixin
- ModelPart
- PoseStack
- SubmitNodeCollector
- Unique
- SuppressWarnings

## God Nodes (most connected - your core abstractions)
1. `ArmorModel` - 136 edges
2. `ArmorModelProvider` - 28 edges
3. `SkinSyncState` - 26 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `PreferredModel` - 15 edges
7. `MixedArmorModelProvider` - 14 edges
8. `GlobalPreferenceSyncPayload` - 14 edges
9. `GlobalSkinSyncPayload` - 14 edges
10. `SkinSyncPayload` - 14 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --inherits--> `ItemRegistry`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/ItemRegistry.java
- `CommonClass` --references--> `PreferredModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/CommonClass.java → src/main/java/com/skd/ageforgedarmor/config/PreferredModel.java
- `CommonClass` --references--> `SkinSyncState`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/CommonClass.java → src/main/java/com/skd/ageforgedarmor/config/SkinSyncState.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `OYoroiSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/OYoroiSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (88 total, 24 thin omitted)

### Community 0 - "ModelProviderRegistry.java"
Cohesion: 0.06
Nodes (50): ModelLayerLocation, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, Entity, EquipmentSlot, Identifier, LayerDefinition, NotNull (+42 more)

### Community 1 - "HatItem.java"
Cohesion: 0.06
Nodes (38): ChatFormatting, InteractionHand, InteractionResult, Item, ItemAttributeModifiers, Items, Level, MutableComponent (+30 more)

### Community 2 - ".sinPI"
Cohesion: 0.08
Nodes (15): ChestAnubisArmorModel, ModelPart, Override, ChestHolyArmorModel, LayerDefinition, ModelPart, Override, FeetHolyArmorModel (+7 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.16
Nodes (23): AbstractClientPlayer, CallbackInfo, EquipmentSlot, HumanoidArmorLayer, HumanoidModel, HumanoidRenderState, Identifier, Inject (+15 more)

### Community 4 - "ArmorSetEffectHandler"
Cohesion: 0.28
Nodes (6): MobEffect, ArmorSetEffectHandler, EquipmentSlot, Holder, ItemStack, Player

### Community 5 - "AgeforgedArmor.java"
Cohesion: 0.14
Nodes (17): CreativeModeTab, Mod, ModContainer, ObjectArrayList, Post, Server, AgeforgedArmor, ItemRegistryImpl (+9 more)

### Community 6 - "PatronConfig"
Cohesion: 0.14
Nodes (11): Gson, PlayerLoggedInEvent, Logger, PatronConfig, PatronData, PatronEntry, Logger, PatronFetcher (+3 more)

### Community 7 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.16
Nodes (8): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel, ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 8 - "PreferredModel"
Cohesion: 0.20
Nodes (7): MinecraftServer, PreferredModel, FEMALE, MALE, ForgeConfigSyncNetworkHandler, Override, ServerPlayer

### Community 9 - "OYoroiSkin"
Cohesion: 0.14
Nodes (13): getTexturePrefix(), Override, OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK (+5 more)

### Community 10 - "AgeforgedArmorLootModifier.java"
Cohesion: 0.27
Nodes (9): LootContext, LootItemCondition, LootModifier, AgeforgedArmorLootModifier, IGlobalLootModifier, ItemStack, MapCodec, NotNull (+1 more)

### Community 11 - "ArmorMaterialRegistry"
Cohesion: 0.22
Nodes (8): ArmorMaterialRegistry, ArmorMaterial, Holder, Identifier, ArmorMaterialRegistryNeoForge, ArmorMaterial, Holder, Override

### Community 12 - "AOTAConfig.java"
Cohesion: 0.22
Nodes (6): ConfigClassHandler, ClientPatronState, AOTAConfig, Constants, LootTablesToModify, YetAnotherConfigLib

### Community 14 - "ArmorModel"
Cohesion: 0.27
Nodes (4): ModelPart, ArmorModel, ModelPart, Override

### Community 15 - "ChestCenturionArmorModel"
Cohesion: 0.31
Nodes (4): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 16 - "ChestExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 17 - "LegsExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsExaltedAurumArmorModel

### Community 18 - "ChestIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "ChestJapaneseLightArmorModel"
Cohesion: 0.31
Nodes (4): ChestJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "ChestOYoroiArmorModel"
Cohesion: 0.31
Nodes (4): ChestOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "ChestPharaohArmorModel"
Cohesion: 0.31
Nodes (4): ChestPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "ChestRaijinArmorModel"
Cohesion: 0.33
Nodes (4): ChestRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 24 - "LegsRaijinArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 25 - "ItemRegistry.java"
Cohesion: 0.36
Nodes (6): ItemRegistry, ArmorMaterial, ArmorType, Holder, Item, Logger

### Community 26 - "AotAMaterials.java"
Cohesion: 0.36
Nodes (6): EquipmentAsset, ResourceKey, AotAMaterials, ArmorMaterial, ArmorType, Holder

### Community 27 - "FeetAnubisArmorModel"
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 28 - "LegsAnubisArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 29 - "FeetCenturionArmorModel"
Cohesion: 0.33
Nodes (4): FeetCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 30 - "HeadCenturionArmorModel"
Cohesion: 0.33
Nodes (4): HeadCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 31 - "LegsCenturionArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 32 - "FeetExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "HeadExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): HeadExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 34 - "LegsHolyArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 35 - "FeetIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 36 - "HeadIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 37 - "LegsIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 38 - "FeetJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 39 - "HeadJapaneseLightArmorModel"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 40 - "LegsJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 41 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 42 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 43 - "FeetPharaohArmorModel"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 44 - "HeadPharaohArmorModel"
Cohesion: 0.36
Nodes (4): HeadPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 45 - "LegsPharaohArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 46 - "FeetQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): FeetQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 47 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 48 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 49 - "FeetRaijinArmorModel"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 50 - "GlobalPreferenceSyncPayload"
Cohesion: 0.36
Nodes (5): GlobalPreferenceSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 51 - "GlobalSkinSyncPayload"
Cohesion: 0.36
Nodes (5): GlobalSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 52 - "SkinSyncPayload"
Cohesion: 0.36
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, SkinSyncPayload

### Community 53 - "CustomPacketPayload"
Cohesion: 0.43
Nodes (6): CustomPacketPayload, DisablePreferencesPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 54 - "LootModifierProvider.java"
Cohesion: 0.32
Nodes (5): GlobalLootModifierProvider, PackOutput, Provider, Override, LootModifierProvider

### Community 56 - "HeadAnubisArmorModel"
Cohesion: 0.52
Nodes (3): HeadAnubisArmorModel, ModelPart, Override

### Community 57 - "LootModifiers.java"
Cohesion: 0.48
Nodes (5): DeferredRegister, IEventBus, IGlobalLootModifier, MapCodec, LootModifiers

### Community 58 - "DisableSkinSyncPayload"
Cohesion: 0.43
Nodes (5): DisableSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 59 - "PatronTierPayload"
Cohesion: 0.43
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, PatronTierPayload

### Community 60 - "PreferenceSyncPayload"
Cohesion: 0.43
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, PreferenceSyncPayload

### Community 61 - "AgeforgedArmorClient.java"
Cohesion: 0.33
Nodes (3): LoggingIn, RegisterLayerDefinitions, AgeforgedArmorClient

### Community 62 - "AotATags.java"
Cohesion: 0.60
Nodes (4): AotATags, Items, Item, TagKey

### Community 63 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **24 isolated node(s):** `AotATags`, `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON` (+19 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **24 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `ModelProviderRegistry.java`, `.sinPI`, `HumanoidRenderState`, `ChestQuetzalcoatlArmorModel`, `ChestCenturionArmorModel`, `ChestExaltedAurumArmorModel`, `LegsExaltedAurumArmorModel`, `ChestIronPlateArmorModel`, `ChestJapaneseLightArmorModel`, `ChestOYoroiArmorModel`, `ChestPharaohArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `LegsRaijinArmorModel`, `FeetAnubisArmorModel`, `LegsAnubisArmorModel`, `FeetCenturionArmorModel`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `LegsHolyArmorModel`, `FeetIronPlateArmorModel`, `HeadIronPlateArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `LegsJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `FeetPharaohArmorModel`, `HeadPharaohArmorModel`, `LegsPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `.templateLayerDefinition`, `HeadAnubisArmorModel`?**
  _High betweenness centrality (0.451) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `ModelProviderRegistry.java` to `OYoroiSkin`, `HumanoidRenderState`, `ArmorModel`, `HatItem.java`?**
  _High betweenness centrality (0.105) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `ModelProviderRegistry.java` to `HatItem.java`, `PreferredModel`, `OYoroiSkin`, `GlobalSkinSyncPayload`, `SkinSyncPayload`?**
  _High betweenness centrality (0.092) - this node is a cross-community bridge._
- **What connects `AotATags`, `Constants`, `ClientPatronState` to the rest of the system?**
  _24 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `ModelProviderRegistry.java` be split into smaller, more focused modules?**
  _Cohesion score 0.05510388437217705 - nodes in this community are weakly interconnected._
- **Should `HatItem.java` be split into smaller, more focused modules?**
  _Cohesion score 0.06153846153846154 - nodes in this community are weakly interconnected._
- **Should `.sinPI` be split into smaller, more focused modules?**
  _Cohesion score 0.08367071524966262 - nodes in this community are weakly interconnected._