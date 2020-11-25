package com.github.archessmn.TerminusPlugin;

import com.github.archessmn.TerminusPlugin.commands.prefix;
import com.github.archessmn.TerminusPlugin.commands.spawn;
import com.github.archessmn.TerminusPlugin.events.playerChat;
import com.github.archessmn.TerminusPlugin.events.playerJoin;
import com.github.archessmn.TerminusPlugin.events.playerLeave;
import com.github.archessmn.TerminusPlugin.ymlFiles._setup;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    public void onEnable() {
        System.out.print("Loading Terminus");
        PluginManager pm = this.getServer().getPluginManager();

        /*Setup YML Files*/
        _setup.playerData();


        pm.registerEvents(new playerJoin(this), this);
        pm.registerEvents(new playerChat(this), this);
        pm.registerEvents(new playerLeave(this), this);
        this.getCommand("spawn").setExecutor(new spawn());
        this.getCommand("prefix").setExecutor(new prefix());
    }

    public void onDisable() {

    }
}
