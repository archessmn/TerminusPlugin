package com.github.archessmn.TerminusPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.archessmn.TerminusPlugin.interfaces.permsPlayer;

public class spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        permsPlayer playerPermsCheck = (permsPlayer) commandSender;
        if (commandSender != null && playerPermsCheck.hasRankPermission("terminus.commands.spawn")) {
            Player player = (Player) commandSender;
            commandSender.sendMessage("§7[§5§l>§7] §dTravelling to spawn...");
            Location worldSpawnPoint = Bukkit.getWorlds().get(0).getSpawnLocation();
            player.teleport(worldSpawnPoint);
        } else {
            assert playerPermsCheck != null;
            if (!playerPermsCheck.hasCustomPermission("terminus.commands.spawn")){
                System.out.print("§4You cannot send this command from the console.");
                System.out.close();
            }
        }
        return true;
    }
}
