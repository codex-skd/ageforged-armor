# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor  (2026-07-23)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 853 nodes · 1794 edges · 79 communities (65 shown, 14 thin omitted)
- Extraction: 95% EXTRACTED · 5% INFERRED · 0% AMBIGUOUS · INFERRED: 83 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- Community 0
- .templateLayerDefinition
- ModelProviderRegistry.java
- OYoroiSkin
- ArmorSetEffectHandler
- AgeforgedArmor.java
- PatronConfig
- MixinHumanoidArmorLayer.java
- PreferredModel
- CustomPacketPayload
- AgeforgedArmorLootModifier.java
- SkinSyncState
- ArmorMaterialRegistry
- AOTAConfig.java
- NeoForgePayloadRegistry.java
- .sinPI
- NeoForgePacketHandlers.java
- HeadAnubisArmorModel
- ChestExaltedAurumArmorModel
- LegsExaltedAurumArmorModel
- ChestHolyArmorModel
- ChestQuetzalcoatlArmorModel
- ChestRaijinArmorModel
- HeadRaijinArmorModel
- LegsRaijinArmorModel
- AotAMaterials.java
- ArmorModel
- Community 27
- Community 28
- HeadCenturionArmorModel
- LegsCenturionArmorModel
- FeetExaltedAurumArmorModel
- HeadExaltedAurumArmorModel
- FeetHolyArmorModel
- HeadHolyArmorModel
- LegsHolyArmorModel
- FeetIronPlateArmorModel
- HeadIronPlateArmorModel
- LegsIronPlateArmorModel
- FeetJapaneseLightArmorModel
- HeadJapaneseLightArmorModel
- FeetOYoroiArmorModel
- HeadOYoroiArmorModel
- LegsOYoroiArmorModel
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
- ItemRegistry.java
- LootModifierProvider.java
- FeetAnubisArmorModel
- LegsJapaneseLightArmorModel
- IronPlateSkin.java
- LootModifiers.java
- PreferenceSyncPayload
- AgeforgedArmorClient.java
- Items
- gradlew
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
1. `ArmorModel` - 137 edges
2. `ArmorModelProvider` - 29 edges
3. `SkinSyncState` - 26 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `PreferredModel` - 15 edges
7. `MixedArmorModelProvider` - 14 edges
8. `GlobalPreferenceSyncPayload` - 14 edges
9. `GlobalSkinSyncPayload` - 14 edges
10. `SkinSyncPayload` - 14 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --references--> `Items`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/AotATags.java
- `ItemRegistryImpl` --inherits--> `ItemRegistry`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/ItemRegistry.java
- `CommonClass` --references--> `SkinSyncState`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/CommonClass.java → src/main/java/com/skd/ageforgedarmor/config/SkinSyncState.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `IronPlateSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/IronPlateSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (79 total, 14 thin omitted)

### Community 0 - "Community 0"
Cohesion: 0.06
Nodes (47): AbstractClientPlayer, ChatFormatting, InteractionHand, InteractionResult, Item, ItemAttributeModifiers, Level, MutableComponent (+39 more)

### Community 1 - ".templateLayerDefinition"
Cohesion: 0.05
Nodes (23): LayerDefinition, LayerDefinition, ChestCenturionArmorModel, LayerDefinition, ModelPart, Override, ChestIronPlateArmorModel, LayerDefinition (+15 more)

### Community 2 - "ModelProviderRegistry.java"
Cohesion: 0.11
Nodes (25): ModelLayerLocation, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, Entity, EquipmentSlot, Identifier, LayerDefinition, NotNull (+17 more)

### Community 3 - "OYoroiSkin"
Cohesion: 0.05
Nodes (33): SkinVariant, CenturionSkin, DEFAULT, SILVER_PATREON, getTexturePrefix(), Override, toString(), getTexturePrefix() (+25 more)

### Community 4 - "ArmorSetEffectHandler"
Cohesion: 0.28
Nodes (6): MobEffect, ArmorSetEffectHandler, EquipmentSlot, Holder, ItemStack, Player

### Community 5 - "AgeforgedArmor.java"
Cohesion: 0.13
Nodes (17): CreativeModeTab, Mod, ModContainer, ObjectArrayList, Post, Server, AgeforgedArmor, ItemRegistryImpl (+9 more)

### Community 6 - "PatronConfig"
Cohesion: 0.14
Nodes (11): Gson, PlayerLoggedInEvent, Logger, PatronConfig, PatronData, PatronEntry, Logger, PatronFetcher (+3 more)

### Community 7 - "MixinHumanoidArmorLayer.java"
Cohesion: 0.27
Nodes (13): CallbackInfo, EquipmentSlot, HumanoidArmorLayer, HumanoidRenderState, Inject, ItemStack, Mixin, Operation (+5 more)

### Community 8 - "PreferredModel"
Cohesion: 0.20
Nodes (7): CommonClass, Player, PreferredModel, FEMALE, MALE, ConfigSyncNetworkHandler, ServerPlayer

### Community 9 - "CustomPacketPayload"
Cohesion: 0.23
Nodes (11): CustomPacketPayload, DisableSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type, FriendlyByteBuf, Override (+3 more)

### Community 10 - "AgeforgedArmorLootModifier.java"
Cohesion: 0.27
Nodes (9): LootContext, LootItemCondition, LootModifier, AgeforgedArmorLootModifier, IGlobalLootModifier, ItemStack, MapCodec, NotNull (+1 more)

### Community 11 - "SkinSyncState"
Cohesion: 0.25
Nodes (5): MinecraftServer, SkinSyncState, ForgeConfigSyncNetworkHandler, Override, ServerPlayer

### Community 12 - "ArmorMaterialRegistry"
Cohesion: 0.22
Nodes (8): ArmorMaterialRegistry, ArmorMaterial, Holder, Identifier, ArmorMaterialRegistryNeoForge, ArmorMaterial, Holder, Override

### Community 13 - "AOTAConfig.java"
Cohesion: 0.22
Nodes (6): ConfigClassHandler, ClientPatronState, AOTAConfig, Constants, LootTablesToModify, YetAnotherConfigLib

### Community 14 - "NeoForgePayloadRegistry.java"
Cohesion: 0.25
Nodes (7): RegisterPayloadHandlersEvent, NeoForgePayloadRegistry, DisablePreferencesPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 15 - ".sinPI"
Cohesion: 0.33
Nodes (3): ChestAnubisArmorModel, ModelPart, Override

### Community 17 - "HeadAnubisArmorModel"
Cohesion: 0.33
Nodes (4): HeadAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 18 - "ChestExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "LegsExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsExaltedAurumArmorModel

### Community 20 - "ChestHolyArmorModel"
Cohesion: 0.33
Nodes (4): ChestHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "ChestRaijinArmorModel"
Cohesion: 0.33
Nodes (4): ChestRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 24 - "LegsRaijinArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 25 - "AotAMaterials.java"
Cohesion: 0.36
Nodes (6): EquipmentAsset, ResourceKey, AotAMaterials, ArmorMaterial, ArmorType, Holder

### Community 26 - "ArmorModel"
Cohesion: 0.31
Nodes (5): HumanoidModel, MeshDefinition, ArmorModel, ModelPart, Override

### Community 27 - "Community 27"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 28 - "Community 28"
Cohesion: 0.33
Nodes (4): FeetCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 29 - "HeadCenturionArmorModel"
Cohesion: 0.33
Nodes (4): HeadCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 30 - "LegsCenturionArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 31 - "FeetExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 32 - "HeadExaltedAurumArmorModel"
Cohesion: 0.33
Nodes (4): HeadExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 33 - "FeetHolyArmorModel"
Cohesion: 0.36
Nodes (4): FeetHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 34 - "HeadHolyArmorModel"
Cohesion: 0.36
Nodes (4): HeadHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 35 - "LegsHolyArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 36 - "FeetIronPlateArmorModel"
Cohesion: 0.33
Nodes (4): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 37 - "HeadIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "LegsIronPlateArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 39 - "FeetJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 40 - "HeadJapaneseLightArmorModel"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 41 - "FeetOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 42 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 43 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

### Community 44 - "FeetPharaohArmorModel"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 45 - "HeadPharaohArmorModel"
Cohesion: 0.36
Nodes (4): HeadPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 46 - "LegsPharaohArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 47 - "FeetQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): FeetQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 48 - "HeadQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 49 - "LegsQuetzalcoatlArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 50 - "FeetRaijinArmorModel"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 51 - "GlobalPreferenceSyncPayload"
Cohesion: 0.36
Nodes (5): GlobalPreferenceSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 52 - "GlobalSkinSyncPayload"
Cohesion: 0.36
Nodes (5): GlobalSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 53 - "SkinSyncPayload"
Cohesion: 0.36
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, SkinSyncPayload

### Community 54 - "ItemRegistry.java"
Cohesion: 0.42
Nodes (6): ItemRegistry, ArmorMaterial, ArmorType, Holder, Item, Logger

### Community 55 - "LootModifierProvider.java"
Cohesion: 0.32
Nodes (5): GlobalLootModifierProvider, PackOutput, Provider, Override, LootModifierProvider

### Community 56 - "FeetAnubisArmorModel"
Cohesion: 0.48
Nodes (3): FeetAnubisArmorModel, ModelPart, Override

### Community 57 - "LegsJapaneseLightArmorModel"
Cohesion: 0.48
Nodes (3): ModelPart, Override, LegsJapaneseLightArmorModel

### Community 58 - "IronPlateSkin.java"
Cohesion: 0.33
Nodes (6): getTexturePrefix(), IronPlateSkin, ASHES, DEFAULT, Override, toString()

### Community 59 - "LootModifiers.java"
Cohesion: 0.48
Nodes (5): DeferredRegister, IEventBus, IGlobalLootModifier, MapCodec, LootModifiers

### Community 60 - "PreferenceSyncPayload"
Cohesion: 0.43
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, PreferenceSyncPayload

### Community 61 - "AgeforgedArmorClient.java"
Cohesion: 0.33
Nodes (3): LoggingIn, RegisterLayerDefinitions, AgeforgedArmorClient

### Community 62 - "Items"
Cohesion: 0.60
Nodes (4): AotATags, Items, Item, TagKey

### Community 63 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **24 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+19 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **14 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `Community 0`, `.templateLayerDefinition`, `ModelProviderRegistry.java`, `.sinPI`, `HeadAnubisArmorModel`, `ChestExaltedAurumArmorModel`, `LegsExaltedAurumArmorModel`, `ChestHolyArmorModel`, `ChestQuetzalcoatlArmorModel`, `ChestRaijinArmorModel`, `HeadRaijinArmorModel`, `LegsRaijinArmorModel`, `Community 27`, `Community 28`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `HeadHolyArmorModel`, `LegsHolyArmorModel`, `FeetIronPlateArmorModel`, `HeadIronPlateArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `FeetOYoroiArmorModel`, `HeadOYoroiArmorModel`, `LegsOYoroiArmorModel`, `FeetPharaohArmorModel`, `HeadPharaohArmorModel`, `LegsPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`, `FeetAnubisArmorModel`, `LegsJapaneseLightArmorModel`?**
  _High betweenness centrality (0.481) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `ModelProviderRegistry.java` to `Community 0`, `ArmorModel`, `OYoroiSkin`, `IronPlateSkin.java`?**
  _High betweenness centrality (0.103) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `SkinSyncState` to `ModelProviderRegistry.java`, `OYoroiSkin`, `PreferredModel`, `GlobalSkinSyncPayload`, `SkinSyncPayload`, `IronPlateSkin.java`?**
  _High betweenness centrality (0.093) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _24 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `Community 0` be split into smaller, more focused modules?**
  _Cohesion score 0.05745814307458143 - nodes in this community are weakly interconnected._
- **Should `.templateLayerDefinition` be split into smaller, more focused modules?**
  _Cohesion score 0.05384150030248034 - nodes in this community are weakly interconnected._
- **Should `ModelProviderRegistry.java` be split into smaller, more focused modules?**
  _Cohesion score 0.11058823529411765 - nodes in this community are weakly interconnected._