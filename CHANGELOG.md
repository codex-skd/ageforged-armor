# Changelog

All notable changes to this project will be documented in this file.

---

## [1.1.0] - 2026-07-29

### Fix

- **Armadura descuadrada al atacar con BetterCombat/PlayerAnimationLib**: `PlayerAnimationLib` inyecta la pose de sus animaciones (torso, brazos, piernas) directamente en `PlayerModel.setupAnim()`, pero nuestro `ArmorModel` es una instancia separada que extiende `HumanoidModel` y nunca recibía esos cambios — solo reproducía la animación vainilla base. Ahora `MixinHumanoidArmorLayer` fuerza un `setupAnim()` fresco sobre el `PlayerModel` real del jugador y copia su pose resultante (torso, brazos, piernas, casco) sobre la armadura. Sin mods de animación instalados el comportamiento es idéntico al anterior.

## [1.0.0] - 2026-07-29

### First Stable Release (26.2 track)

Primera versión estable del port a Minecraft 26.2, tras las betas 1-3 de esta rama.

- Refactor: eliminados los últimos residuos de naming del mod original "Armor of the Ages" (`AOTAConfig` → `AgeforgedArmorConfig`, `AotAMaterials` → `AgeforgedArmorMaterials`, `AotATags` → `AgeforgedArmorTags`)
- WORKFLOW alineado con codex-docs v1.11.0
- Incluye las correcciones de beta.1 a beta.3 (port a 26.2, fix de `MixinAvatarRenderer` para brazos en primera persona)

## [0.0.0-beta.3] - 2026-07-27

### Fix

- **First-person armor not visible**: el mixin injectaba al método de 5 parámetros, pero `ItemInHandRenderer` llama al de 6 parámetros (`renderRightHand` con `Avatar`). Corregido.

## [0.0.0-beta.2] - 2026-07-27

### Fix

- **Crash on startup**: `MixinAvatarRenderer` apuntaba a la firma antigua de `renderRightHand`/`renderLeftHand` (con `AbstractClientPlayer`). MC 26.2 eliminó ese parámetro. Ahora usa la versión de 5 parámetros y obtiene el player via `Minecraft.getInstance().player`.

## [0.0.0-beta.1] - 2026-07-27

### Port to Minecraft 26.2 / NeoForge 26.2.0.32-beta

- Ported all source code from MC 26.1.2 to MC 26.2
- Updated NeoGradle plugin to 2.0.142
- Updated YACL dependency to 3.9.6+26.2-neoforge
- Initial beta for the 26.2 version track

## [0.0.0-beta.35] - 2026-07-24

### Fixed
- **Brazo en primera persona**: reseteadas las posiciones x/y/z del brazo (setupAnim las modifica) antes de aplicar rotación fija. Base xRot = -0.1F (brazo colgando recto), con ajuste al agacharse (-0.4F). Se descartó copiar la rotación del AvatarRenderer porque su modelo tiene la pose animada de tercera persona, no la de primera.

## [0.0.0-beta.34] - 2026-07-24

### Fixed
- **Brazo en primera persona desalineado**: la rotación copiada del AvatarRenderer no coincidía con la pose real de primera persona (el modelo tiene la animación de tercera persona). Ahora usa valores fijos que imitan la posición real del brazo en primera persona, con ajuste al agacharse.

## [0.0.0-beta.33] - 2026-07-23

### Fixed
- **Flicker al abrir inventario**: la rotación del brazo se capturaba en TAIL, pero el modelo podía haber cambiado entre el renderizado de la mano y ese punto. Ahora se captura en HEAD (antes de renderizar la mano) y se reusa en TAIL para la armadura.

## [0.0.0-beta.32] - 2026-07-23

### Fixed
- **Brazo en primera persona desalineado al agacharse**: la armadura del brazo usaba rotaciones hardcodeadas (`xRot = -0.1F`) en lugar de copiar la rotación real del brazo del modelo del jugador. Ahora lee la pose del AvatarRenderer y la aplica al brazo de la armadura.

## [0.0.0-beta.31] - 2026-07-23

### Fixed
- **Casco renderizado 1 unidad abajo**: todos los modelos llamaban `templateLayerDefinition(1.0F)`, desplazando todas las piezas de armadura 1 bloque hacia abajo respecto al modelo del jugador. La skin se veía por encima del casco al mirar arriba/abajo. Cambiado a `0.0F` para que las posiciones coincidan con el jugador, igual que la armadura vanilla.

## [0.0.0-beta.30] - 2026-07-22

### Fixed
- **Helmet renderizado detrás de la skin**: aumentado el `order` de `slot.ordinal() * 2` a `1000 + slot.ordinal() * 2`. La skin del jugador se renderizaba con un orden superior al de la armadura, tapando el casco al mirar arriba/abajo.

### Infrastructure
- **Script de subida**: reemplazado script Python inline por el script compartido `codex-docs/scripts/curseforge-upload.ps1`. Ahora el nombre del JAR en CurseForge se genera correctamente.
- **WORKFLOW** actualizado a v1.2.1 (separación de roles, tabla de ramas limpia).
- **Rama `*/main`** creada en remoto para mirror a GitHub.

## [0.0.0-beta.29] - 2026-07-22

### Fixed
- **Helmet rendering: front disappeared when looking up** — eliminado `copyPoseFromPlayer()`. El método copiaba rotaciones del PlayerModel sobre el modelo de armadura después de `setupAnim(renderState)`, pero la pose del PlayerModel podía estar desfasada o incompleta, causando que el casco no rotara correctamente con la cabeza. Ahora `setupAnim(renderState)` es la única fuente de pose, usando directamente los valores del render state.
- **Slim/Alex model support** — `getArmorModel()` ahora usa la ruta entity-based (`Minecraft.getInstance().player`) en lugar de state-based, lo que permite que `MixedArmorModelProvider` seleccione correctamente la variante slim.

## [0.0.0-beta.28] - 2026-07-22

### Refactor
- Clase principal renombrada: `ArmorOfTheAgesForge` → `AgeforgedArmor` (PascalCase según naming convention)
- Clase cliente renombrada: `ArmorOfTheAgesClientForge` → `AgeforgedArmorClient`
- Loot modifier renombrado: `ArmorOfTheAgesLootModifier` → `AgeforgedArmorLootModifier`
- Template movido: `src/main/templates/` → `src/main/resources/templates/`

### Docs
- WORKFLOW.md renombrado a `WORKFLOW_AGEFORGED_ARMOR_26-1-2.md` y alineado con genérico v1.0.0
- Añadida atribución de fork a README.md y neoforge.mods.toml (Armor of the Ages by AlxR00T)

### Infrastructure
- Creado `.gitlab-ci.yml` para mirror a GitHub vía CI/CD
- Creados directorios `temp/` y `libs/`
- Eliminado archivo `nul`
- `.gitignore` actualizado con `temp/`

## [0.0.0-beta.27] - 2026-07-17

### Fixed
- **Animación perdida (T-pose)**: restaurado `model.setupAnim(renderState)` antes de copiar pose del PlayerModel. La armadura ahora tiene animación base vanilla más las modificaciones de Player Animation Core.
- **Posición del casco**: `copyPart` solo copia rotación y escala, no posición. Las posiciones base del modelo de armadura (ej: head en y=1) se preservan.
- **PlayerModel access refactorizado**: `getPlayerModel()` usa `Minecraft.getInstance().player` + `EntityRenderDispatcher.getRenderer()` con casteo explícito a `AvatarRenderer`, en lugar del frágil `(RenderLayer) this.getParentModel()`.

## [0.0.0-beta.24] - 2026-07-17

### Fixed
- Posición del casco: `copyPart` copiaba `x/y/z` del PlayerModel, pero el modelo de armadura tiene posiciones base diferentes (ej: head en y=1 vs y=0). Ahora solo copia rotación y escala.

## [0.0.0-beta.23] - 2026-07-17

### Fixed
- Sincronización de animaciones: el modelo de armadura copia pose (posición, rotación, escala) del `PlayerModel` tras `setupAnim()`, compatible con Player Animation Core y cualquier mod de animaciones.

## [0.0.0-beta.22] - 2026-07-17

### Added
- Armadura en brazos en primera persona: mixin en `AvatarRenderer.renderRightHand/renderLeftHand`.

### Fixed
- Animaciones de armadura sincronizadas con el jugador vía `setupAnim()` con el render state.

## [0.0.0-beta.21] - 2026-07-17

### Fixed
- Armadura blanca/brillante y skin visible: cambiado `submitModel` a la firma de 10 parámetros con `collector.order()`, igual que `EquipmentLayerRenderer` vanilla. La versión de 8 parámetros usaba un overload por defecto con defaults incorrectos.

## [0.0.0-beta.20] - 2026-07-17

### Fixed
- **Armadura blanca brillante**: Cambiado de `RenderTypes.entityCutout` a `RenderTypes.armorCutoutNoCull` — el pipeline correcto para armadura vanilla. Soluciona la iluminación faltante, el z-fighting con la skin del jugador y el culling incorrecto de caras.
- **Skin visible a través del casco**: El pipeline `armorCutoutNoCull` usa `VIEW_OFFSET_Z_LAYERING` que evita el z-fighting entre la armadura y la skin.

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
