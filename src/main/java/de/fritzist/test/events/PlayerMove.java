package de.fritzist.test.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

    @EventHandler
    void onPlayerMove(PlayerMoveEvent event){
        Player player = event.getPlayer();

        //Entity entity = player.getWorld().spawnEntity(player.getLocation(), EntityType.SNOWBALL);
        //entity.setGlowing(true);


        if (!player.hasPermission("move")) {
            event.setCancelled(true);
        }
    }
}
