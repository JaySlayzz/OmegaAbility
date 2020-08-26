package me.OmegaDevelopment.OmegaAbility.Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InvisSack {

	 public static ItemStack invisItem() {

			ItemStack shardItem = new ItemStack(Material.INK_SACK);
			ItemMeta shardMeta = shardItem.getItemMeta();
			shardMeta.setDisplayName(ChatColor.YELLOW + "Invis");

			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.YELLOW + "Right click for 15");
			lore.add(ChatColor.YELLOW + "seconds of Invisibility");
			shardMeta.setLore(lore);


			shardItem.setItemMeta(shardMeta);
			return shardItem;
		}
	
}
