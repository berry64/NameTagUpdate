package net.berry64.nametag;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class LOL extends JavaPlugin{
	public void onEnable(){
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
			@Override
			public void run() {
            	Player[] pl = Bukkit.getOnlinePlayers();
            	for(Player p: pl){
            		String name = p.getDisplayName();
            		p.setCustomName(name);
            		p.setCustomNameVisible(true);
            	}
            }
        },0L, 5L);
	}
}
