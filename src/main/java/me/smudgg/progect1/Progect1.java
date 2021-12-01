package me.smudgg.progect1;

import me.smudgg.progect1.commands.AddPoins;
import me.smudgg.progect1.commands.Points;
import me.smudgg.progect1.commands.Reload;
import me.smudgg.progect1.commands.SetPoints;
import me.smudgg.progect1.configs.Config;
import org.bukkit.plugin.java.JavaPlugin;

public final class Progect1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Setup configs
        Config.setup();
        Config.get().options().copyDefaults(true);
        Config.save();

        // Setup commands
        getCommand("preload").setExecutor(new Reload());
        getCommand("paddpoints").setExecutor(new AddPoins());
        getCommand("psetpoints").setExecutor(new SetPoints());
        getCommand("points").setExecutor(new Points());

    }
}
