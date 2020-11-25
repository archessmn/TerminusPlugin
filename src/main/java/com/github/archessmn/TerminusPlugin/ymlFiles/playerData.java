package com.github.archessmn.TerminusPlugin.ymlFiles;

import com.github.archessmn.TerminusPlugin.main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class playerData {
    main plugin;

    public playerData(main instance) {
        plugin = instance;
    }

    private static File nameFile;
    private static FileConfiguration nameYml;

    public static void setup() {
        nameFile = new File(Bukkit.getServer().getPluginManager().getPlugin("Terminus").getDataFolder(), "name.yml");

        if (!nameFile.exists()) {
            try{
                nameFile.createNewFile();
            }catch (IOException e) {
                //oh no
            }
        }
        nameYml = YamlConfiguration.loadConfiguration(nameFile);
    }

    public static FileConfiguration get() {
        return nameYml;
    }

    public static void save() {
        try {
            nameYml.save(nameFile);
        }catch (IOException e) {
            System.out.println("Couldn't save Name yml file!");
        }
    }

    public static void reload() {
        nameYml = YamlConfiguration.loadConfiguration(nameFile);
    }
}
