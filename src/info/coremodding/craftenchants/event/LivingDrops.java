/**
 * Copyright 2014 CoreModding under LGPLv3 or later
 * Copyright 2014 shooshosha under LGPLv3 or later
 *
 * This file is part of Craftable-Enchantments.
 *
 * Craftable-Enchantments is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Craftable-Enchantments is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Craftable-Enchantments.  If not, see <http://www.gnu.org/licenses/>.
 */
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
