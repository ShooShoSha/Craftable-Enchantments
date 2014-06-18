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

import info.coremodding.craftenchants.item.ItemsCE;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EnchantsItem {
	public static final Object[] armorKit = new Object[] { "LLL", "LWL", "LLL",
			'L', new ItemStack(Items.leather, 1), 'W', Blocks.wool };

	public static final Object[] blastResistPad = new Object[] { "III", "ISI",
			"III", 'I', new ItemStack(Items.iron_ingot), 'S', Blocks.stone };

	public static final Object[] ironStuds = new Object[] { "   ", "I I",
			"L L", 'I', new ItemStack(Items.iron_ingot), 'L',
			new ItemStack(Items.leather) };

	public static final Object[] ironCounterweight = new Object[] { "WWW",
			"WIW", "WWW", 'W', Blocks.wool, 'I', Blocks.iron_block };
	
	public static final Object[] reinforcedNock = new Object[] { "H  ", " H ",
			"  H", 'H', ItemsCE.horseHair };

	public static final Object[] sharpeningStone = new Object[] { "FFF", "FSF",
			"FFF", 'F', new ItemStack(Items.flint), 'S',
			new ItemStack(Blocks.stone) };

	public static final Object[] snorkle = new Object[] { "GGS", "GGG", "III",
			'G', Blocks.glass, 'S', new ItemStack(Items.reeds), 'I',
			new ItemStack(Items.iron_ingot) };

	public static final Object[] stoneCounterweight = new Object[] { "WWW",
			"WSW", "WWW", 'W', Blocks.wool, 'S', Blocks.stone };

	public static final Object[] woolPadding = new Object[] { "   ", "WRW",
			"WRW", 'W', Blocks.wool, 'R', new ItemStack(Items.string) };

	public static void addRecipes() {
		addItemRecipes();
	}

	private static void addItemRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.armorKit), armorKit);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.blastResistPad),
				blastResistPad);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironCounterweight),
				ironCounterweight);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironStuds),
				ironStuds);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.reinforcedNock),
				reinforcedNock);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.sharpeningStone),
				sharpeningStone);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.snorkle), snorkle);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.stoneCounterweight),
				stoneCounterweight);
		GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.woolPadding),
				woolPadding);
	}
}
