package de.kaktus.main.listener;

import de.kaktus.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class LoginEvents implements Listener {


    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();

        if (p.hasPermission("admin.login")){
            if (!Main.login.contains(p)){
                e.setCancelled(true);
            }else{
                e.setCancelled(false);
            }
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player p = e.getPlayer();

        if (p.hasPermission("admin.login")){
            if (!Main.login.contains(p)){
                e.setCancelled(true);
            }else{
                e.setCancelled(false);
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (p.hasPermission("admin.login")){
            if (!Main.login.contains(p)){
                p.sendMessage("§cBitte logge dich ein! /login <passwort>");
            }
        }
    }
}
