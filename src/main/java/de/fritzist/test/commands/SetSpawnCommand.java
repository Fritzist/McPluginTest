package de.fritzist.test.commands;

import de.fritzist.test.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final Main plugin;

    public SetSpawnCommand(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            Location location = player.getLocation();

            /*plugin.getConfig().set("spawn.x", location.getBlockX());
            plugin.getConfig().set("spawn.y", location.getBlockY());
            plugin.getConfig().set("spawn.z", location.getBlockZ());
            plugin.getConfig().set("spawn.worldName", location.getWorld().getName());
             */
            plugin.getConfig().set("spawn", location);

            plugin.saveConfig();

            player.sendMessage("§5Spawn Location set");

        }else {
            System.out.println("Bruh, Join the server");
        }

        return true;
    }
}
