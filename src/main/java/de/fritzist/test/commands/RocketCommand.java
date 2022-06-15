package de.fritzist.test.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RocketCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            Location loc = player.getLocation();
            loc.setY(loc.getY() + 0);
            loc.setZ(loc.getZ() + 2);
            loc.setX(loc.getX() + 0);
            loc.getBlock().setType(Material.WHITE_STAINED_GLASS);

            loc.setY(loc.getY() + 0);
            loc.setZ(loc.getZ() + 0);
            loc.setX(loc.getX() + 1);
            loc.getBlock().setType(Material.WHITE_STAINED_GLASS);

            loc.setY(loc.getY() + 0);
            loc.setZ(loc.getZ() + 0);
            loc.setX(loc.getX() + 1);
            loc.getBlock().setType(Material.WHITE_STAINED_GLASS);

            loc.setY(loc.getY() + 1);
            loc.setZ(loc.getZ() + 0);
            loc.setX(loc.getX() + -1);
            loc.getBlock().setType(Material.WHITE_STAINED_GLASS);

            loc.setY(loc.getY() + 1);
            loc.setZ(loc.getZ() + 0);
            loc.setX(loc.getX() + 0);
            loc.getBlock().setType(Material.WHITE_STAINED_GLASS);
            }

        return true;
    }
}
