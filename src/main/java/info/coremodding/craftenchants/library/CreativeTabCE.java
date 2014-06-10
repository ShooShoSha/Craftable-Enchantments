/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
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
