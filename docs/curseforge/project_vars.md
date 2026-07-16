# CurseForge — Variables del proyecto

## Proyecto

| Variable | Valor |
|----------|-------|
| `curseforge_project_id` | `1608149` |
| `mod_id` | `ageforged_armor` |
| `display_name` | `Ageforged Armor` |

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
| `minecraft_version` | `26.1.2` |
| `framework` | `neoforge` |
| `java_version` | `25` |
| `environment` | `Client` |

## Rama

```
minecraft/26.1.2/neoforge-26.1.2.78/production
```

## Tag

Formato: `<mc-version>-<framework>-<version>`
Ejemplo: `26.1.2-neoforge-0.0.0-beta.17`

## Parámetros del upload

| Campo | Valor | Notas |
|-------|-------|-------|
| `displayName` | `Ageforged Armor (0.0.0-beta.17)` | Nombre visible: `display_name (version)` |
| `changelog` | HTML (no Markdown) | Ver estructura abajo |
| `changelogType` | `html` | Obligatorio para que se vea bien |
| `releaseType` | `beta` | Según el tipo de versión |
| `gameVersionNames` | `["Client", "26.1.2", "NeoForge"]` | MC + modloader |

## Estructura del changelog (HTML)

```html
<h2>v0.0.0-beta.17 - Title</h2>

<h3>Fix</h3>
<ul>
<li><strong>Issue</strong>: description with <code>code</code>.</li>
</ul>

<h3>Technical Changes</h3>
<ul>
<li><code>Class.method()</code> — description.</li>
</ul>

<hr>

<p><strong>JAR</strong>: <code>ageforged_armor-26.1.2-neoforge-0.0.0-beta.17.jar</code></p>
```
