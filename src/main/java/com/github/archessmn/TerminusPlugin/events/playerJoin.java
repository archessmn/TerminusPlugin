package com.github.archessmn.TerminusPlugin.events;

import com.github.archessmn.TerminusPlugin.main;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Set;
import java.util.UUID;

public class playerJoin implements Listener {
    main plugin;

    public playerJoin(main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();

        Set<String> playerList = playerData.get().getConfigurationSection("").getKeys(true);
        if (playerList.contains(uuid)) {
            Object playerMainName = playerData.get().getString(uuid + ".mainName");
            event.setJoinMessage("§f[§2§l+§f]§7 " + playerMainName);
        } else {

        }
    }

}
