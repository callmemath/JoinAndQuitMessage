package it.im4th3w.joinandquitcustom.plugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import it.im4th3w.joinandquitcustom.plugin.main.Main;

public class JoinMessage implements Listener {
    private static Main plugin;

    public JoinMessage(Main plugin) {
        JoinMessage.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage((String)null);
    }
}