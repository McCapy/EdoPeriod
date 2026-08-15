package org.edoPeriod;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;

public class PlayerManager implements Listener {
    static final Map<Player,GamePlayer> playerMap = new HashMap<>(10);
    public static NamespacedKey key;
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        playerMap.put(player,new GamePlayer(player,new Technique.Stats(player)));
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        playerMap.remove(event.getPlayer());
    }
}
