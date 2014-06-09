/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.CraftableEnchantments;
import info.coremodding.craftenchants.item.enchants.Enchants;
import info.coremodding.craftenchants.proxy.Proxy;

public abstract class ItemCE extends Item implements Enchants {
  private Enchantment enchantType;
  private int enchantLevel;

  protected ItemCE(int id, String unlocalName) {
    super(id);
    setCreativeTab(Proxy.tabMain);
    setUnlocalizedName(CraftableEnchantments.ID + ":" + unlocalName);
    setTextureName(CraftableEnchantments.ID + ":" + unlocalName);
  }
  
  protected void setEnchantment(Enchantment enchantType, int enchantLevel) {
    setEnchantmentType(enchantType);
    setEnchantmentLevel(enchantLevel);
  }
  
  public boolean hasEnchantment() {
    return getEnchantmentType() != null && getEnchantmentLevel() > 0;
  }

  private void setEnchantmentType(Enchantment enchantType) {
    this.enchantType = enchantType;
  }

  public Enchantment getEnchantmentType() {
    return this.enchantType;
  }

  private void setEnchantmentLevel(int enchantLevel) {
    this.enchantLevel = enchantLevel;
  }

  public int getEnchantmentLevel() {
    return this.enchantLevel;
  }

}
