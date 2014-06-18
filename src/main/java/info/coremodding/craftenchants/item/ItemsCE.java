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

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.EnumToolMaterial;
import cpw.mods.fml.common.registry.GameRegistry;

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
import info.coremodding.craftenchants.library.ModIDs;

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
    items.add(armorKit = new ArmorKit(ModIDs.Items.Default.armorKit));
    items.add(blastResistPad = new BlastResistPad(ModIDs.Items.Default.blastResistPad));
    items.add(fireOil = new FireOil(ModIDs.Items.Default.fireOil));
    items.add(flameResistantCream =
        new FlameResistantCream(ModIDs.Items.Default.flameResistantCream));
    items.add(ironCounterweight =
        new Counterweight(ModIDs.Items.Default.ironCounterweight, EnumToolMaterial.IRON));
    items.add(ironStuds = new Studs(ModIDs.Items.Default.ironStuds, EnumToolMaterial.IRON));
    items.add(reinforcedNock = new ReinforcedNock(ModIDs.Items.Default.reinforcedNock));
    items.add(sharpeningStone = new SharpeningStone(ModIDs.Items.Default.sharpeningStone));
    items.add(snorkle = new Snorkle(ModIDs.Items.Default.snorkle));
    items.add(stoneCounterweight =
        new Counterweight(ModIDs.Items.Default.stoneCounterweight, EnumToolMaterial.STONE));
    items.add(woolPadding = new WoolPadding(ModIDs.Items.Default.woolPadding));
    items.add(horseHair = new HorseHair(ModIDs.Items.Default.horseHair));
  }

  private static void registerItems() {
    for (ItemCE item : items) {
      GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
  }
}
