package com.github.archessmn.TerminusPlugin;

import com.github.archessmn.TerminusPlugin.commands.*;
import com.github.archessmn.TerminusPlugin.events.playerChat;
import com.github.archessmn.TerminusPlugin.events.playerJoin;
import com.github.archessmn.TerminusPlugin.events.playerLeave;
import com.github.archessmn.TerminusPlugin.ymlFiles._setup;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class main extends JavaPlugin {
    public static main plugin;

    public void onEnable() {
        plugin = this;
        System.out.print("Loading Terminus");
        System.out.close();

        PluginManager pm = this.getServer().getPluginManager();

        /*Setup YML Files*/
        this.reloadConfig();
        this.saveDefaultConfig();
        this.saveConfig();
        this.getConfig();
        _setup.playerData();

        /*Register Events*/
        pm.registerEvents(new playerJoin(this), this);
        pm.registerEvents(new playerChat(this), this);
        pm.registerEvents(new playerLeave(this), this);

        /*Register Commands*/
        Objects.requireNonNull(this.getCommand("spawn")).setExecutor(new spawn());
        Objects.requireNonNull(this.getCommand("prefix")).setExecutor(new prefix());
        Objects.requireNonNull(this.getCommand("nick")).setExecutor(new nick());
        Objects.requireNonNull(this.getCommand("suffix")).setExecutor(new suffix());
        Objects.requireNonNull(this.getCommand("vanish")).setExecutor(new vanish());
        Objects.requireNonNull(this.getCommand("group")).setExecutor(new group());
    }

    public void onDisable() {
        System.out.print("Disabling Terminus");
        System.out.close();
    }
}
