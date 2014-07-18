package net.fivekingdoms.mineralspawn;

import org.bukkit.plugin.java.JavaPlugin;

public class MineralSpawn extends JavaPlugin{
	@Override
	public void onEnable() {
		getLogger().info("MineralSpawn fix is enabled. <3 Josh");
		getServer().getPluginManager().registerEvents(new quitListener(), this);
	}
 
	@Override
	public void onDisable() {
		getLogger().info("MineralSpawn fix is disabled. <3 Josh");
	}
}


