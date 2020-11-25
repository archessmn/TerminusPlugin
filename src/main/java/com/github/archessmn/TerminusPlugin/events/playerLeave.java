package com.github.archessmn.TerminusPlugin.events;

import com.github.archessmn.TerminusPlugin.main;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

public class playerLeave implements Listener {
    main plugin;

    public playerLeave(main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();

        Object playerMainName = playerData.get().getString(uuid + ".mainName");
        event.setQuitMessage("§f[§4§l+§f]§7 " + playerMainName);

    }
}
