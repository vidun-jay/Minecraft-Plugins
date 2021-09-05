package com.vidunjayakody.hehe;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {

        //creates new BlockBreakEvent object
        Block blockBroken = event.getBlock();
        //creates variable 'player' as an event.getPlayer() casted to a Player object
        Player player = (Player) event.getPlayer();

        if (blockBroken.getType() == Material.DIAMOND_ORE) {
            //cancel the blockBreak event
            event.setCancelled(true);

            //replace with air
            blockBroken.setType(Material.AIR);

            //create new itemstack object
            ItemStack beetroot = new ItemStack(Material.BEETROOT, 5);

            //spawn beetroot in world
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), beetroot);

            player.sendMessage("no diadnoms. 5 beetroots ok?.");

        }

    }

}
