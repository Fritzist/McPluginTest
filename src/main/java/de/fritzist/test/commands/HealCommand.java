package de.fritzist.test.commands;

import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /feed -> Fills the hungerbar from the player
        if (command.getName().equalsIgnoreCase("heal")) {

            if (sender instanceof Player) {

                Player p = (Player) sender;
                p.setHealth(20);
                p.sendMessage("§9Yoooooooo einfach wieder voll SUSY BAKA");

            }else if (sender instanceof ConsoleCommandSender) {
                System.out.println("§4Du musst ein Spieler sein");

            }else if (sender instanceof CommandBlock) {
                System.out.println("§4Du musst ein Spieler sein");
            }
        }
        return true;
    }
}
