package de.fritzist.test;

import de.fritzist.test.commands.*;
import de.fritzist.test.events.PlayerMove;
import de.fritzist.test.events.TpBowEvent;
import de.fritzist.test.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage("§4Gestartet");
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("troll").setExecutor((new TrollCommand()));
        getCommand("die").setExecutor((new DieCommand()));
        getCommand("feed").setExecutor((new FeedCommand()));
        getCommand("god").setExecutor((new GodCommand()));
        getCommand("heal").setExecutor((new HealCommand()));
        getCommand("gxp").setExecutor((new GXpCommand()));
        getCommand("me").setExecutor((new MeCommand()));
        getCommand("rocket").setExecutor((new RocketCommand()));
        getCommand("vault").setExecutor((new VaultCommand()));
        getCommand("setspawn").setExecutor((new SetSpawnCommand(this)));
        getCommand("spawn").setExecutor((new SpawnCommand(this)));
        getCommand("fart").setExecutor((new FartCommand()));
        getCommand("fly").setExecutor((new FlyCommand(this)));
        getCommand("tpbow").setExecutor(new TpBowCommand(this));
        //getCommand("print->config").setExecutor(new print->config);
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents((new ShearSheepListener()), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);
        getServer().getPluginManager().registerEvents(new SpawnListener(this), this);
        getServer().getPluginManager().registerEvents(new TpBowEvent(this),this);

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

if(command.getName().equals("printconfig")){
    Player player = (Player) sender;
    String food = getConfig().getString("Food");
    int number = getConfig().getInt("Number");
    boolean Boolean = getConfig().getBoolean("Boolean");
    String thirditem = getConfig().getStringList("Foodlist").get(2);

    player.sendMessage("§5Das Essen in config.yml ist " + "§4 " + food + number + Boolean + thirditem);
        }else if(command.getName().equals("setFood")){
            getConfig().set("Food", "Pommes" );
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("§4Stopped");
    }
}