package main;

import org.bukkit.plugin.java.JavaPlugin;

public class NoticeBoard extends JavaPlugin {
	
	public static NoticeBoard instance;
	
	@Override
	public void onEnable() {
		instance =this;
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();
		getLogger().info(getDescription().getName()+ " onEnable");
	}
}
