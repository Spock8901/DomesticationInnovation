# 🐾 DomesticationInnovation - Paper Plugin

> **Enhanced Pet Taming & Commands for Minecraft 1.21.1 Paper Servers**

Domestication Innovation is a Paper/Spigot plugin that brings improved pet taming mechanics and pet commanding features to your Minecraft server. Tame animals with simple items and control their behavior with intuitive right-click commands.

---

## 📋 Features

### 🎯 Pet Taming
- **Easy Taming**: Use **Name Tags** or **Leads** to tame any tameable animal (wolves, cats, parrots, etc.)
- **Owner Persistence**: Tamed pets remember their owner via UUID storage
- **Visual Feedback**: Players receive chat messages confirming successful taming
- **State Initialization**: Pets start in the FREE state after taming

### 🎮 Pet Commands
Right-click your tamed pets to cycle through three command states:
- **FREE** - Pets roam freely and do their own thing
- **SIT** - Pets stay in place (useful for keeping them safe)
- **FOLLOW** - Pets follow their owner everywhere
- **Cycle**: FREE → SIT → FOLLOW → FREE (repeating)

### 💾 Persistent Data
- Pet ownership is stored using Minecraft's persistent data system
- Command states persist across server restarts
- No external database required—everything stored in the pet entity

### ⚙️ Configurable
- Enable/disable features (taming, pet commands)
- Customize taming items in `config.yml`
- Define command behavior and messages
- Feature-rich configuration for future expansions

---

## 🚀 Installation

### Requirements
- **Server Type**: Paper or Spigot 1.21.1+
- **Java**: Java 21 or higher
- **Bukkit API**: Compatible with 1.21+ API

### Steps
1. Download the latest `domesticationinnovation-paper-*.jar` from [Releases](../../releases)
2. Place the JAR file in your server's `plugins/` folder
3. Restart your server
4. The plugin will auto-generate a `config.yml` file in `plugins/DomesticationInnovation/`
5. Customize settings in the config if desired (optional)
6. Restart again to apply any config changes

---

## 📖 Usage Guide

### Taming Animals
1. **Get a Name Tag or Lead** from crafting or loot
2. **Right-click** any tameable animal (wolf, cat, parrot, horse, etc.)
3. **Receive confirmation** message when taming succeeds
4. The pet now recognizes you as the owner

### Commanding Pets
1. **Right-click** your tamed pet
2. The pet cycles to the next command state
3. **States cycle**: FREE → SIT → FOLLOW → FREE
4. Your pet's new state is announced via chat message

### Supported Animals
All Bukkit-supported tameable animals:
- 🐺 Wolves
- 🐱 Cats (Ocelots)
- 🦜 Parrots
- 🐴 Horses
- 🫏 Donkeys
- 🐪 Llamas
- 🦙 Alpacas
- 🐑 (and other tameable mobs)

---

## ⚙️ Configuration

The plugin creates a `config.yml` file in `plugins/DomesticationInnovation/` directory:

```yaml
# Enable/disable features
features:
  tame_animals: true      # Allow taming with items
  pet_commands: true      # Allow commanding tamed pets

# Items used for taming
taming_items:
  - "NAME_TAG"           # Name tags tame animals
  - "LEAD"               # Leads also tame animals

# Pet command options
commands:
  default_state: 0       # 0=FREE, 1=SIT, 2=FOLLOW

# Customizable messages
messages:
  pet_tamed: "&6[DomesticationInnovation] &eYou have tamed this &c{pet_type}&e!"
  pet_command_free: "&6[DomesticationInnovation] &e{pet_type} is now &bFREE&e!"
  pet_command_sit: "&6[DomesticationInnovation] &e{pet_type} is now &bSITTING&e!"
  pet_command_follow: "&6[DomesticationInnovation] &e{pet_type} is now &bFOLLOWING&e!"
```

### Customization Tips
- **Add more taming items**: Add material names to the `taming_items` list (e.g., `"DIAMOND"`)
- **Disable features**: Set `true` to `false` in the `features` section
- **Custom messages**: Edit message text (supports Minecraft color codes like `&6`, `&e`, `&b`)

---

## 🛠️ Commands

Currently, the plugin uses right-click interactions for pet commands. Command-based features can be added in future versions.

- `/dicmd` - Pet command dispatcher (extensible for future use)
- `/pet-cmd` - Alias for pet commands

---

## 🔧 Building from Source

### Requirements
- Git
- Java 21+
- Gradle (included via wrapper)

### Steps
```bash
git clone https://github.com/yourusername/DomesticationInnovation.git
cd DomesticationInnovation
./gradlew clean :paper:build
```

The compiled JAR will be in `paper/build/libs/domesticationinnovation-paper-*.jar`

---

## 📝 Permissions

The plugin has minimal permission requirements:

- **Default**: All players can tame and command pets
- **Admin**: `domesticationinnovation.admin` - For future admin features

No special permissions needed for basic taming and commanding.

---

## 🐛 Troubleshooting

### Plugin not loading?
- Verify you're using **Paper 1.21.1** or compatible version
- Check server logs for error messages
- Ensure Java 21+ is installed

### Taming not working?
- Make sure you're using **Name Tag** or **Lead**
- Check that `tame_animals` feature is enabled in config
- Right-click on **tameable animals** (not all mobs are tameable)

### Commands not showing state change?
- Verify the pet is actually owned by you
- Check that `pet_commands` is enabled in config
- Restart server if config was recently changed

### State not persisting after restart?
- This is handled automatically by Minecraft's persistent data
- If it's not working, check for errors in server logs

---

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Report bugs via [Issues](../../issues)
- Suggest features via [Discussions](../../discussions)
- Submit pull requests for improvements

---

## 📜 License

This project is provided as-is for Minecraft server use. Please refer to the LICENSE file for full details.

---

## 🙏 Credits

- **Original Mod**: DomesticationInnovation (Forge version)
- **Paper Port**: Community adaptation
- **Current Version Author**: Spock
- **Contributors**: Alexthe668, FallenReaper, Yosh, cationick

---

## 📞 Support

- **Issues**: Open an issue on GitHub for bugs or feature requests
- **Questions**: Check the [Wiki](../../wiki) or ask in [Discussions](../../discussions)

---

## 🚀 Future Roadmap

- [ ] Pet inventory system (store items in pets)
- [ ] Pet customization (colors, names, sizes)
- [ ] Advanced commands (advanced sit positions, tricks)
- [ ] Pet stats and leveling
- [ ] Cross-server pet synchronization

---

**Happy taming! 🎮**
