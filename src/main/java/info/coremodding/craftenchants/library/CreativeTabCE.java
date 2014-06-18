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
package info.coremodding.craftenchants.library;

import info.coremodding.craftenchants.CraftableEnchantments;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * The singleton mod creative tab.
 */
public class CreativeTabCE extends CreativeTabs {
	private static final CreativeTabCE instance = new CreativeTabCE();

	/**
	 * The class constructor
	 */
	private CreativeTabCE() {
		super(CreativeTabs.getNextID(), CraftableEnchantments.ID);
	}

	public static CreativeTabCE getInstance() {
		return instance;
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.anvil);
	}
}
