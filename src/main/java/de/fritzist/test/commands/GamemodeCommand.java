package de.fritzist.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GamemodeCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 1) {

                GameMode gamemode = null;
                for(GameMode gm : GameMode.values()){
                    if(gm.name().toLowerCase(Locale.ROOT).startsWith(args[0].toLowerCase(Locale.ROOT))||(gm.getValue()+"").equals(args[0])){
                       gamemode = gm;
                    }
                }
                if(gamemode != null){
                    player.setGameMode(gamemode);
                    player.sendMessage("§bDu bist nun im Gamemode "+gamemode.name().toLowerCase(Locale.ROOT));
                }else{
                    player.sendMessage("§4Das ist kein gültiger Gamemode");
                }
            }
        } else {
            sender.sendMessage("§bDu Pleb du musst ein Spieler sein");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        List<String> tabs = new ArrayList<>();
        /*if (args.length == 1){
            for(Player p: Bukkit.getOnlinePlayers()) tabs.add(p.getName());
        } für spielerw*/
        if (args.length == 1) {
            tabs.add("0");
            tabs.add("1");
            tabs.add("2");
            tabs.add("3");
        }

        return tabs;
    }
}
