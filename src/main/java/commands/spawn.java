package commands;

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
            Location worldSpawnPoint = Bukkit.getWorlds().get(0).getSpawnLocation();
            ((Player) commandSender).getLocation().setX(worldSpawnPoint.getX());
            ((Player) commandSender).getLocation().setY(worldSpawnPoint.getY());
            ((Player) commandSender).getLocation().setZ(worldSpawnPoint.getZ());
        } else {
            System.out.print("You cannot send this command from the console.");
        }
        return true;
    }
}
