/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;

import info.coremodding.craftenchants.item.ItemCE;

public class ReinforcedNock extends ItemCE {
  public ReinforcedNock(int id) {
    super(id, "reinforcednock");
    setEnchantment(Enchantment.power, 2);
  }

}
