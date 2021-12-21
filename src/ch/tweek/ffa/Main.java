package ch.tweek.ffa;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	/*
	 * @author TweekLG
	 * (non-Javadoc)
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */

	public void onEnable() {
		System.out.println("Plugin started");
		getServer().getPluginManager().registerEvents(new mainListener(), this);
	}
	
	public void onDisable() {
		System.out.println("Plugin stopped");
	}

	
}
