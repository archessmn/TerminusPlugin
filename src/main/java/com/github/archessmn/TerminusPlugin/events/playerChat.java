package com.github.archessmn.TerminusPlugin.events;

import com.github.archessmn.TerminusPlugin.main;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.UUID;

public class playerChat implements Listener {
    main plugin;

    public playerChat(main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        String playerMainName = playerData.get().getString(uuid + ".mainName");
        String playerPrefix = playerData.get().getString(uuid + ".prefix");
        String playerSuffix = playerData.get().getString(uuid + ".suffix");
        String fullName = playerPrefix + " §7" + playerMainName + " §7" + playerSuffix;

        event.setFormat(fullName + " §f> §7" + event.getMessage());
    }
}
