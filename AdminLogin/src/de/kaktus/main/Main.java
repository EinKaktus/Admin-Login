package de.kaktus.main;

import de.kaktus.main.commands.LoginCMD;
import de.kaktus.main.listener.LoginEvents;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {

    public static List<Player> login = new ArrayList<>();

    @Override
    public void onEnable() {

        getCommand("login").setExecutor(new LoginCMD());

        Bukkit.getPluginManager().registerEvents(new LoginEvents(), this);
    }
}
