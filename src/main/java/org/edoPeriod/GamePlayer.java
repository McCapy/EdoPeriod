package org.edoPeriod;

import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public class GamePlayer {
    Player player;
    Technique.Stats stats;
    public GamePlayer(Player player, Technique.Stats stats) {
        this.player = player;
        this.stats = stats;
    }

    public Technique.Stats getStats() {
        return stats;
    }

    public Player getPlayer() {
        return player;
    }
    public PersistentDataContainer getContainer() {
        return player.getPersistentDataContainer();
    }

    public void incrementLevel() {

    }

    public void decrementLevel() {

    }

    public void setLevel(int level) {

    }
}
