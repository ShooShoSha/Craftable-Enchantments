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
