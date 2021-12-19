package ch.tweek.ffa;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	/**
	 * @author SeenKid
	 */
	
  public void onEnable() {
    System.out.println("Plugin started");
    getServer().getPluginManager().registerEvents(new mainListener(), (Plugin)this);
  }
  
  public void onDisable() {
    System.out.println("Plugin stopped");
  }
}
