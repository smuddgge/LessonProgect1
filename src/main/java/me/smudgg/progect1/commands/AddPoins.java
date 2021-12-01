package me.smudgg.progect1.commands;

import me.smudgg.progect1.configs.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddPoins implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.isOp()) return false;

            int pointsToAdd = Integer.parseInt(args[0]);

            try {
                int currentPoints = Config.get().getInt(player.getName());

                Config.get().set(player.getName(), currentPoints + pointsToAdd);
                Config.save();

            } catch (Exception ignore) {
                if (pointsToAdd <= 0) return true;
                Config.get().set(player.getName(), pointsToAdd);
            }
        }

        return false;
    }
}
