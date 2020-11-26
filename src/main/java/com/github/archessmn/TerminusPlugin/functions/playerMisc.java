package com.github.archessmn.TerminusPlugin.functions;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class playerMisc {
    public static boolean isOnline(String playerMentioned) {
        Player playerCheck = Bukkit.getPlayer(playerMentioned);
        return playerCheck != null;
    }

    public static Player getPlayerEntity(String playerMentioned) {
        return Bukkit.getPlayer(playerMentioned);
    }
}
