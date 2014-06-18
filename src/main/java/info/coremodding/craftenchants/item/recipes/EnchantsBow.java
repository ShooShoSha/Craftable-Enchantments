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
package info.coremodding.craftenchants.item.recipes;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import info.coremodding.craftenchants.item.ItemCE;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;

public class EnchantsBow implements IRecipe {
  private ItemCE enchantingItem;
  private ItemStack enchantableBow;

  /**
   * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting,
   *      net.minecraft.world.World)
   */
  @Override
  public boolean matches(InventoryCrafting craftingMatrix, World craftWorld) {
    boolean containsBow = false;
    boolean containsEnchant = false;
    ItemStack slottedItemStack;
    for (int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
      slottedItemStack = craftingMatrix.getStackInSlot(slot);
      if (slottedItemStack != null) {
        Item slottedItem = slottedItemStack.getItem();
        if (slottedItem instanceof ItemBow) {
          enchantableBow = slottedItemStack.copy();
          containsBow = true;
        }
        if (slottedItem instanceof ReinforcedNock) {
          enchantingItem = (ItemCE) slottedItem;
          containsEnchant = true;
        }
      }
    }
    return containsEnchant && containsBow;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
   */
  @Override
  public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
    return shouldEnchant() ? applyEnchant() : null;
  }

  private boolean shouldEnchant() {
    return !enchantableBow.isItemEnchanted();
  }

  private ItemStack applyEnchant() {
    enchantableBow.addEnchantment(enchantingItem.getEnchantmentType(),
        enchantingItem.getEnchantmentLevel());
    return enchantableBow;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
   */
  @Override
  public int getRecipeSize() {
    return 0;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getRecipeOutput()
   */
  @Override
  public ItemStack getRecipeOutput() {
    return null;
  }

}
