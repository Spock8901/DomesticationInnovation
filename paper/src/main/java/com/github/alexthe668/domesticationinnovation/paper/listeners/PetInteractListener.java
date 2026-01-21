package com.github.alexthe668.domesticationinnovation.paper.listeners;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.NamespacedKey;
import org.bukkit.Material;

/**
 * Main event dispatcher for pet interactions.
 * Handles both taming and commanding pets with proper item checking.
 */
public class PetInteractListener implements Listener {
    
    private final JavaPlugin plugin;
    private final NamespacedKey tameOwnerKey;
    private final NamespacedKey commandKey;
    
    // Taming items
    private static final Material[] TAMING_ITEMS = {
        Material.NAME_TAG,
        Material.LEAD
    };
    
    public PetInteractListener(JavaPlugin plugin) {
        this.plugin = plugin;
        this.tameOwnerKey = new NamespacedKey(plugin, "tame_owner");
        this.commandKey = new NamespacedKey(plugin, "command_state");
    }
    
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        if (event.getHand() != EquipmentSlot.HAND) return;
        
        Entity entity = event.getRightClicked();
        if (!(entity instanceof Tameable)) return;
        
        Tameable tameable = (Tameable) entity;
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        
        // If taming item + animal not tamed = TAME
        if (isTamingItem(item) && !tameable.isTamed()) {
            handleTaming(player, entity, tameable);
            event.setCancelled(true);
            return;
        }
        
        // If animal is tamed by this player = COMMAND
        if (tameable.isTamed() && isOwner(player, tameable)) {
            handleCommand(player, entity, tameable);
            event.setCancelled(true);
            return;
        }
    }
    
    private boolean isTamingItem(ItemStack item) {
        if (item == null || item.isEmpty()) return false;
        for (Material material : TAMING_ITEMS) {
            if (item.getType() == material) return true;
        }
        return false;
    }
    
    private boolean isOwner(Player player, Tameable tameable) {
        if (tameable.getOwner() == null) return false;
        return tameable.getOwner().equals(player);
    }
    
    private void handleTaming(Player player, Entity entity, Tameable tameable) {
        // Tame the animal
        tameable.setTamed(true);
        tameable.setOwner(player);
        
        // Store owner UUID in persistent data
        entity.getPersistentDataContainer().set(
            tameOwnerKey,
            PersistentDataType.STRING,
            player.getUniqueId().toString()
        );
        
        // Initialize command state
        entity.getPersistentDataContainer().set(
            commandKey,
            PersistentDataType.INTEGER,
            0
        );
        
        String petName = entity.getType().name().toLowerCase().replace('_', ' ');
        String prefix = plugin.getConfig().getString("prefix.default", "&6[DomesticationInnovation]");
        String separator = plugin.getConfig().getString("prefix.separator", ":");
        String message = plugin.getConfig().getString("messages.pet_tamed", "&eYou have tamed this &c{pet_type}&e!");
        message = message.replace("{pet_type}", petName);
        player.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', prefix + " " + separator + " " + message));
    }
    
    private void handleCommand(Player player, Entity entity, Tameable tameable) {
        // Rotate command state (free -> sit -> follow -> free)
        int currentCommand = entity.getPersistentDataContainer().getOrDefault(
            commandKey,
            PersistentDataType.INTEGER,
            0
        );
        
        int nextCommand = (currentCommand + 1) % 3;
        entity.getPersistentDataContainer().set(commandKey, PersistentDataType.INTEGER, nextCommand);
        
        String commandState = switch (nextCommand) {
            case 0 -> "free";
            case 1 -> "sit";
            case 2 -> "follow";
            default -> "unknown";
        };
        
        String commandName = switch (nextCommand) {
            case 0 -> "FREE";
            case 1 -> "SIT";
            case 2 -> "FOLLOW";
            default -> "UNKNOWN";
        };
        
        String petName = entity.getType().name().toLowerCase().replace('_', ' ');
        String prefix = plugin.getConfig().getString("prefix.default", "&6[DomesticationInnovation]");
        String separator = plugin.getConfig().getString("prefix.separator", ":");
        String messageKey = "messages.pet_command_" + commandState;
        String message = plugin.getConfig().getString(messageKey, "&e" + petName + " is now &b" + commandName + "&e!");
        message = message.replace("{pet_type}", petName);
        player.sendMessage(org.bukkit.ChatColor.translateAlternateColorCodes('&', prefix + " " + separator + " " + message));
    }
}
