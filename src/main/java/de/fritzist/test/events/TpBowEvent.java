package de.fritzist.test.events;

import de.fritzist.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TpBowEvent implements Listener {

    Main plugin;
    public TpBowEvent(Main plugin){
        this.plugin = plugin;
    }


    @EventHandler
    public void onBowShoot(ProjectileHitEvent e){

        if (e.getEntity() instanceof Arrow){
            Player player = (Player) e.getEntity().getShooter();
            Location location = e.getEntity().getLocation();



            player.teleport(location);
            player.playSound(player.getLocation(), Sound.ENTITY_ENDER_PEARL_THROW, 1.0F, 1.0F);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("teleport-message")));
        }
    }
}
