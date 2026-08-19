# CurseForge — Variables del proyecto

> Las siguientes variables son leídas automáticamente por `../codex-docs/scripts/curseforge-upload.ps1`

project_id = 1608149
api_token = ee776b0a-ee95-4850-b554-06be02a8657f
game_versions = 9638, 9639, 16498, 10150
release_type = release

## Proyecto

| Variable | Valor |
|----------|-------|
| `curseforge_project_id` | `1608149` |
| `mod_id` | `ageforged_armor` |
| `display_name` | `Ageforged Armor` (separado, no junto) |

## Tokens

| API | Token | Uso |
|-----|-------|-----|
| Upload | `ee776b0a-ee95-4850-b554-06be02a8657f` | Subir archivos JAR |
| Core (GET) | `$2a$10$yGwryAfmRkS9ZJsJUDf5YOKZpOIsmHB8Fji2D8JVCKBSZEKYlwmaO` | Consultar datos del mod |

Autenticación Upload: cabecera `X-Api-Token`
Autenticación Core: cabecera `x-api-key`

## Versión actual

| Variable | Valor |
|----------|-------|
| `minecraft_version` | `26.2` |
| `framework` | `neoforge` |
| `java_version` | `25` |
| `environment` | `Client`, `Server` |

## Rama

```
minecraft/26.2/neoforge-26.2.0.57/production
```

## Tag

Formato: `<mc-version>-<framework>-<version>`
Ejemplo: `26.2-neoforge-0.0.0-beta.1`

## Parámetros del upload

| Campo | Valor | Notas |
|-------|-------|-------|
| `displayName` | `Ageforged Armor (0.0.0-beta.1)` | Nombre visible: `display_name (version)` |
| `changelog` | HTML (no Markdown) | Ver estructura abajo |
| `changelogType` | `html` | Obligatorio para que se vea bien |
| `releaseType` | `beta` (durante desarrollo) / `release` (estable) | Según el workflow: beta → `beta`, release → `release` |
| `gameVersionNames` | `["Client", "Server", "26.2", "NeoForge"]` | Entorno + MC + modloader |

## Estructura del changelog (HTML)

```html
<h2>v0.0.0-beta.1 - Initial 26.2 port</h2>

<h3>Notes</h3>
<blockquote>Port from MC 26.1.2 to MC 26.2 (NeoForge 26.2.0.32-beta).</blockquote>

<hr>

<p><strong>JAR</strong>: <code>ageforged_armor-26.2-neoforge-0.0.0-beta.1.jar</code></p>
```

## Subir archivo (JAR)

Usar el script compartido desde la raíz del proyecto:

```powershell
powershell -File ../codex-docs/scripts/curseforge-upload.ps1
```

El script lee `project_id`, `api_token` y `game_versions` de este archivo, y `mod_id`, `mod_name`, `minecraft_version`, `mod_version` de `gradle.properties`. Sube automáticamente el JAR desde `build/libs/` con el changelog de `docs/curseforge/versions/<version>.md`.

## Verificar con GET

```bash
curl -s "https://api.curseforge.com/v1/mods/1608149/files/<FILE_ID>"   -H "x-api-key: $2a$10$yGwryAfmRkS9ZJsJUDf5YOKZpOIsmHB8Fji2D8JVCKBSZEKYlwmaO"
```

## Changelog

```bash
curl -s "https://api.curseforge.com/v1/mods/1608149/files/<FILE_ID>/changelog"   -H "x-api-key: $2a$10$yGwryAfmRkS9ZJsJUDf5YOKZpOIsmHB8Fji2D8JVCKBSZEKYlwmaO"
```

## Descripcion del proyecto

No hay endpoint API para actualizar la descripcion. Se edita manualmente desde la web de CurseForge pegando el HTML de `docs/curseforge/project_description.md`.

## Flujo completo

1. `./gradlew clean build`
2. Actualizar `docs/curseforge/versions/<version>.md` con HTML
3. Actualizar `CHANGELOG.md`
4. `git commit -m "fix: descripcion\n\nvX.Y.Z"` + `git push`
5. `git tag -a 26.2-neoforge-<version> -m "vX.Y.Z: descripcion"` + `git push origin <tag>`
6. `powershell -File ../codex-docs/scripts/curseforge-upload.ps1` (o `cd build/libs && python -c "..."` manual)
7. Verificar con GET que el changelog se vea bien
8. Liberar manualmente desde la web si es necesario
