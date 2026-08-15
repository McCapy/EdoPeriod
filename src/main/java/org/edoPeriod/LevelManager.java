package org.edoPeriod;

import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

@SuppressWarnings("DataFlowIssue")
public final class LevelManager {
    public static NamespacedKey key;
    private LevelManager() {}
    public void set(GamePlayer player, int level) {
        player.getContainer().set(key,PersistentDataType.INTEGER,level);
    }
    public int get(GamePlayer player) {
        return player.getContainer().get(key,PersistentDataType.INTEGER);
    }
    public void add(GamePlayer player, int amt) {
        PersistentDataContainer container = player.getContainer();
        container.set(key,PersistentDataType.INTEGER,(container.get(key,PersistentDataType.INTEGER)) + amt);
    }
}
