package de.fritzist.test.listener;

import de.fritzist.test.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class SpawnListener implements Listener {

    private final Main plugin;

    public SpawnListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPLayerJoinEvent(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if(player.getPlayer().hasPlayedBefore()){
            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null){

                player.teleport(location);
                player.sendMessage("§5You got teleported to your spawn");
            }
        }
    }
    @EventHandler
    public void onPLayerRespawn(PlayerRespawnEvent e){

        Location location = plugin.getConfig().getLocation("spawn");
        if (location != null){
            e.setRespawnLocation(location);
        }
    }
}
