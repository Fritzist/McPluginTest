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

import java.sql.Array;
import java.util.ArrayList;

public class VaultCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            Inventory vault = Bukkit.createInventory(p, 36, "§5Dein Geheimversteck");

            p.openInventory(vault);

            ItemStack item1 = new ItemStack(Material.WHITE_STAINED_GLASS, 64);
            ItemStack item2 = new ItemStack(Material.COOKED_CHICKEN, 64);
            ItemStack item3 = new ItemStack(Material.STICK, 1);

            item3.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10000);
            ItemMeta meta = item3.getItemMeta();
            meta.setDisplayName("§5Magischer Stock");
            meta.setUnbreakable(true);
            /*ArrayList<String> lore = new ArrayList<>();
            lore.add("§4Mehr");
            lore.add("§4Noch mehr");
            meta.setLore(lore);*/
            item3.setItemMeta(meta);

            vault.setItem(0, item1);
            vault.setItem(1, item2);
            vault.setItem(2, item3);

            vault.addItem(item1);
            vault.addItem(item2);
            vault.addItem(item3);

            vault.clear();

            ItemStack[] items = {item1, item2, item3};
            
            vault.setContents(items);

        }else{
            System.out.println("§5Du musst ein Spieler sein");
        }

        return true;
    }
}
