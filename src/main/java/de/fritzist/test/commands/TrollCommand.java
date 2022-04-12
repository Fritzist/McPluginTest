package de.fritzist.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TrollCommand implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /troll <spieler> <Herobrine | tnt | creeper>
        if(args.length == 2){
            System.out.println(args[0]);
            Player player = Bukkit.getPlayerExact(args[0]);
            if(player != null){
                switch (args[1].toLowerCase(Locale.ROOT)){
                    case "herobrine":
                        player.sendMessage("§eHerobrine joined the game");
                        break;
                    case "tnt":
                        player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                        break;
                    case "creeper":
                        player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                        break;
                    default:
                        sender.sendMessage("§4Bitte nutze §6/troll <spieler> <Herobrine | tnt  | creeper>§4!!!");
                }
            }else{
            sender.sendMessage("§4Bitte gebe einen echten Spielernamen ein!!!");
            }
        }else{
            sender.sendMessage("§4Bitte nutze §6/troll <spieler> <herobrine | tnt | creeper>§4!!!");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        List<String> tabs = new ArrayList<>();
        if (args.length == 1){
            for(Player p: Bukkit.getOnlinePlayers()) tabs.add(p.getName());
        }
        if (args.length == 2) {
            tabs.add("creeper");
            tabs.add("herobrine");
            tabs.add("tnt");
        }
        return tabs;
    }
}
