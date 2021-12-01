package me.smudgg.progect1.commands;

import me.smudgg.progect1.configs.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Points implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(String.valueOf(Config.get().getInt(player.getName())));

        }

        return false;
    }
}