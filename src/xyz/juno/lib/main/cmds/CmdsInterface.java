package xyz.juno.lib.main.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public interface CmdsInterface {
	Player toPlayer();
	void send(String message);
	void sendPath(JavaPlugin javaPlugin, String prefix, String path);
	boolean isPlayer();
	boolean isArgument(String argument, String ArgumentRegex);
	boolean hasPermission(String permission);
	boolean isLength(String[] a, int length);
	boolean isMinvMaxLength(String[] a, int min, int max);
	boolean isMaxLength(String[] a, int length);
	
	public static class CmdsExecute implements CmdsInterface {
		private CommandSender sender;
		
		public CmdsExecute(CommandSender sender) {
			this.sender = sender;
		}
		
		public String Color(String text) {
			return ChatColor.translateAlternateColorCodes('&', text);
		}
		
		@Override
		public Player toPlayer() {
			return (Player)sender;
		}

		@Override
		public void send(String message) {
			sender.sendMessage(Color(message));
		}

		@Override
		public void sendPath(JavaPlugin javaPlugin, String prefix, String path) {
			String message = javaPlugin.getConfig().getString(path);
			sender.sendMessage(Color(message.replaceAll("(\\%prefix%)", prefix)
					));
		}

		@Override
		public boolean isPlayer() {
			return sender instanceof Player ? true : false;
		}

		@Override
		public boolean isLength(String[] a, int length) {
			return a.length == length ? true : false;
		}

		@Override
		public boolean isMinvMaxLength(String[] a, int min, int max) {
			return a.length > min && a.length < max ? true : false;
		}

		@Override
		public boolean hasPermission(String permission) {
			return ((Player)sender).hasPermission(permission) ? true : false;
		}

		@Override
		public boolean isArgument(String argument, String ArgumentRegex) {
			return argument.toLowerCase().matches(ArgumentRegex) ? true : false;
		}

		@Override
		public boolean isMaxLength(String[] a, int length) {
			return a.length < length ? true : false;
		}
	}
	
	public static class CmdsAPI {
		private static CmdsExecute cmdsExecute;
		
		public static CmdsExecute sender(CommandSender sender) {
			cmdsExecute = new CmdsExecute(sender);
			return cmdsExecute;
		}
	}
}