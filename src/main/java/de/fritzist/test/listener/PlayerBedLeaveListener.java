package de.fritzist.test.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerBedLeaveListener implements Listener {
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        //player.setHealth(0); um leben zu setzten
        player.sendMessage("§2Gut geschlafen SUSSY BAKA?");

    }
}