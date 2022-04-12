package de.fritzist.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class FartCommand implements CommandExecutor {

    private final HashMap<UUID, Long> cooldown;

    public FartCommand() {
        this.cooldown = new HashMap<>();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            if (!this.cooldown.containsKey(player.getUniqueId())){
                this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                player.sendMessage("§5Bruh! you farted");

            }else{

                long timeElapsed = System.currentTimeMillis() - cooldown.get(player.getUniqueId());

                if (timeElapsed >= 10000){
                    player.sendMessage("§5Bruh! you farted");

                    this.cooldown.put(player.getUniqueId(), System.currentTimeMillis());

                }else{
                    player.sendMessage("§4You can do it again after " + ( 10000 - timeElapsed ) + " milliseconds");
                }

            }
        }
        return true;
    }
}
