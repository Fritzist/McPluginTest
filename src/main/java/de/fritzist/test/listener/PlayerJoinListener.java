package de.fritzist.test.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.getConsoleSender().sendMessage("§4Jemand ist dem Server gejoint!!!");
        event.setJoinMessage("§4Hey sussy BAKA!!!!");
    }
}