package de.fritzist.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(args.length > 0) {
                player.sendMessage(String.join(" ", args));

            }else{
                player.sendMessage("§4Du musst ein argument eingeben");
                player.sendMessage("§5/me [Das was du ausgeben möchtest]");
            }







        }else{
            System.out.println("§4Du musst ein Spieler sein");
        }




        return true;
    }
}
