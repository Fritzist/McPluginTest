package de.fritzist.test.commands;

import de.fritzist.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class TpBowCommand implements CommandExecutor {

    Main plugin;
    public TpBowCommand(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("tpbow.spawnbow")){
                ItemStack teleport_bow = new ItemStack(Material.BOW);
                teleport_bow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 666);

                ItemMeta meta = teleport_bow.getItemMeta();
                meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-name")));
                meta.setUnbreakable(true);
                ArrayList<String> lore = new ArrayList<>();
                lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-description")));
                meta.setLore(lore);
                teleport_bow.setItemMeta(meta);

                player.getInventory().addItem(teleport_bow);
            }
        }

        return true;
    }
}
