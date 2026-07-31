# Graph Report - 26.2  (2026-07-31)

## Corpus Check
- 242 files · ~132,012 words
- Verdict: corpus is large enough that graph structure adds value.

## Summary
- 975 nodes · 1668 edges · 180 communities (67 shown, 113 thin omitted)
- Extraction: 95% EXTRACTED · 5% INFERRED · 0% AMBIGUOUS · INFERRED: 86 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `30d25307`
- Run `git rev-parse HEAD` and compare to check if the graph is stale.
- Run `graphify update .` after code changes (no API cost).

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
- HumanoidRenderState
- Identifier
- Logger
- NotNull
- Override
- ModelPart
- ModelPart
- Player
- Override
- Override
- Override
- Override
- Override
- ArmorMaterial
- ArmorType
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
- ItemStack
- MapCodec
- Override
- DeferredRegister
- IEventBus
- IGlobalLootModifier
- MapCodec
- ServerPlayer
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
- Item
- Logger
- EquipmentSlot
- LayerDefinition
- Mixin
- settings.gradle
- ArmorMaterial
- ArmorType
- DeferredRegister
- Identifier
- IEventBus
- Item
- ItemStack
- Player
- Entity
- IGlobalLootModifier
- ArmorMaterial
- ArmorType
- Component
- EquipmentSlot
- Holder
- ItemStack
- Override
- Player
- TooltipContext
- TooltipDisplay
- TooltipFlag
- Override

## God Nodes (most connected - your core abstractions)
1. `ArmorModel` - 138 edges
2. `Changelog` - 41 edges
3. `ArmorModelProvider` - 29 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `MixedArmorModelProvider` - 13 edges
7. `SkinSyncState` - 13 edges
8. `CurseForge — Variables del proyecto` - 13 edges
9. `OYoroiSkin` - 12 edges
10. `ForgeConfigSyncNetworkHandler` - 12 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --references--> `Items`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/AgeforgedArmorTags.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `SkinnedMixedArmorModelProvider` --references--> `SkinSyncState`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/config/SkinSyncState.java
- `MixedArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `ArmorModel` --implements--> `ArmorModelSupplier`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelSupplier.java

## Import Cycles
- None detected.

## Communities (180 total, 113 thin omitted)

### Community 0 - "ArmorModel"
Cohesion: 0.29
Nodes (6): AvatarRenderState, MeshDefinition, PlayerModel, ArmorModel, ModelPart, Override

### Community 1 - "AgeforgedArmor.java"
Cohesion: 0.05
Nodes (37): CreativeModeTab, LootModifiers, ArmorMaterialRegistry, ArmorMaterialRegistryNeoForge, ItemAttributeModifiers, LootContext, LootItemCondition, LootModifier (+29 more)

### Community 2 - "CustomPacketPayload"
Cohesion: 0.05
Nodes (26): ConfigClassHandler, CustomPacketPayload, PreferredModel, FEMALE, MALE, SkinSyncState, ConfigSyncNetworkHandler, NeoForgePacketHandlers (+18 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.12
Nodes (19): AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, ModelLayerLocation, ArmorModelProvider, Entity, EquipmentSlot, HumanoidRenderState, Identifier (+11 more)

### Community 4 - "OYoroiSkin"
Cohesion: 0.05
Nodes (24): CenturionSkin, DEFAULT, SILVER_PATREON, IronPlateSkin, ASHES, DEFAULT, OYoroiSkin, AMBER (+16 more)

### Community 5 - ".templateLayerDefinition"
Cohesion: 0.07
Nodes (19): LayerDefinition, LayerDefinition, HeadAnubisArmorModel, LayerDefinition, ModelPart, Override, LayerDefinition, ModelPart (+11 more)

### Community 6 - "HatItem.java"
Cohesion: 0.11
Nodes (14): ChatFormatting, HumanoidArmorItem, ForgeHumanoidArmorItem, HatItem, SetBonus, SetBonusRegistry, InteractionHand, InteractionResult (+6 more)

### Community 7 - "HumanoidArmorItem.java"
Cohesion: 0.35
Nodes (10): AbstractClientPlayer, Avatar, CallbackInfo, Identifier, Inject, Mixin, PoseStack, SubmitNodeCollector (+2 more)

### Community 9 - "MixinHumanoidArmorLayer.java"
Cohesion: 0.27
Nodes (13): HumanoidArmorLayer, Operation, CallbackInfo, EquipmentSlot, HumanoidRenderState, Inject, ItemStack, Mixin (+5 more)

### Community 10 - "PatronConfig"
Cohesion: 0.16
Nodes (7): PatronConfig, PatronData, PatronEntry, PatronFetcher, PatronSyncHandler, Gson, PlayerLoggedInEvent

### Community 11 - "HeadAnubisArmorModel"
Cohesion: 0.22
Nodes (10): EquipmentAsset, ResourceKey, AgeforgedArmorMaterials, ArmorMaterial, ArmorType, Holder, AgeforgedArmorTags, Items (+2 more)

### Community 12 - "ChestExaltedAurumArmorModel"
Cohesion: 0.14
Nodes (13): [0.0.0-beta.13] - 2026-07-13, [0.0.0-beta.1] - 2026-07-27, [0.0.0-beta.2] - 2026-07-27, [0.0.0-beta.5] - 2026-07-13, [0.0.0-beta.8] - 2026-07-13, [1.1.1] - 2026-07-30, Changed, Changelog (+5 more)

### Community 13 - "LegsExaltedAurumArmorModel"
Cohesion: 0.14
Nodes (13): Changelog, CurseForge — Variables del proyecto, Descripcion del proyecto, Estructura del changelog (HTML), Flujo completo, Parámetros del upload, Proyecto, Rama (+5 more)

### Community 14 - "ChestHolyArmorModel"
Cohesion: 0.11
Nodes (11): ChestAnubisArmorModel, ModelPart, Override, FeetHolyArmorModel, LayerDefinition, ModelPart, Override, HeadIronPlateArmorModel (+3 more)

### Community 15 - "ChestIronPlateArmorModel"
Cohesion: 0.31
Nodes (4): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 16 - "ChestJapaneseLightArmorModel"
Cohesion: 0.11
Nodes (17): Buenas prácticas, Commits (Conventional Commits), Convenciones de nomenclatura, Específico del mod, Estructura del proyecto, Flujo de trabajo — Ageforged Armor (NeoForge), Flujo por tarea, Idioma (+9 more)

### Community 17 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 18 - "ChestRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "HeadRaijinArmorModel"
Cohesion: 0.36
Nodes (4): FeetQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "LegsAnubisArmorModel"
Cohesion: 0.33
Nodes (4): ChestHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "FeetCenturionArmorModel"
Cohesion: 0.33
Nodes (4): ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadCenturionArmorModel"
Cohesion: 0.31
Nodes (4): ChestOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 25 - "FeetExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 26 - "HeadExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 27 - "FeetHolyArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 28 - "LegsHolyArmorModel"
Cohesion: 0.48
Nodes (3): FeetAnubisArmorModel, ModelPart, Override

### Community 29 - "LegsIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 30 - "FeetJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): FeetCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 31 - "HeadJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 32 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 35 - "FeetPharaohArmorModel"
Cohesion: 0.36
Nodes (4): HeadHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 36 - "FeetQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 37 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 39 - "FeetRaijinArmorModel"
Cohesion: 0.48
Nodes (3): FeetJapaneseLightArmorModel, ModelPart, Override

### Community 40 - "AgeforgedArmorClient"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 42 - "gradlew"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 44 - "SkinSyncState.java"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 46 - "LootTablesToModify.java"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 48 - "CallbackInfo"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

### Community 49 - "ArmorMaterial"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 50 - "ArmorType"
Cohesion: 0.36
Nodes (4): HeadPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 51 - "DeferredRegister"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 52 - "Holder"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 53 - "Identifier"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 54 - "IEventBus"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 70 - "HumanoidRenderState"
Cohesion: 0.50
Nodes (4): [0.0.0-beta.28] - 2026-07-22, Docs, Infrastructure, Refactor

### Community 71 - "Identifier"
Cohesion: 0.50
Nodes (3): CLAUDE.md — ageforged_armor (26.2), Prioridad de instrucciones, Workflow del mod

### Community 73 - "Logger"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

### Community 74 - "NotNull"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.12] - 2026-07-13, Added, Fixed

### Community 75 - "Override"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.15] - 2026-07-16, Changed, Fixed

### Community 76 - "ModelPart"
Cohesion: 0.33
Nodes (4): HeadCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 77 - "ModelPart"
Cohesion: 0.33
Nodes (3): AgeforgedArmorClient, LoggingIn, RegisterLayerDefinitions

### Community 79 - "Player"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.22] - 2026-07-17, Added, Fixed

### Community 85 - "ArmorMaterial"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.30] - 2026-07-22, Fixed, Infrastructure

### Community 86 - "ArmorType"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.9] - 2026-07-13, Added, Changed

### Community 213 - "IGlobalLootModifier"
Cohesion: 0.38
Nodes (4): LootModifierProvider, GlobalLootModifierProvider, PackOutput, Provider

## Knowledge Gaps
- **100 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+95 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **113 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `HumanoidRenderState`, `.templateLayerDefinition`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`, `ChestHolyArmorModel`, `ChestIronPlateArmorModel`, `ChestQuetzalcoatlArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `LegsAnubisArmorModel`, `FeetCenturionArmorModel`, `HeadCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `LegsHolyArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `FeetPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `AgeforgedArmorClient`, `gradlew`, `SkinSyncState.java`, `LootTablesToModify.java`, `CallbackInfo`, `ArmorMaterial`, `ArmorType`, `DeferredRegister`, `Holder`, `Identifier`, `IEventBus`, `ModelPart`?**
  _High betweenness centrality (0.359) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `HumanoidRenderState` to `ArmorModel`, `OYoroiSkin`, `HatItem.java`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`?**
  _High betweenness centrality (0.079) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `CustomPacketPayload` to `HumanoidRenderState`?**
  _High betweenness centrality (0.036) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _100 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `AgeforgedArmor.java` be split into smaller, more focused modules?**
  _Cohesion score 0.05222734254992319 - nodes in this community are weakly interconnected._
- **Should `CustomPacketPayload` be split into smaller, more focused modules?**
  _Cohesion score 0.05263157894736842 - nodes in this community are weakly interconnected._
- **Should `HumanoidRenderState` be split into smaller, more focused modules?**
  _Cohesion score 0.1202020202020202 - nodes in this community are weakly interconnected._