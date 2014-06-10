package info.coremodding.craftenchants.event;

import info.coremodding.craftenchants.item.ItemsCE;

import java.util.Random;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class LivingDrops {
	/** Chance death drops item. */
	private static int deathDropChance = 5;
	/** Maximum number of items to drop on success */
	private static int maxHorseHairDropCount = 3;

	@SubscribeEvent
	public void onEntityLivingDeath(LivingDeathEvent event) {
		if (event.entity instanceof EntityHorse) {
			Random random = new Random();
			int dropChance = random.nextInt(100);
			if (dropChance < deathDropChance) {
				int dropCount = random.nextInt(maxHorseHairDropCount) + 1;
				event.entity.dropItem(ItemsCE.horseHair, dropCount);
			}
		}
	}
}
