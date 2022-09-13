package com.lusionmc.capturetheflag.main.instance;

import com.lusionmc.capturetheflag.main.Capturetheflag;
import com.lusionmc.capturetheflag.main.GameState;
import com.lusionmc.capturetheflag.main.manager.ConfigManager;
import org.bukkit.ChatColor;

public class Countdown {

    private Capturetheflag capturetheflag;
    private Arena arena;
    private int countdownSeconds;

    public Countdown(Capturetheflag capturetheflag, Arena arena) {
        this.capturetheflag = capturetheflag;
        this.arena = arena;
        this.countdownSeconds = ConfigManager.getCoundownSeconds();
    }

    public void start() {
        arena.setState(GameState.COUNTDOWN);
        runTaskTimer(capturetheflag, 0, 20);
    }

    @Override
    public void run() {
        if (countdownSeconds == 0) {
            cancel();
            arena.start();
            return;
        }

        if(countdownSeconds <= 10 || countdownSeconds % 15 == 0) {
            arena.sendMessage(ChatColor.GREEN + "Game starting in " + countdownSeconds + " second" + (countdownSeconds == 1 ? "" : "s" + "!"));
        }

        arena.sendTitle(ChatColor.GREEN.toString() + countdownSeconds + " second" + (countdownSeconds == 1 ? "" : "s" + "!"), ChatColor.GRAY + "until game starts.");

        countdownSeconds--;
    }




}
