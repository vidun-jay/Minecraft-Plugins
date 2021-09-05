package com.vidunjayakody.creeperno;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public final class CreeperNO extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Starting plugin...");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        if(event.getEntity() instanceof Creeper) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onExplosionPrimeEvent(ExplosionPrimeEvent event) {
        int min = 0;
        int max = 6;
        if(event.getEntity() instanceof Creeper) {
            event.setCancelled(true);
            Creature c = (Creature) event.getEntity();
            c.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100, 1));
            c.setHealth(0);
            Creature z = (Creature) c.getWorld().spawnEntity(c.getLocation(), EntityType.SNOWMAN);

            int rand = (int)(Math.random() * (max - min + 1) + min);
            switch(rand) {
                case 0:
                    z.setCustomName("alfred");
                    z.setCustomNameVisible(true);
                    break;
                case 1:
                    z.setCustomName("bob");
                    z.setCustomNameVisible(true);
                    break;
                case 2:
                    z.setCustomName("frank");
                    z.setCustomNameVisible(true);
                    break;
                case 3:
                    z.setCustomName("joanne");
                    z.setCustomNameVisible(true);
                    break;
                case 4:
                    z.setCustomName("joseph");
                    z.setCustomNameVisible(true);
                    break;
                case 5:
                    z.setCustomName("hank");
                    z.setCustomNameVisible(true);
                    break;
                case 6:
                    z.setCustomName("christopher");
                    z.setCustomNameVisible(true);
                    break;
            }
        }
    }

}
