package com.lusionmc.capturetheflag.main.instance;

import com.lusionmc.capturetheflag.main.Capturetheflag;
import com.lusionmc.capturetheflag.main.GameState;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.UUID;

public class Game {

    private Arena arena;
    private HashMap<UUID, ItemStack> flagCarrier;

    public Game(Arena arena) {
        this.arena = arena;
        flagCarrier = new HashMap<>();
    }

    public void start() {
        arena.setState(GameState.LIVE);
        arena.sendMessage("Game started! Capture the flag!");
        //no flag carrier to start
        for (UUID uuid : arena.getPlayers()) {
            flagCarrier.put(uuid, null);
        }
    }

    public void addFlagCarrier(UUID uuid, ItemStack itemStack) {
        flagCarrier.replace(uuid, itemStack);
        arena.sendMessage("Flag carrier has been set!");
    }

    public void removeFlagCarrier(UUID uuid) {
        flagCarrier.replace(uuid, null);
        arena.sendMessage("Flag carrier has been removed!");
    }

    public boolean hasFlagCarrier(UUID uuid) {
        return flagCarrier.get(uuid) != null;
    }

    public ItemStack getFlagCarrier(UUID uuid) {
        return flagCarrier.get(uuid);
    }




}
