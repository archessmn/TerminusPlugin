package com.github.archessmn.TerminusPlugin.commands;

import com.github.archessmn.TerminusPlugin.interfaces.permsPlayer;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        Player player = (Player) commandSender;

        if (hasCustomPermission("terminus.commands.vanish", player)) {
            player.setInvisible(true);
            player.setCustomNameVisible(true);
        }


        return true;
    }


    public boolean hasCustomPermission(String permission, Player player) {
        return Objects.requireNonNull(playerData.get().getList(player.getUniqueId() + ".permissions")).contains(permission);
    }
}
