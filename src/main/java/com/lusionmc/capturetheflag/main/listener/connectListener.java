package com.lusionmc.capturetheflag.main.listener;

import com.lusionmc.capturetheflag.main.Capturetheflag;
import com.lusionmc.capturetheflag.main.instance.Arena;
import com.lusionmc.capturetheflag.main.manager.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class connectListener implements Listener {

    private Capturetheflag capturetheflag;

    public ConnectListener(Capturetheflag capturetheflag) {
        this.capturetheflag = capturetheflag;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().teleport(ConfigManager.getLobbySpawn());
    }

    public void onQuit(PlayerQuitEvent e) {
        Arena arena = capturetheflag.getArenaManager().getArena(e.getPlayer());
    }


}
