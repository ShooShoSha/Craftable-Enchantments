/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumToolMaterial;

import info.coremodding.craftenchants.item.ItemCE;

public class Studs extends ItemCE implements EnchantsMaterial {
  private EnumToolMaterial enchantMaterial;

  /**
   * @param id
   * @param enchantMaterial
   */
  public Studs(int id, EnumToolMaterial enchantMaterial) {
    super(id, "studs" + enchantMaterial.toString().toLowerCase());
    this.enchantMaterial = enchantMaterial;
    setEnchantment(Enchantment.thorns, getMaterialEnchantmentLevel());
  }

  public int getMaterialEnchantmentLevel() {
    return this.enchantMaterial.getHarvestLevel();
  }
}
