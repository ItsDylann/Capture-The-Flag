package com.lusionmc.capturetheflag.main.manager;

import com.lusionmc.capturetheflag.main.Capturetheflag;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private static FileConfiguration config;

    public static void setupConfig(Capturetheflag capturetheflag) {
        ConfigManager.config = capturetheflag.getConfig();
        capturetheflag.saveDefaultConfig();
    }

    public static int getRequiredPlayers() { return config.getInt("required-players"); }
    public static int getCoundownSeconds() { return config.getInt("countdown-seconds"); }

    public static Location getLobbySpawn() {
        return new Location(
                Bukkit.getWorld("lobby-spawn.world"),
                config.getDouble("lobby-spawn.x"),
                config.getDouble("lobby-spawn.y"),
                config.getDouble("lobby-spawn.z"),
                (float) config.getDouble("lobby-spawn.yaw"),
                (float) config.getDouble("lobby-spawn.pitch"));
    }

}
