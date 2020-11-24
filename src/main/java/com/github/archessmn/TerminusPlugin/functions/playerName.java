package com.github.archessmn.TerminusPlugin.functions;

import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.entity.Player;

import java.util.UUID;

public class playerName {
    public static void defaultNameSettings(Player player) {
        UUID uuid = player.getUniqueId();
        playerData.get().addDefault(uuid + ".mainName", player.getName());
        playerData.get().addDefault(uuid + ".rank", "default");
    }
}
