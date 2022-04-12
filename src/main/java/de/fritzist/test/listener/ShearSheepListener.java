package de.fritzist.test.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public final class ShearSheepListener implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event) {

        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.SHEEP) {
            player.sendMessage("§bDas ist ein Schaf sussy Baka, du kannst das net tun.");
            event.setCancelled(false);
            //wenn true = gecannceld false = nicht gecannceld
        } else {
            player.sendMessage("§bDas ist kein Schaf dumb Baka");
        }
    }
}
