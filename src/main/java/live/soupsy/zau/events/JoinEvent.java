package live.soupsy.zau.events;

import live.soupsy.zau.ZAU;
import live.soupsy.zau.game.Game;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class DisconnectEvent implements Listener {
    @EventHandler
    public void onChat(PlayerQuitEvent e){
        if(Game.getStatus().equals(1)){
            Game.pauseGame();
        }
    }
}
