package com.asdluis.advancedfishing;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedFishing extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[Advanced Fishing] Plugin Ready");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        String player = event.getPlayer().getDisplayName();
        System.out.println("[Advanced Fishing] "+ event.getPlayer().getDisplayName() + " joined the server");
        event.setJoinMessage("Welcome " + player + " to the server");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        String player = event.getPlayer().getDisplayName();
        System.out.println("[Advanced Fishing] "+ player + " has left the server");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("[Advanced Fishing] Plugin Disabled");

    }
}