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

import info.coremodding.craftenchants.item.components.HorseHair;
import info.coremodding.craftenchants.item.enchants.ArmorKit;
import info.coremodding.craftenchants.item.enchants.BlastResistPad;
import info.coremodding.craftenchants.item.enchants.Counterweight;
import info.coremodding.craftenchants.item.enchants.FireOil;
import info.coremodding.craftenchants.item.enchants.FlameResistantCream;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;
import info.coremodding.craftenchants.item.enchants.Snorkle;
import info.coremodding.craftenchants.item.enchants.Studs;
import info.coremodding.craftenchants.item.enchants.WoolPadding;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsCE {
	// Collection of all items
	public static Set<ItemCE> items = new HashSet<ItemCE>();

	/**
	 * Instances of all items
	 */
	public static ItemCE armorKit;
	public static ItemCE blastResistPad;
	public static ItemCE fireOil;
	public static ItemCE flameResistantCream;
	public static ItemCE ironCounterweight;
	public static ItemCE ironStuds;
	public static ItemCE reinforcedNock;
	public static ItemCE sharpeningStone;
	public static ItemCE snorkle;
	public static ItemCE stoneCounterweight;
	public static ItemCE woolPadding;
	public static ItemCE horseHair;

	public static void initialize() {
		createItems();
		registerItems();
	}

	private static void createItems() {
		items.add(armorKit = new ArmorKit());
		items.add(blastResistPad = new BlastResistPad());
		items.add(fireOil = new FireOil());
		items.add(flameResistantCream = new FlameResistantCream());
		items.add(ironCounterweight = new Counterweight(Item.ToolMaterial.IRON));
		items.add(ironStuds = new Studs(Item.ToolMaterial.IRON));
		items.add(reinforcedNock = new ReinforcedNock());
		items.add(sharpeningStone = new SharpeningStone());
		items.add(snorkle = new Snorkle());
		items.add(stoneCounterweight = new Counterweight(
				Item.ToolMaterial.STONE));
		items.add(woolPadding = new WoolPadding());
		items.add(horseHair = new HorseHair());
	}

	private static void registerItems() {
		for (ItemCE item : items) {
			GameRegistry.registerItem(item, item.getUnlocalizedName());
		}
	}
}
