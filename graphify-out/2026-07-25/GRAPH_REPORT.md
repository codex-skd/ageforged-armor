# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor  (2026-07-25)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 855 nodes · 1838 edges · 82 communities (61 shown, 21 thin omitted)
- Extraction: 96% EXTRACTED · 4% INFERRED · 0% AMBIGUOUS · INFERRED: 81 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- HatItem.java
- CustomPacketPayload
- ModelProviderRegistry.java
- .templateLayerDefinition
- MixinHumanoidArmorLayer.java
- .sinPI
- ArmorSetEffectHandler
- AgeforgedArmor.java
- AotAMaterials.java
- PatronConfig
- PreferredModel
- OYoroiSkin
- AgeforgedArmorLootModifier.java
- SkinSyncState
- AOTAConfig.java
- ArmorModel
- HeadAnubisArmorModel
- ChestCenturionArmorModel
- ChestExaltedAurumArmorModel
- ChestIronPlateArmorModel
- ChestJapaneseLightArmorModel
- ChestOYoroiArmorModel
- ChestRaijinArmorModel
- HeadRaijinArmorModel
- LegsRaijinArmorModel
- ItemRegistry.java
- SkinVariant
- LegsAnubisArmorModel
- HeadCenturionArmorModel
- LegsCenturionArmorModel
- FeetExaltedAurumArmorModel
- HeadExaltedAurumArmorModel
- FeetHolyArmorModel
- HeadHolyArmorModel
- LegsHolyArmorModel
- FeetIronPlateArmorModel
- LegsIronPlateArmorModel
- FeetJapaneseLightArmorModel
- HeadJapaneseLightArmorModel
- LegsJapaneseLightArmorModel
- FeetOYoroiArmorModel
- HeadOYoroiArmorModel
- LegsOYoroiArmorModel
- FeetPharaohArmorModel
- HeadPharaohArmorModel
- LegsPharaohArmorModel
- HeadQuetzalcoatlArmorModel
- LegsQuetzalcoatlArmorModel
- FeetRaijinArmorModel
- RaijinSkin.java
- GlobalSkinSyncPayload
- SkinSyncPayload
- LootModifierProvider.java
- PharaohSkin.java
- FeetCenturionArmorModel
- LootModifiers.java
- AgeforgedArmorClient.java
- ArmorMaterialRegistryNeoForge.java
- gradlew
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
- `CommonClass` --references--> `SkinSyncState`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/CommonClass.java → src/main/java/com/skd/ageforgedarmor/config/SkinSyncState.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `CenturionSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/CenturionSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `OYoroiSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/OYoroiSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (82 total, 21 thin omitted)

### Community 0 - "HatItem.java"
Cohesion: 0.07
Nodes (36): ChatFormatting, InteractionHand, InteractionResult, Item, ItemAttributeModifiers, Items, Level, MutableComponent (+28 more)

### Community 1 - "CustomPacketPayload"
Cohesion: 0.07
Nodes (31): CustomPacketPayload, IPayloadContext, RegisterPayloadHandlersEvent, ClientPatronState, NeoForgePacketHandlers, NeoForgePayloadRegistry, DisablePreferencesPayload, FriendlyByteBuf (+23 more)

### Community 2 - "ModelProviderRegistry.java"
Cohesion: 0.11
Nodes (25): HumanoidRenderState, ModelLayerLocation, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, Entity, EquipmentSlot, Identifier, LayerDefinition (+17 more)

### Community 3 - ".templateLayerDefinition"
Cohesion: 0.07
Nodes (19): LayerDefinition, LayerDefinition, LayerDefinition, LayerDefinition, ModelPart, Override, LegsExaltedAurumArmorModel, ChestHolyArmorModel (+11 more)

### Community 4 - "MixinHumanoidArmorLayer.java"
Cohesion: 0.14
Nodes (23): AbstractClientPlayer, CallbackInfo, EquipmentSlot, HumanoidArmorLayer, HumanoidModel, Identifier, Inject, ItemStack (+15 more)

### Community 5 - ".sinPI"
Cohesion: 0.11
Nodes (11): ChestAnubisArmorModel, ModelPart, Override, HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override, FeetQuetzalcoatlArmorModel (+3 more)

### Community 6 - "ArmorSetEffectHandler"
Cohesion: 0.28
Nodes (6): MobEffect, ArmorSetEffectHandler, EquipmentSlot, Holder, ItemStack, Player

### Community 7 - "AgeforgedArmor.java"
Cohesion: 0.12
Nodes (18): CreativeModeTab, Mod, ModContainer, ObjectArrayList, Post, Server, AgeforgedArmor, ItemRegistryImpl (+10 more)

### Community 8 - "AotAMaterials.java"
Cohesion: 0.14
Nodes (14): EquipmentAsset, ResourceKey, AotAMaterials, ArmorMaterial, ArmorType, Holder, AotATags, Items (+6 more)

### Community 9 - "PatronConfig"
Cohesion: 0.14
Nodes (11): Gson, PlayerLoggedInEvent, Logger, PatronConfig, PatronData, PatronEntry, Logger, PatronFetcher (+3 more)

### Community 10 - "PreferredModel"
Cohesion: 0.20
Nodes (7): CommonClass, Player, PreferredModel, FEMALE, MALE, ConfigSyncNetworkHandler, ServerPlayer

### Community 11 - "OYoroiSkin"
Cohesion: 0.14
Nodes (13): getTexturePrefix(), Override, OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK (+5 more)

### Community 12 - "AgeforgedArmorLootModifier.java"
Cohesion: 0.27
Nodes (9): LootContext, LootItemCondition, LootModifier, AgeforgedArmorLootModifier, IGlobalLootModifier, ItemStack, MapCodec, NotNull (+1 more)

### Community 13 - "SkinSyncState"
Cohesion: 0.25
Nodes (5): MinecraftServer, SkinSyncState, ForgeConfigSyncNetworkHandler, Override, ServerPlayer

### Community 14 - "AOTAConfig.java"
Cohesion: 0.22
Nodes (8): ConfigClassHandler, AOTAConfig, CenturionSkin, DEFAULT, SILVER_PATREON, getTexturePrefix(), Override, toString()

### Community 15 - "ArmorModel"
Cohesion: 0.31
Nodes (5): FeetAnubisArmorModel, ModelPart, Override, ArmorModel, Override

### Community 16 - "HeadAnubisArmorModel"
Cohesion: 0.33
Nodes (4): HeadAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 17 - "ChestCenturionArmorModel"
Cohesion: 0.31
Nodes (4): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 18 - "ChestExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "ChestIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "ChestJapaneseLightArmorModel"
Cohesion: 0.31
Nodes (4): ChestJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "ChestOYoroiArmorModel"
Cohesion: 0.31
Nodes (4): ChestOYoroiArmorModel, LayerDefinition, ModelPart, Override

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

### Community 26 - "SkinVariant"
Cohesion: 0.25
Nodes (7): SkinVariant, getTexturePrefix(), IronPlateSkin, ASHES, DEFAULT, Override, toString()

### Community 27 - "LegsAnubisArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 28 - "HeadCenturionArmorModel"
Cohesion: 0.33
Nodes (4): HeadCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 29 - "LegsCenturionArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 30 - "FeetExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 31 - "HeadExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): HeadExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 32 - "FeetHolyArmorModel"
Cohesion: 0.36
Nodes (4): FeetHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "HeadHolyArmorModel"
Cohesion: 0.36
Nodes (4): HeadHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 34 - "LegsHolyArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 35 - "FeetIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 36 - "LegsIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 37 - "FeetJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "HeadJapaneseLightArmorModel"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 39 - "LegsJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 40 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 41 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 42 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

### Community 43 - "FeetPharaohArmorModel"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 44 - "HeadPharaohArmorModel"
Cohesion: 0.36
Nodes (4): HeadPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 45 - "LegsPharaohArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 46 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 47 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 48 - "FeetRaijinArmorModel"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 49 - "RaijinSkin.java"
Cohesion: 0.25
Nodes (7): getTexturePrefix(), Override, RaijinSkin, CRYSTAL_PATREON, DEFAULT, SILVER_PATREON, toString()

### Community 50 - "GlobalSkinSyncPayload"
Cohesion: 0.36
Nodes (5): GlobalSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 51 - "SkinSyncPayload"
Cohesion: 0.36
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, SkinSyncPayload

### Community 52 - "LootModifierProvider.java"
Cohesion: 0.32
Nodes (5): GlobalLootModifierProvider, PackOutput, Provider, Override, LootModifierProvider

### Community 53 - "PharaohSkin.java"
Cohesion: 0.29
Nodes (6): getTexturePrefix(), Override, PharaohSkin, DEFAULT, SILVER_PATREON, toString()

### Community 54 - "FeetCenturionArmorModel"
Cohesion: 0.48
Nodes (3): FeetCenturionArmorModel, ModelPart, Override

### Community 55 - "LootModifiers.java"
Cohesion: 0.48
Nodes (5): DeferredRegister, IEventBus, IGlobalLootModifier, MapCodec, LootModifiers

### Community 56 - "AgeforgedArmorClient.java"
Cohesion: 0.33
Nodes (3): LoggingIn, RegisterLayerDefinitions, AgeforgedArmorClient

### Community 57 - "ArmorMaterialRegistryNeoForge.java"
Cohesion: 0.47
Nodes (4): ArmorMaterialRegistryNeoForge, ArmorMaterial, Holder, Override

### Community 58 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **24 isolated node(s):** `AotATags`, `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON` (+19 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **21 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `ModelProviderRegistry.java`, `.templateLayerDefinition`, `MixinHumanoidArmorLayer.java`, `.sinPI`, `HeadAnubisArmorModel`, `ChestCenturionArmorModel`, `ChestExaltedAurumArmorModel`, `ChestIronPlateArmorModel`, `ChestJapaneseLightArmorModel`, `ChestOYoroiArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `LegsRaijinArmorModel`, `LegsAnubisArmorModel`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `HeadHolyArmorModel`, `LegsHolyArmorModel`, `FeetIronPlateArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `LegsJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `LegsOYoroiArmorModel`, `FeetPharaohArmorModel`, `HeadPharaohArmorModel`, `LegsPharaohArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `FeetCenturionArmorModel`?**
  _High betweenness centrality (0.451) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `ModelProviderRegistry.java` to `HatItem.java`, `MixinHumanoidArmorLayer.java`, `OYoroiSkin`, `AOTAConfig.java`, `ArmorModel`, `RaijinSkin.java`, `PharaohSkin.java`, `SkinVariant`?**
  _High betweenness centrality (0.105) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `SkinSyncState` to `ModelProviderRegistry.java`, `PreferredModel`, `OYoroiSkin`, `AOTAConfig.java`, `RaijinSkin.java`, `GlobalSkinSyncPayload`, `SkinSyncPayload`, `PharaohSkin.java`, `SkinVariant`?**
  _High betweenness centrality (0.092) - this node is a cross-community bridge._
- **What connects `AotATags`, `Constants`, `ClientPatronState` to the rest of the system?**
  _24 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `HatItem.java` be split into smaller, more focused modules?**
  _Cohesion score 0.06954887218045112 - nodes in this community are weakly interconnected._
- **Should `CustomPacketPayload` be split into smaller, more focused modules?**
  _Cohesion score 0.07058001397624039 - nodes in this community are weakly interconnected._
- **Should `ModelProviderRegistry.java` be split into smaller, more focused modules?**
  _Cohesion score 0.11137254901960784 - nodes in this community are weakly interconnected._