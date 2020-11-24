package com.github.archessmn.TerminusPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            commandSender.sendMessage(">> Travelling to spawn...");
            Location worldSpawnPoint = Bukkit.getWorlds().get(0).getSpawnLocation();
            player.teleport(worldSpawnPoint);
        } else {
            System.out.print("You cannot send this command from the console.");
            System.out.close();
        }
        return true;
    }
}
