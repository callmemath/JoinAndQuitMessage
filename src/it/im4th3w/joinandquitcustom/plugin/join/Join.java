package it.im4th3w.joinandquitcustom.plugin.join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import it.im4th3w.joinandquitcustom.plugin.main.Main;
import it.im4th3w.joinandquitcustom.plugin.utils.Utils;

public class Join implements Listener {
    private static Main plugin;

    public Join(Main plugin) {
        Join.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPlayedBefore()) {
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstjoin_message").replace("<player>", p.getName())));
        } else {
            Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", p.getName())));
        }
        
    }
    
    @EventHandler
    public void onVipJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPermission("joinandquitcustom.vip")){
            Bukkit.broadcastMessage((Utils.chat(plugin.getConfig().getString("vip_join").replace("<player>", p.getName()))));
        }
    }
}