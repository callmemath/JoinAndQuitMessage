package it.im4th3w.joinandquitcustom.plugin.utils;

import org.bukkit.ChatColor;

public class Utils {
    public Utils() {
    }

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}