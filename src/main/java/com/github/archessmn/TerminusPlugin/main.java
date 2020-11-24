package com.github.archessmn.TerminusPlugin;

import com.github.archessmn.TerminusPlugin.commands.spawn;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    public void onEnable() {
        System.out.print("Loading Terminus");
        PluginManager pm = this.getServer().getPluginManager();


        this.getCommand("spawn").setExecutor(new spawn());
    }

    public void onDisable() {

    }
}
