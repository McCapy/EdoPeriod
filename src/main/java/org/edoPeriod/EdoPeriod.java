package org.edoPeriod;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class EdoPeriod extends JavaPlugin {

    public static EdoPeriod plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new PlayerManager(),this);
        LevelManager.key = new NamespacedKey(EdoPeriod.plugin,"level");
        PlayerManager.key = new NamespacedKey(EdoPeriod.plugin,"technique");
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
