package de.fritzist.test.commands;

import com.sun.jmx.mbeanserver.StandardMBeanSupport;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GXpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("gxp")) {

            if  (sender instanceof Player) {

                Player p = (Player) sender;
                    p.setLevel(69);
                p.sendMessage("§4Zum enchanten sussy baka");

            }else if (sender instanceof ConsoleCommandSender) {
                System.out.println("§4Du musst ein Spieler sein");

            }else if (sender instanceof CommandBlock) {
                System.out.println("§4Du musst ein Spieler sein");
            }
        }
        return true;
    }
}
