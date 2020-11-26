package com.github.archessmn.TerminusPlugin.interfaces;

import com.github.archessmn.TerminusPlugin.main;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;

import java.util.List;
import java.util.Objects;

public interface permsPlayer extends org.bukkit.entity.Player{
    default boolean hasCustomPermission(String permission) {
        return Objects.requireNonNull(playerData.get().getList(getUniqueId() + ".permissions")).contains(permission);
    }

    default boolean hasRankPermission(String permission) {
        String playerRank = playerData.get().getString(getUniqueId() + "rank");
        List<String> rankPermissions = main.plugin.getConfig().getStringList("Groups." + playerRank + ".permissions");
        return rankPermissions.contains(permission);
    }
}
