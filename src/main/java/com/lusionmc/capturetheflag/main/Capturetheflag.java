package com.lusionmc.capturetheflag.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Capturetheflag extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Capture the flag has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Capture the flag has been disabled!");
    }
}
