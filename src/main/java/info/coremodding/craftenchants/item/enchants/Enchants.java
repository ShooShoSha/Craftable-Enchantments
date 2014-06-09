/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;

public interface Enchants {
  public abstract boolean hasEnchantment();
  public abstract Enchantment getEnchantmentType();
  public abstract int getEnchantmentLevel();
}
