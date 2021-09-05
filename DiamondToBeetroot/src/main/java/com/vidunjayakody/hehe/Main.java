package com.vidunjayakody.hehe;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Starting plugin...");
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
    }
}