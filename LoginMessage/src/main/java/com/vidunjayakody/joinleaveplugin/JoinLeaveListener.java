package com.vidunjayakody.joinleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        player.sendMessage(ChatColor.GRAY + "Join the server discord at: " + ChatColor.GREEN + ChatColor.UNDERLINE + "https://discord.gg/g6NHNq9tey" + ChatColor.GRAY + "!");

    }

}
