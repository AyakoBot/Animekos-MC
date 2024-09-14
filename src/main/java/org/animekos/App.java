package org.animekos;

import org.animekos.events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
 @Override
 public void onEnable() {
  getServer().getPluginManager().registerEvents(new Events(), this);
  getServer().getConsoleSender().sendMessage(ChatColor.RED + "Hello, World!");
 }

 @Override
 public void onDisable() {
  getServer().getConsoleSender().sendMessage(ChatColor.RED + "Goodbye, World!");
 }
}
