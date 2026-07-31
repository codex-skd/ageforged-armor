# Graph Report - 26.1.2  (2026-07-31)

## Corpus Check
- 265 files · ~134,261 words
- Verdict: corpus is large enough that graph structure adds value.

## Summary
- 1004 nodes · 1551 edges · 226 communities (79 shown, 147 thin omitted)
- Extraction: 94% EXTRACTED · 6% INFERRED · 0% AMBIGUOUS · INFERRED: 86 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `66cf08d7`
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

## God Nodes (most connected - your core abstractions)
1. `ArmorModel` - 138 edges
2. `Changelog` - 36 edges
3. `ArmorModelProvider` - 26 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `HumanoidArmorItem` - 14 edges
7. `CurseForge — Variables del proyecto` - 13 edges
8. `MixedArmorModelProvider` - 11 edges
9. `OYoroiSkin` - 11 edges
10. `Flujo de trabajo — Ageforged Armor (NeoForge)` - 11 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --references--> `Items`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/AotATags.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `OYoroiSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/OYoroiSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `MixedArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `ArmorModel` --implements--> `ArmorModelSupplier`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelSupplier.java

## Import Cycles
- None detected.

## Communities (226 total, 147 thin omitted)

### Community 0 - "ArmorModel"
Cohesion: 0.06
Nodes (28): ArmorModel, HumanoidModel, MeshDefinition, ChestAnubisArmorModel, ModelPart, Override, LayerDefinition, ModelPart (+20 more)

### Community 1 - "AgeforgedArmor.java"
Cohesion: 0.19
Nodes (7): CreativeModeTab, AgeforgedArmor, LootModifiers, Mod, ModContainer, Post, Server

### Community 2 - "CustomPacketPayload"
Cohesion: 0.08
Nodes (14): CustomPacketPayload, ForgeConfigSyncNetworkHandler, NeoForgePacketHandlers, NeoForgePayloadRegistry, DisablePreferencesPayload, DisableSkinSyncPayload, GlobalPreferenceSyncPayload, GlobalSkinSyncPayload (+6 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.05
Nodes (22): AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, ArmorModelProvider, MixedArmorModelProvider, SkinnedMixedArmorModelProvider, SkinVariant, ArmorModelSupplier, CenturionSkin (+14 more)

### Community 4 - "OYoroiSkin"
Cohesion: 0.14
Nodes (10): OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK, JADE, NIGHTBLUE (+2 more)

### Community 5 - ".templateLayerDefinition"
Cohesion: 0.07
Nodes (19): LayerDefinition, HeadAnubisArmorModel, LayerDefinition, ModelPart, Override, LayerDefinition, ChestOYoroiArmorModel, LayerDefinition (+11 more)

### Community 6 - "HatItem.java"
Cohesion: 0.06
Nodes (27): ChatFormatting, CommonClass, ForgeHumanoidArmorItem, HatItem, ConfigSyncNetworkHandler, SetBonus, SetBonusRegistry, InteractionHand (+19 more)

### Community 7 - "HumanoidArmorItem.java"
Cohesion: 0.35
Nodes (9): AbstractClientPlayer, CallbackInfo, Identifier, Inject, Mixin, PoseStack, SubmitNodeCollector, Unique (+1 more)

### Community 9 - "MixinHumanoidArmorLayer.java"
Cohesion: 0.27
Nodes (13): HumanoidArmorLayer, Operation, CallbackInfo, EquipmentSlot, HumanoidRenderState, Inject, ItemStack, Mixin (+5 more)

### Community 10 - "PatronConfig"
Cohesion: 0.16
Nodes (7): PatronConfig, PatronData, PatronEntry, PatronFetcher, PatronSyncHandler, Gson, PlayerLoggedInEvent

### Community 11 - "HeadAnubisArmorModel"
Cohesion: 0.11
Nodes (17): Buenas prácticas, Commits (Conventional Commits), Convenciones de nomenclatura, Específico del mod, Estructura del proyecto, Flujo de trabajo — Ageforged Armor (NeoForge), Flujo por tarea, Idioma (+9 more)

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
Cohesion: 0.14
Nodes (13): Changelog, CurseForge — Variables del proyecto, Descripcion del proyecto, Estructura del changelog (HTML), Flujo completo, Parámetros del upload, Proyecto, Rama (+5 more)

### Community 16 - "ChestJapaneseLightArmorModel"
Cohesion: 0.31
Nodes (4): ChestJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 17 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.17
Nodes (11): [0.0.0-beta.18] - 2026-07-17, [0.0.0-beta.23] - 2026-07-17, [0.0.0-beta.3] - 2026-07-13, [0.0.0-beta.5] - 2026-07-13, [0.0.0-beta.7] - 2026-07-13, Changelog, Fixed, Fixed (+3 more)

### Community 18 - "ChestRaijinArmorModel"
Cohesion: 0.31
Nodes (4): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "FeetAnubisArmorModel"
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "LegsAnubisArmorModel"
Cohesion: 0.31
Nodes (4): ChestPharaohArmorModel, LayerDefinition, ModelPart, Override

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
Cohesion: 0.10
Nodes (12): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override, FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override (+4 more)

### Community 31 - "HeadJapaneseLightArmorModel"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 32 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 34 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): ItemRegistryImpl, ItemRegistry, Item, ObjectArrayList

### Community 35 - "FeetPharaohArmorModel"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 36 - "FeetQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): AgeforgedArmorLootModifier, LootContext, LootItemCondition, LootModifier

### Community 37 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadHolyArmorModel, LayerDefinition, ModelPart, Override

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

### Community 48 - "CallbackInfo"
Cohesion: 0.36
Nodes (4): HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 157 - "Inject"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 158 - "Items"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 159 - "Mixin"
Cohesion: 0.32
Nodes (5): GlobalLootModifierProvider, PackOutput, Provider, Override, LootModifierProvider

### Community 162 - "ArmorMaterial"
Cohesion: 0.47
Nodes (3): EquipmentAsset, AotAMaterials, ResourceKey

### Community 163 - "ArmorType"
Cohesion: 0.60
Nodes (4): AotATags, Items, Item, TagKey

### Community 164 - "DeferredRegister"
Cohesion: 0.50
Nodes (3): ConfigClassHandler, AOTAConfig, YetAnotherConfigLib

### Community 165 - "Holder"
Cohesion: 0.50
Nodes (4): [0.0.0-beta.28] - 2026-07-22, Docs, Infrastructure, Refactor

### Community 166 - "Identifier"
Cohesion: 0.50
Nodes (3): CLAUDE.md — ageforged_armor (26.1.2), Prioridad de instrucciones, Workflow del mod

### Community 167 - "IEventBus"
Cohesion: 0.50
Nodes (3): Changed, Fixed, v0.0.0-beta.15

### Community 168 - "Item"
Cohesion: 0.50
Nodes (3): Changed, Fixed, v0.0.0-beta.16

### Community 169 - "Logger"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.12] - 2026-07-13, Added, Fixed

### Community 170 - "Override"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.15] - 2026-07-16, Changed, Fixed

### Community 171 - "EquipmentSlot"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.22] - 2026-07-17, Added, Fixed

### Community 172 - "Holder"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.30] - 2026-07-22, Fixed, Infrastructure

### Community 173 - "ItemStack"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.9] - 2026-07-13, Added, Changed

## Knowledge Gaps
- **109 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+104 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **147 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `HumanoidRenderState`, `.templateLayerDefinition`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`, `ChestExaltedAurumArmorModel`, `LegsExaltedAurumArmorModel`, `ChestHolyArmorModel`, `ChestJapaneseLightArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `FeetAnubisArmorModel`, `LegsAnubisArmorModel`, `FeetCenturionArmorModel`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `LegsHolyArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `Inject`, `FeetOYoroiArmorModel`, `Items`, `FeetPharaohArmorModel`, `HeadOYoroiArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `CallbackInfo`?**
  _High betweenness centrality (0.356) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `HumanoidRenderState` to `ArmorModel`, `OYoroiSkin`, `HatItem.java`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`?**
  _High betweenness centrality (0.159) - this node is a cross-community bridge._
- **Why does `HumanoidArmorItem` connect `HatItem.java` to `AgeforgedArmor.java`, `LegsOYoroiArmorModel`, `MixinHumanoidArmorLayer.java`, `HumanoidArmorItem.java`?**
  _High betweenness centrality (0.078) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _109 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `ArmorModel` be split into smaller, more focused modules?**
  _Cohesion score 0.05583972719522592 - nodes in this community are weakly interconnected._
- **Should `CustomPacketPayload` be split into smaller, more focused modules?**
  _Cohesion score 0.07547169811320754 - nodes in this community are weakly interconnected._
- **Should `HumanoidRenderState` be split into smaller, more focused modules?**
  _Cohesion score 0.05069124423963134 - nodes in this community are weakly interconnected._