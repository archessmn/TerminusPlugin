package com.github.archessmn.TerminusPlugin.commands;

import com.github.archessmn.TerminusPlugin.functions.playerMisc;
import com.github.archessmn.TerminusPlugin.interfaces.permsPlayer;
import com.github.archessmn.TerminusPlugin.main;
import com.github.archessmn.TerminusPlugin.ymlFiles.playerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Objects;

public class group implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        FileConfiguration config = main.plugin.getConfig();
        if (sender.isOp()) {
            if (playerMisc.isOnline(args[0])) {
                if (!Objects.requireNonNull(config.getList("Groups")).contains(args[1])) {
                    sender.sendMessage("§7[§4§lE§7] This group does not exist");
                } else {
                    Player playerM = playerMisc.getPlayerEntity(args[0]);
                    playerData.get().set(playerM.getUniqueId() + ".rank", args[1]);
                }
            }
        }

        return true;
    }
}
