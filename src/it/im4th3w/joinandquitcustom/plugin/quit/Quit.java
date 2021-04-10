package it.im4th3w.joinandquitcustom.plugin.quit;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import it.im4th3w.joinandquitcustom.plugin.main.Main;
import it.im4th3w.joinandquitcustom.plugin.utils.Utils;

public class Quit implements Listener {
    private static Main plugin;

    public Quit(Main plugin) {
        Quit.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPlayedBefore()) {
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstleave_message").replace("<player>", p.getName())));
        } else {
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("leave_message").replace("<player>", p.getName())));
        }

    }
    
    @EventHandler
    public void onVipJoin(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPermission("joinandquitcustom.vip")){
            Bukkit.broadcastMessage((Utils.chat(plugin.getConfig().getString("vip_leave").replace("<player>", p.getName()))));
        }
    }
}