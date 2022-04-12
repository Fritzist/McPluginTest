package de.fritzist.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /god -> macht dich unsterblich
        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.isInvulnerable()) {

                p.setInvulnerable(false);

                p.sendMessage("§4Nicht mehr unsterblich du Lappen");

            }else{
                p.sendMessage("§1Sheeesh einfach unsterblich Sussy Baka");
                p.setInvulnerable(true);
            }

        }
        return true;
    }
}
