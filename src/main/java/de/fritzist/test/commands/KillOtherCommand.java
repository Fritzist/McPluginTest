package de.fritzist.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillOtherCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            if (args.length == 0) {
                player.sendMessage("§5Du hast dich selbst umgebracht");
                player.setHealth(0);
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);
                if(target instanceof Player){
                    target.sendMessage("§5Du bist gestorben");
                    target.setHealth(0);
                    player.sendMessage("§4Du hast" + target.getDisplayName() + "§4umgebracht");

                }else{
                    player.sendMessage("§4Diesen Spieler gibt es nicht");
                }

            }
        }
        return true;
    }
}
//ist im die command eingebaut
