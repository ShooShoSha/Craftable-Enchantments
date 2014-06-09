/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.item.ItemsCE;

public class EnchantsItem {
  public static final Object[] armorKit = new Object[] {"LLL", "LWL", "LLL", 'L',
      new ItemStack(Item.leather, 1), 'W', Block.cloth};

  public static final Object[] blastResistPad = new Object[] {"III", "ISI", "III", 'I',
      new ItemStack(Item.ingotIron), 'S', Block.stone};

  public static final Object[] ironStuds = new Object[] {"   ", "I I", "L L", 'I',
      new ItemStack(Item.ingotIron), 'L', new ItemStack(Item.leather)};

  public static final Object[] ironCounterweight = new Object[] {"WWW", "WIW", "WWW", 'W',
      Block.cloth, 'I', Block.blockIron};
  public static final Object[] reinforcedNock = new Object[] {"H  ", " H ", "  H", 'H',
      ItemsCE.horseHair};

  public static final Object[] sharpeningStone = new Object[] {"FFF", "FSF", "FFF", 'F',
      new ItemStack(Item.flint), 'S', new ItemStack(Block.stone)};

  public static final Object[] snorkle = new Object[] {"GGS", "GGG", "III", 'G', Block.glass, 'S',
      new ItemStack(Item.reed), 'I', new ItemStack(Item.ingotIron)};

  public static final Object[] stoneCounterweight = new Object[] {"WWW", "WSW", "WWW", 'W',
      Block.cloth, 'S', Block.stone};

  public static final Object[] woolPadding = new Object[] {"   ", "WRW", "WRW", 'W', Block.cloth,
      'R', new ItemStack(Item.silk)};

  public static void addRecipes() {
    addItemRecipes();
  }

  private static void addItemRecipes() {
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.armorKit), armorKit);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.blastResistPad), blastResistPad);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironCounterweight), ironCounterweight);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironStuds), ironStuds);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.reinforcedNock), reinforcedNock);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.sharpeningStone), sharpeningStone);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.snorkle), snorkle);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.stoneCounterweight), stoneCounterweight);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.woolPadding), woolPadding);
  }
}
