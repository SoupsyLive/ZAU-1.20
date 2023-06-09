package live.soupsy.zau.commands.subcommands;

import live.soupsy.zau.ZAU;
import live.soupsy.zau.commands.SubCommand;
import live.soupsy.zau.game.Game;
import live.soupsy.zau.gui.AbilitySelectGui;
import live.soupsy.zau.utils.PlayerStorage;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MolePauseSubcommand extends SubCommand{
    @Override
    public String getName() {
        return "pause";
    }

    @Override
    public String getDescription() {
        return "pauses the game";
    }

    @Override
    public String getSyntax() {
        return "/mole pause";
    }

    @Override
    public void perform(Player player, String[] args) {
        if(args.length > 0){
            if(Game.getStatus() == 2){
                player.sendMessage("§6§l[ZAU]§r§f: §ePaused.");
                Game.pauseGame();
                return;
            }
            player.sendMessage("§6§l[ZAU]§r§4: §4§lError! §r§cThe game must be active to pause.");
        }
    }
}
