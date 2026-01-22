package com.github.alexthe668.domesticationinnovation.paper;

import org.bukkit.plugin.java.JavaPlugin;
import com.github.alexthe668.domesticationinnovation.paper.listeners.PetInteractListener;

public class DomesticationInnovationPaper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Load configuration
        saveDefaultConfig();
        
        // Register unified event listener for pet interactions
        getServer().getPluginManager().registerEvents(new PetInteractListener(this), this);
        
        getLogger().info("DomesticationInnovation (Paper) v" + getPluginMeta().getVersion() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DomesticationInnovation (Paper) has been disabled!");
    }
}
