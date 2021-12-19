package ch.tweek.ffa;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/*
* @Author SeenKid. This plugin was made by Seenkid. Please give credits.
*/

public class mainListener implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
	  
    Player player = event.getPlayer();
    
    player.getInventory().clear();
    
    ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
    ItemMeta customM = sword.getItemMeta();
    customM.setDisplayName("SWORD");
    customM.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
    customM.setUnbreakable(true);
    customM.setLore(Arrays.asList(new String[] { "Une classique", "bats toi au corps corps avec" }));
    sword.setItemMeta(customM);
    
    ItemStack trident = new ItemStack(Material.TRIDENT, 1);
    ItemMeta customD = sword.getItemMeta();
    customD.setDisplayName("");
    customD.addEnchant(Enchantment.LOYALTY, 2, true);
    customD.setUnbreakable(true);
    customD.setLore(Arrays.asList(new String[] { "Un trident pour te battre", "un outil... puissant ! COMME MA B***" }));
    trident.setItemMeta(customD);
    
    ItemStack bow = new ItemStack(Material.BOW, 1);
    ItemMeta customA = sword.getItemMeta();
    customA.setDisplayName("");
    customA.addEnchant(Enchantment.ARROW_INFINITE, 2, true);
    customA.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
    customA.setUnbreakable(true);
    customA.setLore(Arrays.asList(new String[] { "Oh, un arc !", "bat toi, petite campouse ! Ne full-arc pas !" }));
    bow.setItemMeta(customA);
    
    ItemStack fleche = new ItemStack(Material.ARROW, 64);
    ItemMeta customB = fleche.getItemMeta();
    customB.setDisplayName("fl");
    fleche.setItemMeta(customB);
    
    ItemStack gapple = new ItemStack(Material.GOLDEN_APPLE, 64);
    ItemMeta apple = gapple.getItemMeta();
    apple.setDisplayName("");
    gapple.setItemMeta(apple);
    
    ItemStack plastron = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
    ItemMeta plast = plastron.getItemMeta();
    plast.setUnbreakable(true);
    plastron.setItemMeta(plast);
    
    ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
    ItemMeta helm = helmet.getItemMeta();
    helm.setUnbreakable(true);
    helmet.setItemMeta(helm);
    
    ItemStack pantalon = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
    ItemMeta pant = pantalon.getItemMeta();
    pant.setUnbreakable(true);
    pantalon.setItemMeta(pant);
    
    ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
    ItemMeta bo = boots.getItemMeta();
    bo.setUnbreakable(true);
    boots.setItemMeta(bo);
    
    player.getInventory().setItem(0, sword);
    player.getInventory().setItem(1, trident);
    player.getInventory().setItem(2, bow);
    player.getInventory().setItem(9, fleche);
    player.getInventory().setItem(3, gapple);
    player.getInventory().setItem(4, helmet);
    player.getInventory().setItem(5, plastron);
    player.getInventory().setItem(6, pantalon);
    player.getInventory().setItem(7, boots);
    player.updateInventory();
  }
}
