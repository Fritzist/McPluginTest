package de.fritzist.test.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        Bukkit.getConsoleSender().sendMessage("§4Jemand ist geleavt, was für'n kek!!!");
        event.setQuitMessage(ChatColor.RED + player.getDisplayName() + "§4ist geleavt, was für'n Kek");
    }
}
