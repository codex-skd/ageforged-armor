# Changelog

All notable changes to this project will be documented in this file.

---

## [0.0.0-beta.19] - 2026-07-17

### Fixed
- Crash al equipar cualquier armadura del mod: `Can't find part hat` — todos los modelos de cabeza reemplazaban el `head` con `addOrReplaceChild`, perdiendo el child `hat` que MC 26.1 exige en `HumanoidModel`. Cambiado a `getChild("head")` para preservarlo.
- `ArmorModel.templateLayerDefinition()` añadía `hat` como sibling de `head` en lugar de child.

## [0.0.0-beta.18] - 2026-07-17

### Fixed
- Crash al iniciar el juego: el handler `@WrapOperation` de MixinExtras no incluía el parámetro `HumanoidArmorLayer` (target instance) necesario para envolver un `INVOKEVIRTUAL`. Esto provocaba un `MixinApplyError` al cargar `HumanoidArmorLayer`, crasheando el juego durante el registro de entity renderers.

## [0.0.0-beta.17] - 2026-07-16

### Docs
- Actualizado WORKFLOW.md con secciones de Ramas, tags con prefijo MC/NeoForge y git checkout en flujo

## [0.0.0-beta.16] - 2026-07-16

### Fixed
- NullPointerException al renderizar armadura: `isSlim()` con entity=null (desde IClientItemExtensions)
- Crash "Cannot invoke Entity.getUUID() because entity is null" 
- Vanilla EquipmentLayerRenderer ya no intenta renderizar items custom (WrapOperation renderArmorPiece)
- `ForgeHumanoidArmorItem.getHumanoidArmorModel()` simplificado para no acceder al provider sin entidad

## [0.0.0-beta.15] - 2026-07-16

### Fixed
- Armor not rendering on player when equipped: replaced @Inject shouldRender with @WrapOperation for robustness
- Mixin no longer crashes if shouldRender/renderArmorPiece methods have different signatures across MC versions
- Added `require = 0` to all mixin injections for graceful handling of version mismatches

### Changed
- Mixin now uses MixinExtras WrapOperation instead of plain @Inject
- Better compatibility with MC 26.1 render system changes

## [0.0.0-beta.14] - 2026-07-13

### Changed
- Simplified mixin: removed renderArmorPiece cancellation, keep shouldRender cancellation
- Conditional logging only when equipment is present

## [0.0.0-beta.13] - 2026-07-13

### Changed
- Armor render type to entityCutout for shader compatibility
- Mixin logs to INFO level with [AFA] prefix for debugging

## [0.0.0-beta.12] - 2026-07-13

### Added
- Spanish translations for set bonus descriptions and tooltips
- Set bonus keys added to all 31 language files

### Fixed
- Armor animation on player (ArmorModel.setupAnim now calls super.setupAnim)
- Head rotation, arm swing, and leg movement now work on worn armor

## [0.0.0-beta.11] - 2026-07-13

### Fixed
- Armor not rendering on player when worn
- Use armorCutoutNoCull RenderType instead of entityCutout for armor models

## [0.0.0-beta.10] - 2026-07-13

### Fixed
- All items showing as missing texture (purple/black) in MC 26.1
- MC 26.1 requires items/<name>.json definitions (new format)
- Added 42 item definition files in assets/ageforged_armor/items/

## [0.0.0-beta.9] - 2026-07-13

### Added
- Debug logging for texture loading (ItemRegistry, ArmorModelProvider, Mixin)

### Changed
- docs/curseforge/ directory structure (moved under docs/)

## [0.0.0-beta.8] - 2026-07-13

### Fixed
- Item model for creative tab icon renamed to match registry name
- pack.mcmeta format updated to 64 for Minecraft 26.1
- All textures now load correctly

## [0.0.0-beta.7] - 2026-07-13

### Fixed
- pack.mcmeta pack_format 8 -> 64 (Minecraft 26.1 requirement)

## [0.0.0-beta.6] - 2026-07-13

### Fixed
- Mixin descriptor mismatch in renderArmorPiece

## [0.0.0-beta.5] - 2026-07-13

### Fixed
- Item registration crash: migrated to registerItem() API with pre-configured Item.Properties

## [0.0.0-beta.4] - 2026-07-13

### Fixed
- Item registration crash: DeferredRegister<Item> -> DeferredRegister.Items

## [0.0.0-beta.3] - 2026-07-13

### Fixed
- Crash on startup: GatherDataEvent is now abstract, use GatherDataEvent.Server

## [0.0.0-beta.2] - 2026-07-13

### Changed
- New project logo
- Cleaned up migration artifacts

## [0.0.0-beta.1] - 2026-07-13

### Added
- Initial beta release
- 11 armor sets with custom 3D models and textures
- Set bonus system with hover tooltips
- Configurable stats via YACL
- Loot generation in vanilla structure chests
- Skin variants for O-Yoroi, Raijin, Pharaoh, Centurion
- Slim (Alex) model support
- Bamboo Hat wearable standalone helmet
- Networking for config and skin sync
