package net.fivekingdoms.mineralspawn;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class quitListener implements Listener{
	@EventHandler(priority = EventPriority.NORMAL)
    public void quitevent (final PlayerQuitEvent event){
        Player player = event.getPlayer();
        World world = Bukkit.getWorld("world");
        player.teleport(world.getSpawnLocation());
    }
}
