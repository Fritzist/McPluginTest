package de.fritzist.test.commands;

import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import static sun.audio.AudioPlayer.player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /feed -> Fills the hungerbar from the player
        //if (command.getName().equalsIgnoreCase("feed")) {
        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (player.hasPermission("feed")) {
                player.setFoodLevel(20);
                player.sendMessage("§4war es lecker SUSY BAKA?");
            }else{
                player.sendMessage("§4Du hast icht die Rechte dazu");
            }

        }else {
            System.out.println("§4Du musst ein Spieler sein");
        }

        /*} else if (sender instanceof CommandBlock) {
            System.out.println("§4Du musst ein Spieler sein");
        }*/

        return true;
    }
}


