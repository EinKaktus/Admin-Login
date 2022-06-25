package de.kaktus.main.commands;

import de.kaktus.main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoginCMD implements CommandExecutor {

    String password;

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)) {
            return false;
        }
        Player p = (Player) s;
        if (p.hasPermission("admin.login")) {
            if (args.length == 1) {
                if (!Main.login.contains(p)) {
                    if (args[0].equalsIgnoreCase("admin")) {
                        Main.login.add(p);
                        p.sendMessage("§aDu hast dich eingeloggt!");
                    } else {
                        p.sendMessage("§cDas Password ist falsch!");
                    }
                }
                } else {
                    p.sendMessage("§cBitte nutze: /login <Passwort>");
                }
            }
        return false;
      }
}
