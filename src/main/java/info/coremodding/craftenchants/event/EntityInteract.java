/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import info.coremodding.craftenchants.item.ItemsCE;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import scala.util.Random;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityInteract {
	/** Chance shears drops item. */
	private static int shearDropChance = 50;
	/** Maximum number of items to drop on success */
	private static int maxHorseHairDropCount = 3;

	@SubscribeEvent
	public void interact(EntityInteractEvent interaction) {
		EntityPlayer player = interaction.entityPlayer;
		ItemStack itemInHand = player.inventory.getCurrentItem();
		if (itemInHand != null && itemInHand.getItem().equals(Items.shears)) {
			Entity target = interaction.target;
			if (target instanceof EntityHorse) {
				EntityHorse horseTarget = (EntityHorse) target;
				if (horseTarget.getTemper() > 0) {
					Random random = new Random();
					int dropChance = random.nextInt(100);
					if (dropChance < shearDropChance) {
						int dropCount = random.nextInt(maxHorseHairDropCount) + 1;
						target.dropItem(ItemsCE.horseHair, dropCount);
						horseTarget.increaseTemper(-dropCount);
					}
				}
			}
		}
	}
}
