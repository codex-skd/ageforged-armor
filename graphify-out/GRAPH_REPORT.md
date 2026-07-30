# Graph Report - 26.2  (2026-07-30)

## Corpus Check
- 322 files · ~138,934 words
- Verdict: corpus is large enough that graph structure adds value.

## Summary
- 1007 nodes · 1700 edges · 194 communities (82 shown, 112 thin omitted)
- Extraction: 95% EXTRACTED · 5% INFERRED · 0% AMBIGUOUS · INFERRED: 86 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Graph Freshness
- Built from commit: `19a84d90`
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
- Items
- Mixin
- settings.gradle
- ArmorMaterial
- ArmorType
- DeferredRegister
- Holder
- Identifier
- IEventBus
- Item
- ItemStack
- Player
- Entity
- EquipmentSlot
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
2. `Changelog` - 40 edges
3. `ArmorModelProvider` - 29 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `Flujo de trabajo — Ageforged Armor (NeoForge)` - 14 edges
7. `MixedArmorModelProvider` - 13 edges
8. `SkinSyncState` - 13 edges
9. `CurseForge — Variables del proyecto` - 13 edges
10. `OYoroiSkin` - 12 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --references--> `Items`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/AgeforgedArmorTags.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `CenturionSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/CenturionSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `IronPlateSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/IronPlateSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `OYoroiSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/OYoroiSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (194 total, 112 thin omitted)

### Community 0 - "ArmorModel"
Cohesion: 0.29
Nodes (6): AvatarRenderState, MeshDefinition, PlayerModel, ArmorModel, ModelPart, Override

### Community 1 - "AgeforgedArmor.java"
Cohesion: 0.06
Nodes (35): CreativeModeTab, LootModifiers, ArmorMaterialRegistry, ArmorMaterialRegistryNeoForge, LootContext, LootItemCondition, LootModifier, Mod (+27 more)

### Community 2 - "CustomPacketPayload"
Cohesion: 0.06
Nodes (23): CustomPacketPayload, PreferredModel, FEMALE, MALE, SkinSyncState, ConfigSyncNetworkHandler, NeoForgePacketHandlers, NeoForgePayloadRegistry (+15 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.12
Nodes (19): AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, ModelLayerLocation, ArmorModelProvider, Entity, EquipmentSlot, HumanoidRenderState, Identifier (+11 more)

### Community 4 - "OYoroiSkin"
Cohesion: 0.20
Nodes (10): OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK, JADE, NIGHTBLUE (+2 more)

### Community 5 - ".templateLayerDefinition"
Cohesion: 0.07
Nodes (18): LayerDefinition, ChestCenturionArmorModel, LayerDefinition, ModelPart, Override, LayerDefinition, ChestExaltedAurumArmorModel, LayerDefinition (+10 more)

### Community 6 - "HatItem.java"
Cohesion: 0.10
Nodes (15): ChatFormatting, HumanoidArmorItem, ForgeHumanoidArmorItem, HatItem, SetBonus, SetBonusRegistry, InteractionHand, InteractionResult (+7 more)

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
Nodes (13): [0.0.0-beta.16] - 2026-07-16, [0.0.0-beta.2] - 2026-07-13, [0.0.0-beta.33] - 2026-07-23, [0.0.0-beta.35] - 2026-07-24, [0.0.0-beta.6] - 2026-07-13, [1.1.1] - 2026-07-30, Changed, Changelog (+5 more)

### Community 13 - "LegsExaltedAurumArmorModel"
Cohesion: 0.14
Nodes (13): Changelog, CurseForge — Variables del proyecto, Descripcion del proyecto, Estructura del changelog (HTML), Flujo completo, Parámetros del upload, Proyecto, Rama (+5 more)

### Community 14 - "ChestHolyArmorModel"
Cohesion: 0.11
Nodes (11): ChestAnubisArmorModel, ModelPart, Override, HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override, FeetQuetzalcoatlArmorModel (+3 more)

### Community 15 - "ChestIronPlateArmorModel"
Cohesion: 0.22
Nodes (9): Archivos de CurseForge, Buenas prácticas, Ejemplo de estructura HTML para release notes, Elementos HTML disponibles, Elementos HTML permitidos, Estructura de la descripción general, Estructura del proyecto, Formato de descripciones CurseForge (+1 more)

### Community 16 - "ChestJapaneseLightArmorModel"
Cohesion: 0.25
Nodes (6): Ageforged Armor, Armor Sets, Development, Features, License, Requirements

### Community 17 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.25
Nodes (8): 0. Determinar alcance de versión, 1. Desarrollo, 2. Copiar a instancia de pruebas, 3. Probar en instancia, 4. Preparar versión para CurseForge, 5. Release estable, 6. Actualizar Knowledge Graph (Graphify), Flujo completo (paso a paso)

### Community 18 - "ChestRaijinArmorModel"
Cohesion: 0.25
Nodes (8): Buenas prácticas, Convenciones de nomenclatura, Ficheros de documentación, Flujo de trabajo — Ageforged Armor (NeoForge), Historial de versiones del workflow, Idioma, Organización en el workspace, Tipografía

### Community 19 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "FeetAnubisArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsExaltedAurumArmorModel

### Community 21 - "LegsAnubisArmorModel"
Cohesion: 0.33
Nodes (4): ChestHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "FeetCenturionArmorModel"
Cohesion: 0.33
Nodes (4): ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadCenturionArmorModel"
Cohesion: 0.31
Nodes (4): ChestOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 24 - "LegsCenturionArmorModel"
Cohesion: 0.31
Nodes (4): ChestPharaohArmorModel, LayerDefinition, ModelPart, Override

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
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

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

### Community 34 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): FeetHolyArmorModel, LayerDefinition, ModelPart, Override

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
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

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

### Community 55 - "Item"
Cohesion: 0.33
Nodes (4): ConfigClassHandler, AgeforgedArmorConfig, LootTablesToModify, YetAnotherConfigLib

### Community 56 - "Logger"
Cohesion: 0.29
Nodes (3): CenturionSkin, DEFAULT, SILVER_PATREON

### Community 57 - "Override"
Cohesion: 0.29
Nodes (3): PharaohSkin, DEFAULT, SILVER_PATREON

### Community 68 - "Entity"
Cohesion: 0.40
Nodes (5): Archivos que pasan a GitHub, .gitlab-ci.yml, Publicación a GitHub (CI/CD), Requisito previo, Variables de CI/CD (grupo GitLab)

### Community 69 - "EquipmentSlot"
Cohesion: 0.40
Nodes (5): Ejemplos, Esquema de publicación, Estructura, Inicialización única de cada rama `*/main`, Ramas

### Community 70 - "HumanoidRenderState"
Cohesion: 0.50
Nodes (4): [0.0.0-beta.28] - 2026-07-22, Docs, Infrastructure, Refactor

### Community 71 - "Identifier"
Cohesion: 0.50
Nodes (3): CLAUDE.md — ageforged_armor (26.2), Paso 0 obligatorio, Prioridad de instrucciones

### Community 72 - "LayerDefinition"
Cohesion: 0.50
Nodes (4): ¿Cuándo incrementar versión?, Esquema, Nombre del JAR, Versionado

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
Cohesion: 0.48
Nodes (3): HeadCenturionArmorModel, ModelPart, Override

### Community 77 - "ModelPart"
Cohesion: 0.33
Nodes (3): AgeforgedArmorClient, LoggingIn, RegisterLayerDefinitions

### Community 78 - "Override"
Cohesion: 0.33
Nodes (3): IronPlateSkin, ASHES, DEFAULT

### Community 79 - "Player"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.22] - 2026-07-17, Added, Fixed

### Community 85 - "ArmorMaterial"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.30] - 2026-07-22, Fixed, Infrastructure

### Community 86 - "ArmorType"
Cohesion: 0.67
Nodes (3): [0.0.0-beta.9] - 2026-07-13, Added, Changed

### Community 87 - "Holder"
Cohesion: 0.67
Nodes (3): Commits (Conventional Commits), Ejemplos, Tipos

### Community 100 - "IGlobalLootModifier"
Cohesion: 0.67
Nodes (3): Ejemplos, Formato del tag, Tags (GitLab)

### Community 110 - "Override"
Cohesion: 0.33
Nodes (5): RaijinSkin, CRYSTAL_PATREON, DEFAULT, SILVER_PATREON, SkinVariant

### Community 213 - "IGlobalLootModifier"
Cohesion: 0.38
Nodes (4): LootModifierProvider, GlobalLootModifierProvider, PackOutput, Provider

## Knowledge Gaps
- **124 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+119 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **112 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `HumanoidRenderState`, `.templateLayerDefinition`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`, `ChestHolyArmorModel`, `HeadRaijinArmorModel`, `FeetAnubisArmorModel`, `LegsAnubisArmorModel`, `FeetCenturionArmorModel`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `LegsHolyArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `LegsOYoroiArmorModel`, `FeetPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `AgeforgedArmorClient`, `gradlew`, `SkinSyncState.java`, `LootTablesToModify.java`, `CallbackInfo`, `ArmorMaterial`, `ArmorType`, `DeferredRegister`, `Holder`, `Identifier`, `IEventBus`, `ModelPart`?**
  _High betweenness centrality (0.355) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `HumanoidRenderState` to `PoseStack`, `ArmorModel`, `HatItem.java`, `HumanoidArmorItem.java`, `MixinHumanoidArmorLayer.java`, `Override`, `Logger`, `Override`, `Inject`?**
  _High betweenness centrality (0.083) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `CustomPacketPayload` to `HumanoidRenderState`?**
  _High betweenness centrality (0.046) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _124 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `AgeforgedArmor.java` be split into smaller, more focused modules?**
  _Cohesion score 0.05868118572292801 - nodes in this community are weakly interconnected._
- **Should `CustomPacketPayload` be split into smaller, more focused modules?**
  _Cohesion score 0.05714285714285714 - nodes in this community are weakly interconnected._
- **Should `HumanoidRenderState` be split into smaller, more focused modules?**
  _Cohesion score 0.1202020202020202 - nodes in this community are weakly interconnected._