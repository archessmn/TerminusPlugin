package com.github.archessmn.TerminusPlugin.commands;

import com.github.archessmn.TerminusPlugin.functions.playerMisc;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class prefix implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        if (commandSender.isOp()) {
            if (args.length == 2) {
                if (playerMisc.isOnline(args[0])) {
                    Player sender = (Player) commandSender;
                    Player targetPlayer = playerMisc.getPlayerEntity(args[0]);
                    String newPrefix = args[1].replaceAll("&", "§");
                    playerData.get().set(targetPlayer.getUniqueId() + ".prefix", newPrefix);
                    String senderNick = playerData.get().getString(sender.getUniqueId() + ".mainName");

                    targetPlayer.sendMessage("§7[§3§lI§7] " + senderNick + "§7 set your prefix to " + newPrefix + "§7.");
                    playerData.save();
                }
            }
        }

        return true;
    }
}
