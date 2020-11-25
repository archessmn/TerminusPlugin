package com.github.archessmn.TerminusPlugin.functions;

import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.UUID;

public class playerName {
    public static void defaultNameSettings(Player player) {
        UUID uuid = player.getUniqueId();
        FileConfiguration pd = playerData.get();
        pd.addDefault(uuid + ".mainName", player.getName());
        pd.addDefault(uuid + ".rank", "default");
        pd.addDefault(uuid + ".prefix", "");
        pd.addDefault(uuid + ".suffix", "");

    }
}
