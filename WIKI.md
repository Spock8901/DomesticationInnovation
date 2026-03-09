# DomesticationInnovation Plugin Wiki

Welcome to the comprehensive guide for the **DomesticationInnovation** Paper plugin! This wiki covers everything you need to know about taming pets, commanding them, using pet beds, and applying enchantments.

---

## Table of Contents

1. [Getting Started](#getting-started)
2. [Taming Pets](#taming-pets)
3. [Pet Commands](#pet-commands)
4. [Pet Beds](#pet-beds)
5. [Enchantments](#enchantments)
6. [Configuration](#configuration)
7. [Support & Troubleshooting](#support--troubleshooting)
8. [FAQ](#faq)

---

## Getting Started

### What is DomesticationInnovation?

DomesticationInnovation is a Paper plugin that allows you to tame, command, and customize animals in Minecraft. With this plugin, you can create personal companions that follow your commands and respond to your interactions.

### Requirements

- **Server Type:** Paper 1.21.1 or higher
- **Java:** Java 21+
- **Permissions:** Players need appropriate permissions (by default, all players can use the plugin)

### Installation

1. Download `domesticationinnovation-paper-1.8.0.jar`
2. Place it in your server's `plugins/` folder
3. Restart your server or run `/reload`
4. A `plugins/DomesticationInnovation/config.yml` file will be generated
5. Customize as needed and reload

---

## Taming Pets

### How to Tame an Animal

1. **Equip a Taming Item** - Hold either:
   - **Name Tag** - Used for taming
   - **Lead** - Also used for taming

2. **Right-Click the Animal** - Right-click any tameable animal while holding a taming item

3. **Success!** - The animal is now yours and will display a message

### Tameable Animals

All standard Minecraft tameable animals can be tamed:

- **Dogs/Wolves** - Loyal companions that attack threats
- **Cats/Ocelots** - Quick and agile, good for hunting
- **Horses** - Rideable and can carry equipment
- **Llamas** - Can be ridden and carry items
- **Parrots** - Flying companions
- **Other tameable mobs** - Depending on Minecraft version

### Taming Tips

- **Taming Items** are consumed when you tame an animal
- **One Owner Per Pet** - Each pet can only be owned by one player
- **Ownership is Persistent** - Your pet stays yours even after server restarts
- **No Levels Needed** - Any player can tame animals without grinding

---

## Pet Commands

### Command States

Once you've tamed an animal, you can issue commands by right-clicking it. Your pet can be in one of three states:

#### 1. **FREE** (Default)
- Your pet roams freely
- It will follow you naturally
- It will attack nearby threats if it's a combat pet (wolves, etc.)
- It will forage and interact with the environment normally

**Command Message:** `&e{pet_type} is now &bFREE&e!`

#### 2. **SIT**
- Your pet stays in place where you commanded it
- It will not move or follow you
- Useful for protecting a specific area or location
- Your pet will ignore other entities while sitting

**Command Message:** `&e{pet_type} is now &bSITTING&e!`

#### 3. **FOLLOW**
- Your pet actively follows you everywhere
- It will stay close to your location
- It will navigate around obstacles
- Useful for keeping your pet with you at all times

**Command Message:** `&e{pet_type} is now &bFOLLOWING&e!`

### How to Command Your Pet

Simply right-click your tamed pet with an **empty hand** (no items). Each right-click cycles through the states:

```
FREE → SIT → FOLLOW → FREE → ...
```

### Command Cycling

| Click | Current State | New State |
|-------|---------------|-----------|
| 1st   | FREE          | SIT       |
| 2nd   | SIT           | FOLLOW    |
| 3rd   | FOLLOW        | FREE      |
| 4th   | FREE          | SIT       |
| ...   | ...           | ...       |

---

## Pet Beds

### Using Pet Beds

Pet beds are decorative blocks that allow your pets to rest comfortably. They come in multiple colors to match your aesthetic.

### Available Colors

- Black Pet Bed
- Blue Pet Bed
- Brown Pet Bed
- Cyan Pet Bed
- Gray Pet Bed
- Green Pet Bed
- Light Blue Pet Bed
- Light Gray Pet Bed
- Lime Pet Bed
- Magenta Pet Bed
- Orange Pet Bed
- Pink Pet Bed
- Purple Pet Bed
- Red Pet Bed
- White Pet Bed
- Yellow Pet Bed

### Pet Bed Behavior

- **Aesthetic Only** (Default) - Pet beds are primarily decorative
- **Your pet does not require sleep** - Unlike Minecraft players, tamed pets don't need to sleep
- **Place them anywhere** - Use pet beds to create cozy pet areas in your base
- **Customizable Design** - Mix colors to create unique pet areas

### Pet Bed Tips

- Create a "Pet Zone" in your base with multiple colored beds
- Use beds to mark ownership areas
- Combine with fencing to create pet enclosures
- Mix and match colors for creative designs

---

## Enchantments

### What Are Pet Enchantments?

Pet enchantments are special abilities that enhance your pet's capabilities. They can be applied to tamed animals to give them unique powers.

### Available Enchantments

#### 1. **Fireproof** 🔥
- **Level:** 1 (Single level, no upgrades)
- **Effect:** Your pet becomes immune to fire and lava damage
- **Benefits:**
  - Pet won't burn in lava
  - Fire doesn't harm your companion
  - Useful in Nether exploration
  - Protects from fire-based mobs
- **Use Cases:**
  - Nether adventure pets
  - Creating fire-resistant companions
  - Exploring magma chambers safely

**Example:** A fireproof wolf that can safely explore lava caverns with you.

---

#### 2. **Amphibious** 🌊
- **Level:** 1 (Single level, no upgrades)
- **Effect:** Your pet can breathe underwater and swims better
- **Benefits:**
  - Pet can stay underwater indefinitely
  - Improved swimming speed
  - Better underwater navigation
  - Can explore ocean temples and underwater caves
- **Use Cases:**
  - Ocean exploration
  - Underwater base defense
  - Deep sea mining
  - Finding underwater structures

**Example:** An amphibious dolphin companion for ocean adventures.

---

#### 3. **Swift** ⚡
- **Level:** 1-3 (Stackable enchantment)
- **Effect:** Your pet moves faster
- **Benefits:**
  - Increased movement speed (increases with level)
  - Better response time to commands
  - Easier to keep up with
  - Enhanced travel efficiency
- **Level Breakdown:**
  - **Level 1:** +20% speed
  - **Level 2:** +40% speed
  - **Level 3:** +60% speed (maximum)
- **Use Cases:**
  - Fast travel companions
  - Racing pets
  - Hunting efficiently
  - Exploring large areas quickly

**Example:** A Level 3 Swift horse for rapid overworld travel.

---

### How to Apply Enchantments

*(Enchantment application method depends on plugin version and configuration)*

Current version supports:
- Configuration-based enchantment settings
- Per-pet enchantment customization

Check your `config.yml` for current enchantment availability and application methods.

---

### Enchantment Combinations

You can apply multiple enchantments to the same pet for powerful combinations:

| Pet | Enchantments | Use Case |
|-----|--------------|----------|
| Wolf | Fireproof + Swift | Fast Nether explorer |
| Horse | Swift (3) + Amphibious | Ultimate travel pet |
| Dolphin | Amphibious + Swift (2) | Ocean speedster |
| Cat | Swift (2) | Quick hunter |

---

## Configuration

### Config File Location

`plugins/DomesticationInnovation/config.yml`

### Main Configuration Options

```yaml
# Enable/disable features
features:
  tame_animals: true          # Enable pet taming
  pet_beds: true              # Enable pet beds
  pet_commands: true          # Enable commanding pets
  enchantments: true          # Enable enchantments

# Items that can be used to tame animals
taming_items:
  - "NAME_TAG"
  - "LEAD"

# Default pet command state (0=Free, 1=Sit, 2=Follow)
commands:
  default_state: 0

# Pet message prefix customization
prefix:
  default: "&6[DomesticationInnovation]"  # Message prefix
  separator: ":"                         # Separator symbol

# Customize pet messages
messages:
  pet_tamed: "&eYou have tamed this &c{pet_type}&e!"
  pet_command_free: "&e{pet_type} is now &bFREE&e!"
  pet_command_sit: "&e{pet_type} is now &bSITTING&e!"
  pet_command_follow: "&e{pet_type} is now &bFOLLOWING&e!"
```

### Customizing Messages

You can customize all pet messages by editing the `messages` section:

- `{pet_type}` - Replaced with the pet's animal type
- Color codes: Use `&` symbol (e.g., `&6` = gold, `&e` = yellow, `&c` = red)

**Example Custom Message:**
```yaml
pet_tamed: "&a✓ &bSuccessfully tamed a &e{pet_type}&b!"
```

### Customizing Prefix

Change the prefix that appears before pet messages:

```yaml
prefix:
  default: "&e[My Pets]"        # New prefix
  separator: " → "             # New separator
```

**Result:** `&e[My Pets] → &eYou have tamed this &c{pet_type}&e!`

### Disabling Features

Turn off features you don't want by setting them to `false`:

```yaml
features:
  tame_animals: false  # Disable taming completely
  pet_beds: false      # Remove pet beds
  pet_commands: false  # Disable commands (pets won't respond)
  enchantments: false  # Disable all enchantments
```

---

## FAQ

### Q: Can other players take control of my pet?
**A:** No. Only the player who tamed the pet can command it. Other players cannot issue commands to your pet.

### Q: What happens to my pet if I die?
**A:** Your pet stays tamed and in its current command state. It will persist on the server after you respawn.

### Q: Can I have unlimited pets?
**A:** Yes! You can tame as many animals as you want. Each becomes a personal companion.

### Q: Do pets require food?
**A:** No. Unlike Minecraft survival mechanics, your tamed pets don't need feeding or maintenance.

### Q: Can I transfer pet ownership?
**A:** Currently, pets are bound to their original owner. To transfer ownership, the original owner would need to "untame" the pet (not currently implemented in this version).

### Q: Do pet beds do anything functional?
**A:** Pet beds are primarily decorative and aesthetic. They provide a thematic way to show where your pets rest.

### Q: Can enchantments be stacked?
**A:** Yes! Some enchantments like Swift can be applied multiple times (up to level 3).

### Q: What's the difference between Sit and Follow?
**A:** 
- **Sit** - Pet stays in one location
- **Follow** - Pet actively moves with you

### Q: Do pets attack mobs on their own?
**A:** Combat pets (like wolves) will attack threatening mobs when in FREE mode. When SIT, they won't attack anything.

### Q: How do I permanently disable a feature?
**A:** Edit `config.yml` and set the feature to `false` under the `features` section.

### Q: Can I rename my pet?
**A:** Use a Name Tag to give your pet a custom name before taming it. After taming, the name will be preserved.

### Q: Does the plugin require any special permissions?
**A:** By default, all players can use the plugin. Server administrators can restrict permissions if needed (requires permission plugin).

### Q: Can I use this plugin on a Vanilla server?
**A:** No. This is a Paper-only plugin. Your server must run PaperMC 1.21.1 or higher.

### Q: What's the difference between a Name Tag and a Lead?
**A:** Both work for taming. Use whichever you prefer! Name Tags also allow you to give your pet a custom name.

---

## Support & Troubleshooting

### Issue: Pets disappear after server restart
**Solution:** Ensure the plugin is properly installed and loading. Check that world data is being saved.

### Issue: I can't tame any animals
**Solution:** 
1. Verify you have a Name Tag or Lead
2. Check that `tame_animals: true` in config.yml
3. Make sure the animal is tameable (wolves, cats, horses, etc.)

### Issue: Commands don't work
**Solution:**
1. Verify `pet_commands: true` in config.yml
2. Ensure you're the pet's owner
3. Right-click with an empty hand (no items)

### Issue: Enchantments aren't showing effects
**Solution:**
1. Check that `enchantments: true` in config.yml
2. Verify enchantments are properly configured

---

## Version Information

- **Plugin Version:** 1.8.0
- **Server Requirement:** Paper 1.21.1+
- **Java Requirement:** Java 21+
- **Author:** Spock (Current Version), Alexthe668, FallenReaper, Yosh, cationick

---

## Changelog

### Version 1.8.0
- Added custom prefix system with configuration support
- Implemented custom message separator
- Full color code support in messages
- Improved event handling for pet interactions
- Repository cleanup and documentation enhancement

---

## Getting Help

If you encounter issues or have questions:

1. Check this wiki first
2. Review the FAQ section
3. Check the config.yml comments
4. Report issues on the GitHub repository

---

**Thank you for using DomesticationInnovation!**
