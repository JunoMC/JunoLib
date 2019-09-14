package xyz.juno.lib.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class JunoLib extends JavaPlugin implements Listener {

	@Override public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§f      __               __   _ __");
		Bukkit.getConsoleSender().sendMessage("§f  __ / /_ _____  ___  / /  (_) /");
		Bukkit.getConsoleSender().sendMessage("§f / // / // / _ \\/ _ \\/ /__/ / _ \\");
		Bukkit.getConsoleSender().sendMessage("§f \\___/\\_,_/_//_/\\___/____/_/_.__/");
	}
	
	@Override public void onDisable() {}
}