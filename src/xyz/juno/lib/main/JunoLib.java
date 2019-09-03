package xyz.juno.lib.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class JunoLib extends JavaPlugin implements Listener {

	@Override public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("      __               __   _ __");
		Bukkit.getConsoleSender().sendMessage("  __ / /_ _____  ___  / /  (_) /");
		Bukkit.getConsoleSender().sendMessage(" / // / // / _ \\/ _ \\/ /__/ / _ \\");
		Bukkit.getConsoleSender().sendMessage(" \\___/\\_,_/_//_/\\___/____/_/_.__/");
		
	}
	
	@Override public void onDisable() {}
}