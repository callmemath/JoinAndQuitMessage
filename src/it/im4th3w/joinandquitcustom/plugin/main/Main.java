package it.im4th3w.joinandquitcustom.plugin.main;

import org.bukkit.plugin.java.JavaPlugin;
import it.im4th3w.joinandquitcustom.plugin.join.Join;
import it.im4th3w.joinandquitcustom.plugin.listener.JoinMessage;
import it.im4th3w.joinandquitcustom.plugin.quit.Quit;

public class Main extends JavaPlugin {
    public Main() {
    }

    public void onEnable() {
        this.saveDefaultConfig();
        new JoinMessage(this);
        new Join(this);
        new Quit(this);
    }
}
