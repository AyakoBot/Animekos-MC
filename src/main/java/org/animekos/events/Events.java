package org.animekos.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {
 @EventHandler
 public static void onPlayerJoin(PlayerJoinEvent event) {
  event.getPlayer().sendMessage("Welcome to the server!");
 }
}
