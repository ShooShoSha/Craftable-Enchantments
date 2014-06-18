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
package info.coremodding.craftenchants.item.enchants;

import info.coremodding.craftenchants.item.ItemCE;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;

public class Counterweight extends ItemCE implements EnchantsMaterial {
	private Item.ToolMaterial enchantMaterial;

	/**
	 * Main constructor for Counterweight. Applied to a weapon, attributes
	 * Knockback.
	 * 
	 * @param id
	 *            Unique identifier for the item in the registry
	 * @param enchantMaterial
	 *            Key ingredient the enchantment uses.
	 */
	public Counterweight(Item.ToolMaterial enchantMaterial) {
		super("counterweight" + enchantMaterial.toString().toLowerCase());
		this.enchantMaterial = enchantMaterial;
		setEnchantment(Enchantment.knockback, getMaterialEnchantmentLevel());
	}

	public int getMaterialEnchantmentLevel() {
		return this.enchantMaterial.getHarvestLevel();
	}

}
