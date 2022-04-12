package de.fritzist.test.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public final class XPBottleBreakListener implements Listener {

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent event) {
        event.setShowEffect(true);
        //wenn false werden die blauen particle net angezeigt!!!
    }
}
