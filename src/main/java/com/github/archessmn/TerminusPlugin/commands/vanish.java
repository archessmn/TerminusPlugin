package com.github.archessmn.TerminusPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        Player player = (Player) commandSender;

        if (player.hasPermission("terminus.commands.vanish")) {
            player.setInvisible(true);
            player.setCustomNameVisible(true);
        } else {
            player.sendMessage("§7[§4§lE§7] You don't have the permissions for this: terminus.commands.vanish");
        }


        return true;
    }
}
