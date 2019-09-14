package xyz.juno.lib.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ItemAPI implements Listener {
	
	private static String Color(String text) {
		return ChatColor.translateAlternateColorCodes('&', text);
	}
	
	public static ItemStack ItemStackAPI(Material material) {
		 return new ItemStack(material);
	}
	
	public static ItemStack ItemStackAPI(Material material, List<String> lore) {
		 ItemStack itemStack = new ItemStack(material);
		 ItemMeta itemMeta = itemStack.getItemMeta();
		 
		 List<String> list = new ArrayList<String>();
		 
		 for (String l : lore) {
			 list.add(Color(l));
		 }
		 
		 itemMeta.setLore(list);
		 itemStack.setItemMeta(itemMeta);
		 return itemStack;
	}
	
	public static ItemStack ItemStackAPI(Material material, int amount) {
		return new ItemStack(material, amount);
	}
	
	public static ItemStack ItemStackAPI(Material material, int amount, List<String> lore) {
		 ItemStack itemStack = new ItemStack(material, amount);
		 ItemMeta itemMeta = itemStack.getItemMeta();
		 
		 List<String> list = new ArrayList<String>();
		 
		 for (String l : lore) {
			 list.add(Color(l));
		 }
		 
		 itemMeta.setLore(list);
		 itemStack.setItemMeta(itemMeta);
		 return itemStack;
	}
	
	public static ItemStack ItemStackAPI(Material material, byte durability) {
		return new ItemStack(material, 1, durability);
	}
	
	public static ItemStack ItemStackAPI(Material material, byte durability, List<String> lore) {
		 ItemStack itemStack = new ItemStack(material, durability);
		 ItemMeta itemMeta = itemStack.getItemMeta();
		 
		 List<String> list = new ArrayList<String>();
		 
		 for (String l : lore) {
			 list.add(Color(l));
		 }
		 
		 itemMeta.setLore(list);
		 itemStack.setItemMeta(itemMeta);
		 return itemStack;
	}
	
	public static ItemStack ItemStackAPI(Material material, int amount, byte durability) {
		return new ItemStack(material, amount, durability);
	}
	
	public static ItemStack ItemStackAPI(Material material, String name) {
		ItemStack itemStack = new ItemStack(material);
		ItemMeta meta = itemStack.getItemMeta();
		meta.setDisplayName(Color(name));
		itemStack.setItemMeta(meta);
		return itemStack;
	}
	
	public static ItemStack ItemStackAPI(Material material, int amount, String name) {
		ItemStack itemStack =  new ItemStack(material, amount);
		ItemMeta meta = itemStack.getItemMeta();
		meta.setDisplayName(Color(name));
		itemStack.setItemMeta(meta);
		return itemStack;
	}
	
	public static ItemStack ItemStackAPI(Material material, int amount, byte durability, String name) {
		ItemStack itemStack =  new ItemStack(material, amount, durability);
		ItemMeta meta = itemStack.getItemMeta();
		meta.setDisplayName(Color(name));
		itemStack.setItemMeta(meta);
		return itemStack;
	}
}