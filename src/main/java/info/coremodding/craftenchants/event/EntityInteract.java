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

import scala.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;


public class EntityInteract {
  /** Chance shears drops item. */
  private static int shearDropChance = 50;
  /** Maximum number of items to drop on success */
  private static int maxHorseHairDropCount = 3;

  @ForgeSubscribe
  public void interact(EntityInteractEvent interaction) {
    EntityPlayer player = interaction.entityPlayer;
    ItemStack itemInHand = player.inventory.getCurrentItem();
    if (itemInHand != null && itemInHand.getItem().equals(Item.shears)) {
      Entity target = interaction.target;
      if (target instanceof EntityHorse) {
        EntityHorse horseTarget = (EntityHorse) target;
        if (horseTarget.getTemper() > 0) {
          Random random = new Random();
          int dropChance = random.nextInt(100);
          if (dropChance < shearDropChance) {
            int dropCount = random.nextInt(maxHorseHairDropCount) + 1;
            target.dropItem(ItemsCE.horseHair.itemID, dropCount);
            horseTarget.increaseTemper(-dropCount);
          }
        }
      }
    }
  }
}
