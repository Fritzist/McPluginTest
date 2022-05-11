package de.fritzist.test.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GuiEvent implements Listener {

    @EventHandler
    public void guiEvent(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("§5Quick menu")) {

            switch (e.getCurrentItem().getType()) {
                case SKELETON_SKULL:
                    player.closeInventory();
                    player.setHealth(0.0);
                    player.sendMessage("§5You killed yourself");
                    break;
                case COOKED_BEEF:
                    player.setFoodLevel(20);
                    player.sendMessage("§5Yummy");
                    break;
                case ENCHANTED_GOLDEN_APPLE:
                    player.setHealth(20);
                    player.sendMessage("§5Healed");
                    break;
                case STICK:
                    ItemStack stick = new ItemStack(Material.STICK);
                    stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10000);
                    player.getInventory().addItem(stick);
                    player.sendMessage("§5Du hast jetzt ein §4OP §5stick");
                    break;
            }

            e.setCancelled(true);

        }
    }
}
