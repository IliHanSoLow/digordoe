package org.io.digordoe;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;
import java.util.List;

public final class DigOrDoe extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        MultiverseCore core = (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");

        while (true){
            MultiverseWorld world0 = core.getMVWorldManager().getMVWorld("world");
            MultiverseWorld world1 = core.getMVWorldManager().getMVWorld("world_the_nether");
            MultiverseWorld world2 = core.getMVWorldManager().getMVWorld("world_the_end");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
