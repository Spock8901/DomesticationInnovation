# DomesticationInnovation - Multi-Module Build

This project now supports building for both **Forge** and **Paper** servers as separate downloads.

## Project Structure

```
DomesticationInnovation/
├── build.gradle              # Parent build configuration
├── settings.gradle           # Multi-module setup
├── gradle.properties         # Gradle configuration
├── forge/                    # Forge mod module
│   ├── build.gradle
│   └── src/main/
│       ├── java/            # Mixin-based code for Forge
│       └── resources/       # Assets, data, mixin configs
└── paper/                    # Paper plugin module
    ├── build.gradle
    └── src/main/
        ├── java/            # Event-based listeners for Paper
        └── resources/
            └── plugin.yml   # Plugin configuration
```

## Building

### Build all modules:
```bash
./gradlew build
```

### Build only Forge:
```bash
./gradlew :forge:build
```

### Build only Paper:
```bash
./gradlew :paper:build
```

## Output JARs

- **Forge**: `forge/build/libs/domesticationinnovation-forge-1.7.2.jar`
- **Paper**: `paper/build/libs/domesticationinnovation-paper-1.7.2-all.jar`

## Module Details

### Forge Module (1.21.1)
- Uses Mixins for bytecode manipulation
- Supports both client and server
- Contains AI modifications for tameable animals
- Assets: textures, models, particles, sounds

### Paper Module (1.21+)
- Event-based API using Bukkit/Spigot
- Server-only (players use vanilla client)
- Command system for pet control
- Persistent data storage using NBT

## Compatibility

- **Forge**: Minecraft 1.21.1 (requires ForgeGradle 6.0+, Java 17)
- **Paper**: Minecraft 1.21.1+ (Spigot API compatible, Java 17)

## Installation

### Forge:
1. Install Forge 51.0+ for Minecraft 1.21.1
2. Place `domesticationinnovation-forge-1.7.2.jar` in `mods/` folder
3. Place CitadelMod in `mods/` folder
4. Start Minecraft

### Paper:
1. Place `domesticationinnovation-paper-1.7.2-all.jar` in `plugins/` folder
2. Restart/reload server
3. Use `/dicmd` to command tamed animals

## Development

Each module is independent but shares the same version number. You can develop either module separately and they won't interfere with each other.
