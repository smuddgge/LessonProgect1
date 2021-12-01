package me.smudgg.progect1.commands;

import me.smudgg.progect1.configs.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetPoints implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.isOp()) return false;

            Config.get().set(player.getName(), Integer.valueOf(args[0]));
            Config.save();


        }
        return false;
    }
}
