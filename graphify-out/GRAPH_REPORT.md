# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor\26.1.2  (2026-07-27)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 963 nodes · 1532 edges · 276 communities (45 shown, 231 thin omitted)
- Extraction: 94% EXTRACTED · 6% INFERRED · 0% AMBIGUOUS · INFERRED: 86 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- ArmorModel
- AgeforgedArmor.java
- CustomPacketPayload
- HumanoidRenderState
- OYoroiSkin
- .templateLayerDefinition
- HatItem.java
- HumanoidArmorItem.java
- ArmorSetEffectHandler
- MixinHumanoidArmorLayer.java
- PatronConfig
- HeadAnubisArmorModel
- ChestExaltedAurumArmorModel
- LegsExaltedAurumArmorModel
- ChestHolyArmorModel
- ChestIronPlateArmorModel
- ChestJapaneseLightArmorModel
- ChestQuetzalcoatlArmorModel
- ChestRaijinArmorModel
- HeadRaijinArmorModel
- FeetAnubisArmorModel
- LegsAnubisArmorModel
- FeetCenturionArmorModel
- HeadCenturionArmorModel
- LegsCenturionArmorModel
- FeetExaltedAurumArmorModel
- HeadExaltedAurumArmorModel
- FeetHolyArmorModel
- LegsHolyArmorModel
- LegsIronPlateArmorModel
- FeetJapaneseLightArmorModel
- HeadJapaneseLightArmorModel
- FeetOYoroiArmorModel
- HeadOYoroiArmorModel
- LegsOYoroiArmorModel
- FeetPharaohArmorModel
- FeetQuetzalcoatlArmorModel
- HeadQuetzalcoatlArmorModel
- LegsQuetzalcoatlArmorModel
- FeetRaijinArmorModel
- AgeforgedArmorClient
- PreferredModel
- gradlew
- ClientPatronState
- SkinSyncState.java
- Constants
- LootTablesToModify.java
- CallbackInfo
- ArmorMaterial
- ArmorType
- DeferredRegister
- Holder
- Identifier
- IEventBus
- Item
- Logger
- Override
- EquipmentSlot
- Holder
- ItemStack
- Player
- Entity
- EquipmentSlot
- Identifier
- LayerDefinition
- NotNull
- Override
- Entity
- EquipmentSlot
- HumanoidRenderState
- Identifier
- LayerDefinition
- Logger
- NotNull
- Override
- ModelPart
- ModelPart
- Override
- Player
- Override
- Override
- Override
- Override
- Override
- ArmorMaterial
- ArmorType
- Holder
- ArmorMaterial
- ArmorType
- Holder
- Component
- EquipmentSlot
- ItemStack
- NotNull
- Override
- Player
- TooltipContext
- TooltipDisplay
- TooltipFlag
- IGlobalLootModifier
- ItemStack
- MapCodec
- NotNull
- Override
- DeferredRegister
- IEventBus
- IGlobalLootModifier
- MapCodec
- ServerPlayer
- Override
- ServerPlayer
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- Logger
- Logger
- Logger
- ServerPlayer
- ArmorMaterial
- Holder
- Identifier
- ArmorMaterial
- Holder
- Override
- ArmorMaterial
- ArmorType
- Holder
- Item
- Logger
- EquipmentSlot
- LayerDefinition
- Inject
- Items
- Mixin
- PoseStack
- ArmorMaterial
- ArmorType
- DeferredRegister
- Holder
- Identifier
- IEventBus
- Item
- Logger
- Override
- EquipmentSlot
- Holder
- ItemStack
- Player
- Entity
- EquipmentSlot
- Identifier
- LayerDefinition
- NotNull
- Override
- Entity
- EquipmentSlot
- HumanoidRenderState
- Identifier
- LayerDefinition
- Logger
- NotNull
- Override
- ModelPart
- ModelPart
- Override
- Player
- Override
- Override
- Override
- Override
- Override
- ArmorMaterial
- ArmorType
- Holder
- ArmorMaterial
- ArmorType
- Holder
- Component
- EquipmentSlot
- ItemStack
- NotNull
- Override
- Player
- TooltipContext
- TooltipDisplay
- TooltipFlag
- IGlobalLootModifier
- ItemStack
- MapCodec
- NotNull
- Override
- DeferredRegister
- IEventBus
- IGlobalLootModifier
- MapCodec
- HumanoidModel
- Logger
- ModelPart
- ServerPlayer
- Override
- ServerPlayer
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- FriendlyByteBuf
- Override
- StreamCodec
- Type
- Logger
- Logger
- Logger
- ServerPlayer
- ArmorMaterial
- Holder
- Identifier
- ArmorMaterial
- Holder
- Override
- ArmorMaterial
- ArmorType
- Holder
- Item
- Logger
- EquipmentSlot
- LayerDefinition
- SubmitNodeCollector
- SuppressWarnings
- Unique

## God Nodes (most connected - your core abstractions)
1. `ArmorModel` - 138 edges
2. `ArmorModelProvider` - 28 edges
3. `ArmorSetEffectHandler` - 21 edges
4. `ArmorModelSupplier` - 15 edges
5. `HumanoidArmorItem` - 14 edges
6. `MixedArmorModelProvider` - 13 edges
7. `OYoroiSkin` - 11 edges
8. `ChestAnubisArmorModel` - 10 edges
9. `ForgeConfigSyncNetworkHandler` - 10 edges
10. `GlobalPreferenceSyncPayload` - 10 edges

## Surprising Connections (you probably didn't know these)
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `MixedArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `ArmorModel` --implements--> `ArmorModelSupplier`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelSupplier.java
- `FeetAnubisArmorModel` --inherits--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/models/anubis_armor/FeetAnubisArmorModel.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `HeadAnubisArmorModel` --inherits--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/models/anubis_armor/HeadAnubisArmorModel.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java

## Import Cycles
- None detected.

## Communities (276 total, 231 thin omitted)

### Community 0 - "ArmorModel"
Cohesion: 0.05
Nodes (28): ArmorModel, ChestAnubisArmorModel, ModelPart, Override, HeadHolyArmorModel, LayerDefinition, ModelPart, Override (+20 more)

### Community 1 - "AgeforgedArmor.java"
Cohesion: 0.05
Nodes (29): CreativeModeTab, EquipmentAsset, AgeforgedArmor, ItemRegistryImpl, AotAMaterials, AgeforgedArmorLootModifier, LootModifiers, ArmorMaterialRegistry (+21 more)

### Community 2 - "CustomPacketPayload"
Cohesion: 0.08
Nodes (14): CustomPacketPayload, ForgeConfigSyncNetworkHandler, NeoForgePacketHandlers, NeoForgePayloadRegistry, DisablePreferencesPayload, DisableSkinSyncPayload, GlobalPreferenceSyncPayload, GlobalSkinSyncPayload (+6 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.11
Nodes (15): EquipmentSlot, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, ArmorModelProvider, MixedArmorModelProvider, SkinnedMixedArmorModelProvider, ArmorModelSupplier, ForgeHumanoidArmorItem (+7 more)

### Community 4 - "OYoroiSkin"
Cohesion: 0.05
Nodes (24): SkinVariant, CenturionSkin, DEFAULT, SILVER_PATREON, IronPlateSkin, ASHES, DEFAULT, OYoroiSkin (+16 more)

### Community 5 - ".templateLayerDefinition"
Cohesion: 0.07
Nodes (17): LayerDefinition, ChestCenturionArmorModel, LayerDefinition, ModelPart, Override, ChestOYoroiArmorModel, LayerDefinition, ModelPart (+9 more)

### Community 6 - "HatItem.java"
Cohesion: 0.08
Nodes (15): ChatFormatting, ConfigClassHandler, CommonClass, AOTAConfig, HatItem, ConfigSyncNetworkHandler, SetBonus, SetBonusRegistry (+7 more)

### Community 7 - "HumanoidArmorItem.java"
Cohesion: 0.14
Nodes (22): AbstractClientPlayer, Rarity, HumanoidArmorItem, ArmorMaterial, ArmorType, Component, EquipmentSlot, Holder (+14 more)

### Community 8 - "ArmorSetEffectHandler"
Cohesion: 0.26
Nodes (3): ArmorSetEffectHandler, ItemStack, MobEffect

### Community 9 - "MixinHumanoidArmorLayer.java"
Cohesion: 0.27
Nodes (13): HumanoidArmorLayer, Operation, CallbackInfo, EquipmentSlot, HumanoidRenderState, Inject, ItemStack, Mixin (+5 more)

### Community 10 - "PatronConfig"
Cohesion: 0.16
Nodes (7): PatronConfig, PatronData, PatronEntry, PatronFetcher, PatronSyncHandler, Gson, PlayerLoggedInEvent

### Community 11 - "HeadAnubisArmorModel"
Cohesion: 0.33
Nodes (4): HeadAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 12 - "ChestExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 13 - "LegsExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsExaltedAurumArmorModel

### Community 14 - "ChestHolyArmorModel"
Cohesion: 0.33
Nodes (4): ChestHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 15 - "ChestIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 16 - "ChestJapaneseLightArmorModel"
Cohesion: 0.31
Nodes (4): ChestJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 17 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 18 - "ChestRaijinArmorModel"
Cohesion: 0.33
Nodes (4): ChestRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "FeetAnubisArmorModel"
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "LegsAnubisArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 22 - "FeetCenturionArmorModel"
Cohesion: 0.33
Nodes (4): FeetCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadCenturionArmorModel"
Cohesion: 0.33
Nodes (4): HeadCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 24 - "LegsCenturionArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 25 - "FeetExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 26 - "HeadExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): HeadExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 27 - "FeetHolyArmorModel"
Cohesion: 0.36
Nodes (4): FeetHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 28 - "LegsHolyArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 29 - "LegsIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 30 - "FeetJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 31 - "HeadJapaneseLightArmorModel"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 32 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 34 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

### Community 35 - "FeetPharaohArmorModel"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 36 - "FeetQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): FeetQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 37 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 39 - "FeetRaijinArmorModel"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 40 - "AgeforgedArmorClient"
Cohesion: 0.33
Nodes (3): AgeforgedArmorClient, LoggingIn, RegisterLayerDefinitions

### Community 41 - "PreferredModel"
Cohesion: 0.50
Nodes (3): PreferredModel, FEMALE, MALE

### Community 42 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **25 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+20 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **231 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `HumanoidRenderState`, `.templateLayerDefinition`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`, `HeadAnubisArmorModel`, `ChestExaltedAurumArmorModel`, `LegsExaltedAurumArmorModel`, `ChestHolyArmorModel`, `ChestIronPlateArmorModel`, `ChestJapaneseLightArmorModel`, `ChestQuetzalcoatlArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `FeetAnubisArmorModel`, `LegsAnubisArmorModel`, `FeetCenturionArmorModel`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `LegsHolyArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `LegsOYoroiArmorModel`, `FeetPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`?**
  _High betweenness centrality (0.371) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `HumanoidRenderState` to `ArmorModel`, `OYoroiSkin`, `HatItem.java`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`?**
  _High betweenness centrality (0.118) - this node is a cross-community bridge._
- **Why does `AgeforgedArmor` connect `AgeforgedArmor.java` to `PatronConfig`?**
  _High betweenness centrality (0.034) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _25 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `ArmorModel` be split into smaller, more focused modules?**
  _Cohesion score 0.05285592497868713 - nodes in this community are weakly interconnected._
- **Should `AgeforgedArmor.java` be split into smaller, more focused modules?**
  _Cohesion score 0.05201636469900643 - nodes in this community are weakly interconnected._
- **Should `CustomPacketPayload` be split into smaller, more focused modules?**
  _Cohesion score 0.07547169811320754 - nodes in this community are weakly interconnected._