/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
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
