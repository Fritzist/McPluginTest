package de.fritzist.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class QuickMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, "§5Quick menu");

            ItemStack suicide = new ItemStack(Material.SKELETON_SKULL);
            ArrayList<String> suicide_lore = new ArrayList<>();
            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName("§7Suicide");
            suicide_lore.add("§BKill yourself");
            suicide_meta.setLore(suicide_lore);
            suicide.setItemMeta(suicide_meta);

            ItemStack feed = new ItemStack(Material.COOKED_BEEF);
            ItemMeta feed_meta = feed.getItemMeta();
            feed_meta.setDisplayName("§6Feed");
            ArrayList<String> feed_lore = new ArrayList<>();
            feed_lore.add("§BFeed yourself");
            feed_meta.setLore(feed_lore);
            feed.setItemMeta(feed_meta);

            ItemStack heal = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
            ItemMeta heal_meta = heal.getItemMeta();
            heal_meta.setDisplayName("§3Heal");
            ArrayList<String> heal_lore = new ArrayList<>();
            heal_lore.add("§BHeal yourself");
            heal_meta.setLore(heal_lore);
            heal.setItemMeta(heal_meta);

            ItemStack stick = new ItemStack(Material.STICK);
            ItemMeta stick_meta = stick.getItemMeta();
            stick_meta.setDisplayName("§aOp stick");
            ArrayList<String> stick_lore = new ArrayList<>();
            stick_lore.add("§BGives you an op stick");
            stick_meta.setLore(stick_lore);
            stick.setItemMeta(stick_meta);
            stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10000);


            ItemStack[] menu_items = {suicide, feed, heal, stick};
            gui.setContents(menu_items);
            player.openInventory(gui);

        }




        return true;
    }
}
