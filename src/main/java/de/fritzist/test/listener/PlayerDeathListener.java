package de.fritzist.test.listener;

import de.fritzist.test.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private final Main main;

    public PlayerDeathListener(Main main){
        this.main = main;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){



    }
}
