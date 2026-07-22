# Graph Report - G:\Proyectos\Mods_Minecraft\ageforged_armor  (2026-07-22)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 847 nodes · 1814 edges · 61 communities
- Extraction: 95% EXTRACTED · 5% INFERRED · 0% AMBIGUOUS · INFERRED: 86 edges (avg confidence: 0.8)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- Community 0
- Community 1
- Community 2
- Community 3
- Community 4
- Community 5
- Community 6
- Community 7
- Community 8
- Community 9
- Community 10
- Community 11
- Community 12
- Community 13
- Community 14
- Community 15
- Community 16
- Community 17
- Community 18
- Community 19
- Community 20
- Community 21
- Community 22
- Community 23
- Community 24
- Community 25
- Community 26
- Community 27
- Community 28
- Community 29
- Community 30
- Community 31
- Community 32
- Community 33
- Community 34
- Community 35
- Community 36
- Community 37
- Community 38
- Community 39
- Community 40
- Community 41
- Community 42
- Community 43
- Community 44
- Community 45
- Community 46
- Community 47
- Community 48
- Community 49
- Community 50
- Community 51
- Community 52
- Community 53
- Community 54
- Community 55
- Community 56
- Community 57
- Community 58

## God Nodes (most connected - your core abstractions)
1. `ArmorModel` - 138 edges
2. `ArmorModelProvider` - 30 edges
3. `SkinSyncState` - 26 edges
4. `ArmorSetEffectHandler` - 21 edges
5. `ArmorModelSupplier` - 15 edges
6. `PreferredModel` - 15 edges
7. `MixedArmorModelProvider` - 14 edges
8. `HumanoidArmorItem` - 14 edges
9. `GlobalPreferenceSyncPayload` - 14 edges
10. `GlobalSkinSyncPayload` - 14 edges

## Surprising Connections (you probably didn't know these)
- `ItemRegistryImpl` --references--> `Items`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/AotATags.java
- `ItemRegistryImpl` --inherits--> `ItemRegistry`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/AgeforgedArmor.java → src/main/java/com/skd/ageforgedarmor/registry/ItemRegistry.java
- `CommonClass` --references--> `SkinSyncState`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/CommonClass.java → src/main/java/com/skd/ageforgedarmor/config/SkinSyncState.java
- `ArmorModelProvider` --references--> `ArmorModel`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java → src/main/java/com/skd/ageforgedarmor/client/models/ArmorModel.java
- `CenturionSkin` --implements--> `SkinVariant`  [EXTRACTED]
  src/main/java/com/skd/ageforgedarmor/config/CenturionSkin.java → src/main/java/com/skd/ageforgedarmor/client/ArmorModelProvider.java

## Import Cycles
- None detected.

## Communities (61 total, 0 thin omitted)

### Community 0 - "Community 0"
Cohesion: 0.06
Nodes (47): AbstractClientPlayer, ChatFormatting, InteractionHand, InteractionResult, Item, ItemAttributeModifiers, Level, MutableComponent (+39 more)

### Community 1 - "Community 1"
Cohesion: 0.06
Nodes (22): ChestCenturionArmorModel, LayerDefinition, ModelPart, Override, LayerDefinition, LayerDefinition, LayerDefinition, ModelPart (+14 more)

### Community 2 - "Community 2"
Cohesion: 0.07
Nodes (31): CustomPacketPayload, IPayloadContext, RegisterPayloadHandlersEvent, ClientPatronState, NeoForgePacketHandlers, NeoForgePayloadRegistry, DisablePreferencesPayload, FriendlyByteBuf (+23 more)

### Community 3 - "Community 3"
Cohesion: 0.11
Nodes (25): ModelLayerLocation, AnimatedArmorModelProvider, AnimatedMixedArmorModelProvider, Entity, EquipmentSlot, Identifier, LayerDefinition, NotNull (+17 more)

### Community 4 - "Community 4"
Cohesion: 0.10
Nodes (12): ChestAnubisArmorModel, LayerDefinition, ModelPart, Override, HeadHolyArmorModel, LayerDefinition, ModelPart, Override (+4 more)

### Community 5 - "Community 5"
Cohesion: 0.28
Nodes (6): MobEffect, ArmorSetEffectHandler, EquipmentSlot, Holder, ItemStack, Player

### Community 6 - "Community 6"
Cohesion: 0.20
Nodes (17): HumanoidArmorLayer, Operation, CallbackInfo, EquipmentSlot, HumanoidModel, HumanoidRenderState, Inject, ItemStack (+9 more)

### Community 7 - "Community 7"
Cohesion: 0.13
Nodes (17): CreativeModeTab, Mod, ModContainer, Post, Server, AgeforgedArmor, ItemRegistryImpl, ArmorMaterial (+9 more)

### Community 8 - "Community 8"
Cohesion: 0.14
Nodes (14): EquipmentAsset, ResourceKey, AotAMaterials, ArmorMaterial, ArmorType, Holder, AotATags, Items (+6 more)

### Community 9 - "Community 9"
Cohesion: 0.14
Nodes (11): Gson, PlayerLoggedInEvent, Logger, PatronConfig, PatronData, PatronEntry, Logger, PatronFetcher (+3 more)

### Community 10 - "Community 10"
Cohesion: 0.22
Nodes (10): LootContext, LootItemCondition, LootModifier, ObjectArrayList, AgeforgedArmorLootModifier, IGlobalLootModifier, ItemStack, MapCodec (+2 more)

### Community 11 - "Community 11"
Cohesion: 0.20
Nodes (7): CommonClass, Player, PreferredModel, FEMALE, MALE, ConfigSyncNetworkHandler, ServerPlayer

### Community 12 - "Community 12"
Cohesion: 0.14
Nodes (13): getTexturePrefix(), Override, OYoroiSkin, AMBER, AMETHYST_PATREON, DEFAULT, DUSK, INK (+5 more)

### Community 13 - "Community 13"
Cohesion: 0.25
Nodes (5): MinecraftServer, SkinSyncState, ForgeConfigSyncNetworkHandler, Override, ServerPlayer

### Community 14 - "Community 14"
Cohesion: 0.20
Nodes (7): GlobalLootModifierProvider, PackOutput, Provider, Constants, Override, LootModifierProvider, LootTablesToModify

### Community 15 - "Community 15"
Cohesion: 0.29
Nodes (6): getTexturePrefix(), Override, PharaohSkin, DEFAULT, SILVER_PATREON, toString()

### Community 16 - "Community 16"
Cohesion: 0.33
Nodes (4): HeadAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 17 - "Community 17"
Cohesion: 0.33
Nodes (4): ChestExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 18 - "Community 18"
Cohesion: 0.31
Nodes (4): ChestOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 19 - "Community 19"
Cohesion: 0.31
Nodes (4): ChestPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 20 - "Community 20"
Cohesion: 0.33
Nodes (4): ChestQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 21 - "Community 21"
Cohesion: 0.33
Nodes (4): ChestRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 22 - "Community 22"
Cohesion: 0.33
Nodes (4): HeadRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 23 - "Community 23"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsRaijinArmorModel

### Community 24 - "Community 24"
Cohesion: 0.31
Nodes (5): HumanoidModel, MeshDefinition, ArmorModel, ModelPart, Override

### Community 25 - "Community 25"
Cohesion: 0.25
Nodes (7): SkinVariant, getTexturePrefix(), IronPlateSkin, ASHES, DEFAULT, Override, toString()

### Community 26 - "Community 26"
Cohesion: 0.33
Nodes (4): FeetAnubisArmorModel, LayerDefinition, ModelPart, Override

### Community 27 - "Community 27"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsAnubisArmorModel

### Community 28 - "Community 28"
Cohesion: 0.33
Nodes (4): FeetCenturionArmorModel, LayerDefinition, ModelPart, Override

### Community 29 - "Community 29"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsCenturionArmorModel

### Community 30 - "Community 30"
Cohesion: 0.33
Nodes (4): FeetExaltedAurumArmorModel, LayerDefinition, ModelPart, Override

### Community 31 - "Community 31"
Cohesion: 0.36
Nodes (4): FeetHolyArmorModel, LayerDefinition, ModelPart, Override

### Community 32 - "Community 32"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsHolyArmorModel

### Community 33 - "Community 33"
Cohesion: 0.33
Nodes (4): FeetIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 34 - "Community 34"
Cohesion: 0.36
Nodes (4): HeadIronPlateArmorModel, LayerDefinition, ModelPart, Override

### Community 35 - "Community 35"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsIronPlateArmorModel

### Community 36 - "Community 36"
Cohesion: 0.33
Nodes (4): FeetJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 37 - "Community 37"
Cohesion: 0.36
Nodes (4): HeadJapaneseLightArmorModel, LayerDefinition, ModelPart, Override

### Community 38 - "Community 38"
Cohesion: 0.33
Nodes (4): LayerDefinition, ModelPart, Override, LegsJapaneseLightArmorModel

### Community 39 - "Community 39"
Cohesion: 0.33
Nodes (4): FeetOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 40 - "Community 40"
Cohesion: 0.33
Nodes (4): HeadOYoroiArmorModel, LayerDefinition, ModelPart, Override

### Community 41 - "Community 41"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsOYoroiArmorModel

### Community 42 - "Community 42"
Cohesion: 0.33
Nodes (4): FeetPharaohArmorModel, LayerDefinition, ModelPart, Override

### Community 43 - "Community 43"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsPharaohArmorModel

### Community 44 - "Community 44"
Cohesion: 0.36
Nodes (4): FeetQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 45 - "Community 45"
Cohesion: 0.36
Nodes (4): HeadQuetzalcoatlArmorModel, LayerDefinition, ModelPart, Override

### Community 46 - "Community 46"
Cohesion: 0.36
Nodes (4): LayerDefinition, ModelPart, Override, LegsQuetzalcoatlArmorModel

### Community 47 - "Community 47"
Cohesion: 0.33
Nodes (4): FeetRaijinArmorModel, LayerDefinition, ModelPart, Override

### Community 48 - "Community 48"
Cohesion: 0.25
Nodes (7): getTexturePrefix(), Override, RaijinSkin, CRYSTAL_PATREON, DEFAULT, SILVER_PATREON, toString()

### Community 49 - "Community 49"
Cohesion: 0.36
Nodes (5): GlobalSkinSyncPayload, FriendlyByteBuf, Override, StreamCodec, Type

### Community 50 - "Community 50"
Cohesion: 0.36
Nodes (5): FriendlyByteBuf, Override, StreamCodec, Type, SkinSyncPayload

### Community 51 - "Community 51"
Cohesion: 0.42
Nodes (6): ItemRegistry, ArmorMaterial, ArmorType, Holder, Item, Logger

### Community 52 - "Community 52"
Cohesion: 0.22
Nodes (8): ConfigClassHandler, AOTAConfig, CenturionSkin, DEFAULT, SILVER_PATREON, getTexturePrefix(), Override, toString()

### Community 53 - "Community 53"
Cohesion: 0.48
Nodes (3): HeadCenturionArmorModel, ModelPart, Override

### Community 54 - "Community 54"
Cohesion: 0.48
Nodes (3): HeadExaltedAurumArmorModel, ModelPart, Override

### Community 55 - "Community 55"
Cohesion: 0.48
Nodes (5): DeferredRegister, IEventBus, IGlobalLootModifier, MapCodec, LootModifiers

### Community 56 - "Community 56"
Cohesion: 0.33
Nodes (3): LoggingIn, RegisterLayerDefinitions, AgeforgedArmorClient

### Community 57 - "Community 57"
Cohesion: 0.47
Nodes (4): ArmorMaterialRegistryNeoForge, ArmorMaterial, Holder, Override

### Community 58 - "Community 58"
Cohesion: 0.83
Nodes (3): gradlew script, die(), warn()

## Knowledge Gaps
- **24 isolated node(s):** `Constants`, `ClientPatronState`, `DEFAULT`, `SILVER_PATREON`, `DEFAULT` (+19 more)
  These have ≤1 connection - possible missing edges or undocumented components.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ArmorModel` connect `Community 24` to `Community 0`, `Community 1`, `Community 3`, `Community 4`, `Community 6`, `Community 16`, `Community 17`, `Community 18`, `Community 19`, `Community 20`, `Community 21`, `Community 22`, `Community 23`, `Community 26`, `Community 27`, `Community 28`, `Community 29`, `Community 30`, `Community 31`, `Community 32`, `Community 33`, `Community 34`, `Community 35`, `Community 36`, `Community 37`, `Community 38`, `Community 39`, `Community 40`, `Community 41`, `Community 42`, `Community 43`, `Community 44`, `Community 45`, `Community 46`, `Community 47`, `Community 53`, `Community 54`?**
  _High betweenness centrality (0.501) - this node is a cross-community bridge._
- **Why does `ArmorModelProvider` connect `Community 3` to `Community 0`, `Community 6`, `Community 12`, `Community 15`, `Community 48`, `Community 52`, `Community 24`, `Community 25`?**
  _High betweenness centrality (0.113) - this node is a cross-community bridge._
- **Why does `SkinSyncState` connect `Community 13` to `Community 3`, `Community 11`, `Community 12`, `Community 15`, `Community 48`, `Community 49`, `Community 50`, `Community 52`, `Community 25`?**
  _High betweenness centrality (0.092) - this node is a cross-community bridge._
- **What connects `Constants`, `ClientPatronState`, `DEFAULT` to the rest of the system?**
  _24 weakly-connected nodes found - possible documentation gaps or missing edges._
- **Should `Community 0` be split into smaller, more focused modules?**
  _Cohesion score 0.05745814307458143 - nodes in this community are weakly interconnected._
- **Should `Community 1` be split into smaller, more focused modules?**
  _Cohesion score 0.05858585858585859 - nodes in this community are weakly interconnected._
- **Should `Community 2` be split into smaller, more focused modules?**
  _Cohesion score 0.07058001397624039 - nodes in this community are weakly interconnected._