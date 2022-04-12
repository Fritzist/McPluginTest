package de.fritzist.test.commands;

import de.fritzist.test.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final Main plugin;

    public SpawnCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null){

                player.teleport(location);
                player.sendMessage("§5You got teleported to your spawn");
            }else{
                System.out.println("Es fibt keinen Spawnpoint du brauchst einen");
            }
        }
        return true;
    }
}
