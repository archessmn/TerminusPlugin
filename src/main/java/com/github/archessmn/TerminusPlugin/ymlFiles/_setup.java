package com.github.archessmn.TerminusPlugin.ymlFiles;

public class _setup {
    public static void playerData() {
        playerData.setup();
        playerData.get().options().copyDefaults(true);
        playerData.save();
    }
}
