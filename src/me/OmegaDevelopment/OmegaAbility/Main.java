package me.OmegaDevelopment.OmegaAbility;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.OmegaDevelopment.OmegaAbility.Events.InvisEvent;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new InvisEvent(), this);
	}
	
	public void onDisable() {
		
	}

}
