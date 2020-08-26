package me.OmegaDevelopment.OmegaAbility.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.OmegaDevelopment.OmegaAbility.Chat.ChatHandler;
import me.OmegaDevelopment.OmegaAbility.Items.InvisSack;

public class InvisEvent implements Listener {

	@EventHandler
	public void invisEvent(PlayerInteractEvent e) {
		
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
			if(!e.getPlayer().getItemInHand().equals(InvisSack.invisItem())) {
				return;
			}
			
			e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 300, 2));
			e.getPlayer().sendMessage(ChatHandler.prefixFormatted + ChatHandler.invisSuccessFormatted);
			
			int amount = e.getPlayer().getItemInHand().getAmount();
			
			if(e.getPlayer().getItemInHand().getAmount() > 1) {
				e.getPlayer().getItemInHand().setAmount(amount - 1);
				return;
			}
			e.getPlayer().getItemInHand().setType(Material.AIR);
			e.getPlayer().updateInventory();
		}
		
		
	}
	
	
}
