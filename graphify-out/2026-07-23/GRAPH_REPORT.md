# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor  (2026-07-23)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 854 nodes · 1838 edges · 80 communities (65 shown, 15 thin omitted)
- Extraction: 95% EXTRACTED · 5% INFERRED · 0% AMBIGUOUS · INFERRED: 83 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- .templateLayerDefinition
- HatItem.java
- ModelProviderRegistry.java
- HumanoidRenderState
- SkinSyncState
- ArmorSetEffectHandler
- CustomPacketPayload
- AotAMaterials.java
- PatronConfig
- AgeforgedArmor.java
- AgeforgedArmorLootModifier.java
- CenturionSkin.java
- ArmorModel
- OYoroiSkin
- .sinPI
- MixinAvatarRenderer.java
- NeoForgePacketHandlers.java
- HeadAnubisArmorModel
- ChestExaltedAurumArmorModel
- LegsExaltedAurumArmorModel
- ChestHolyArmorModel
- ChestJapaneseLightArmorModel
- ChestQuetzalcoatlArmorModel
- HeadRaijinArmorModel
- LegsRaijinArmorModel
- AOTAConfig.java
- FeetAnubisArmorModel
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
- LegsJapaneseLightArmorModel
- HeadOYoroiArmorModel
- LegsOYoroiArmorModel
- HeadPharaohArmorModel
- LegsPharaohArmorModel
- FeetQuetzalcoatlArmorModel
- HeadQuetzalcoatlArmorModel
- LegsQuetzalcoatlArmorModel
- FeetRaijinArmorModel
- RaijinSkin.java
- GlobalPreferenceSyncPayload
- GlobalSkinSyncPayload
- SkinSyncPayload
- ItemRegistry.java
- LootModifierProvider.java
- PatronTierPayload
- LootModifiers.java
- PreferenceSyncPayload
- AgeforgedArmorClient.java
- .AgeforgedArmor
- ArmorMaterialRegistryNeoForge.java
- gradlew
- HumanoidRenderState
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
- PharaohSkin.java

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
- `ItemRegistryImpl` --inherits--> `ItemRegistry`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/ItemRegistry.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `OYoroiSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/OYoroiSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `PharaohSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/PharaohSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java
- `RaijinSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/RaijinSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (80 total, 15 thin omitted)

### Community 0 - ".templateLayerDefinition"
Cohesion: 0.06
Nodes (21): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override, ChestIronPlateArmorModel, LayerDefinition, ModelPart, Override (+13 more)

### Community 1 - "HatItem.java"
Cohesion: 0.08
Nodes (33): ChatFormatting, InteractionHand, InteractionResult, Item, ItemAttributeModifiers, Level, MutableComponent, Nullable (+25 more)

### Community 2 - "ModelProviderRegistry.java"
Cohesion: 0.12
Nodes (23): ModelLayerLocation, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, Entity, EquipmentSlot, Identifier, LayerDefinition, NotNull (+15 more)

### Community 3 - "HumanoidRenderState"
Cohesion: 0.10
Nodes (25): CallbackInfo, EquipmentSlot, HumanoidArmorLayer, HumanoidModel, HumanoidRenderState, Inject, ItemStack, MeshDefinition (+17 more)

### Community 4 - "SkinSyncState"
Cohesion: 0.13
Nodes (12): MinecraftServer, CommonClass, Player, PreferredModel, FEMALE, MALE, SkinSyncState, ConfigSyncNetworkHandler (+4 more)

### Community 5 - "ArmorSetEffectHandler"
Cohesion: 0.28
Nodes (6): MobEffect, ArmorSetEffectHandler, EquipmentSlot, Holder, ItemStack, Player

### Community 6 - "CustomPacketPayload"
Cohesion: 0.23
Nodes (11): CustomPacketPayload, DisablePreferencesPayload, FriendlyByteBuf, Override, StreamCodec, Type, DisableSkinSyncPayload, FriendlyByteBuf (+3 more)

### Community 7 - "AotAMaterials.java"
Cohesion: 0.14
Nodes (14): EquipmentAsset, ResourceKey, AotAMaterials, ArmorMaterial, ArmorType, Holder, AotATags, Items (+6 more)

### Community 8 - "PatronConfig"
Cohesion: 0.14
Nodes (11): Gson, PlayerLoggedInEvent, Logger, PatronConfig, PatronData, PatronEntry, Logger, PatronFetcher (+3 more)

### Community 9 - "AgeforgedArmor.java"
Cohesion: 0.16
Nodes (15): CreativeModeTab, Items, Mod, Post, Server, AgeforgedArmor, ItemRegistryImpl, ArmorMaterial (+7 more)

### Community 10 - "AgeforgedArmorLootModifier.java"
Cohesion: 0.22
Nodes (10): LootContext, LootItemCondition, LootModifier, ObjectArrayList, AgeforgedArmorLootModifier, IGlobalLootModifier, ItemStack, MapCodec (+2 more)

### Community 11 - "CenturionSkin.java"
Cohesion: 0.13
Nodes (13): SkinVariant, CenturionSkin, DEFAULT, SILVER_PATREON, getTexturePrefix(), Override, toString(), getTexturePrefix() (+5 more)

### Community 12 - "ArmorModel"
Cohesion: 0.22
Nodes (6): ModelPart, ArmorModel, Override, FeetPharaohArmorModel, ModelPart, Override

### Community 13 - "OYoroiSkin"
Cohesion: 0.14
Nodes (13): getTexturePrefix(), Override, OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK (+5 more)

### Community 14 - ".sinPI"
Cohesion: 0.24
Nodes (4): ChestAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 15 - "MixinAvatarRenderer.java"
Cohesion: 0.40
Nodes (9): AbstractClientPlayer, CallbackInfo, Identifier, Inject, Mixin, PoseStack, SubmitNodeCollector, Unique (+1 more)

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

### Community 21 - "ChestJapaneseLightArmorModel"
Cohesion: 0.31
Nodes (4): ChestJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "ChestQuetzalcoatlArmorModel"
Cohesion: 0.33
Nodes (4): ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "HeadRaijinArmorModel"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 24 - "LegsRaijinArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 25 - "AOTAConfig.java"
Cohesion: 0.28
Nodes (5): ConfigClassHandler, ClientPatronState, AOTAConfig, Constants, LootTablesToModify

### Community 26 - "FeetAnubisArmorModel"
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

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

### Community 41 - "LegsJapaneseLightArmorModel"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 42 - "HeadOYoroiArmorModel"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 43 - "LegsOYoroiArmorModel"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

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

### Community 50 - "RaijinSkin.java"
Cohesion: 0.25
Nodes (7): getTexturePrefix(), Override, RaijinSkin, CRYSTAL_PATREON, DEFAULT, SILVER_PATREON, toString()

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

### Community 56 - "PatronTierPayload"
Cohesion: 0.25
Nodes (7): RegisterPayloadHandlersEvent, NeoForgePayloadRegistry, FriendlyByteBuf, Override, StreamCodec, Type, PatronTierPayload

### Community 57 - "LootModifiers.java"
Cohesion: 0.48
Nodes (5): DeferredRegister, IEventBus, IGlobalLootModifier, MapCodec, LootModifiers

### Community 58 - "PreferenceSyncPayload"
Cohesion: 0.43
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, PreferenceSyncPayload

### Community 59 - "AgeforgedArmorClient.java"
Cohesion: 0.33
Nodes (3): LoggingIn, RegisterLayerDefinitions, AgeforgedArmorClient

### Community 60 - ".AgeforgedArmor"
Cohesion: 0.33
Nodes (3): ModContainer, IEventBus, YetAnotherConfigLib

### Community 61 - "ArmorMaterialRegistryNeoForge.java"
Cohesion: 0.47
Nodes (4): ArmorMaterialRegistryNeoForge, ArmorMaterial, Holder, Override

### Community 62 - "gradlew"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

### Community 79 - "PharaohSkin.java"
Cohesion: 0.29
Nodes (6): getTexturePrefix(), Override, PharaohSkin, DEFAULT, SILVER_PATREON, toString()

## Knowledge Gaps
- **24 isolated node(s):** `AotATags`, `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON` (+19 more)
  These have ≤1 connection - possible missing edges or undocumented components.
- **15 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `ArmorModel` to `.templateLayerDefinition`, `ModelProviderRegistry.java`, `HumanoidRenderState`, `.sinPI`, `MixinAvatarRenderer.java`, `HeadAnubisArmorModel`, `ChestExaltedAurumArmorModel`, `LegsExaltedAurumArmorModel`, `ChestHolyArmorModel`, `ChestJapaneseLightArmorModel`, `ChestQuetzalcoatlArmorModel`, `HeadRaijinArmorModel`, `LegsRaijinArmorModel`, `FeetAnubisArmorModel`, `Community 27`, `Community 28`, `HeadCenturionArmorModel`, `LegsCenturionArmorModel`, `FeetExaltedAurumArmorModel`, `HeadExaltedAurumArmorModel`, `FeetHolyArmorModel`, `HeadHolyArmorModel`, `LegsHolyArmorModel`, `FeetIronPlateArmorModel`, `HeadIronPlateArmorModel`, `LegsIronPlateArmorModel`, `FeetJapaneseLightArmorModel`, `HeadJapaneseLightArmorModel`, `LegsJapaneseLightArmorModel`, `HeadOYoroiArmorModel`, `LegsOYoroiArmorModel`, `HeadPharaohArmorModel`, `LegsPharaohArmorModel`, `FeetQuetzalcoatlArmorModel`, `HeadQuetzalcoatlArmorModel`, `LegsQuetzalcoatlArmorModel`, `FeetRaijinArmorModel`?**
  _High betweenness centrality (0.464) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `ModelProviderRegistry.java` to `HatItem.java`, `HumanoidRenderState`, `CenturionSkin.java`, `ArmorModel`, `OYoroiSkin`, `PharaohSkin.java`, `MixinAvatarRenderer.java`, `RaijinSkin.java`?**
  _High betweenness centrality (0.102) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `SkinSyncState` to `ModelProviderRegistry.java`, `CenturionSkin.java`, `OYoroiSkin`, `PharaohSkin.java`, `RaijinSkin.java`, `GlobalSkinSyncPayload`, `SkinSyncPayload`?**
  _High betweenness centrality (0.092) - this node is a cross-community bridge._
- **What connects `AotATags`, `Constants`, `ClientPatronState` to the rest of the system?**
  _24 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `.templateLayerDefinition` be split into smaller, more focused modules?**
  _Cohesion score 0.06095791001451379 - nodes in this community are weakly interconnected._
- **Should `HatItem.java` be split into smaller, more focused modules?**
  _Cohesion score 0.07918552036199095 - nodes in this community are weakly interconnected._
- **Should `ModelProviderRegistry.java` be split into smaller, more focused modules?**
  _Cohesion score 0.12173913043478261 - nodes in this community are weakly interconnected._