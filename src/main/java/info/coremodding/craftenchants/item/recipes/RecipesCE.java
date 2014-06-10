/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.crafting.IRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesCE {
  public static Set<IRecipe> recipes = new HashSet<IRecipe>();

  public static IRecipe recipeEnchantsArmor;
  public static IRecipe recipeEnchantsBow;
  public static IRecipe recipeEnchantsSword;

  public static void initialize() {
    createRecipes();
    addRecipes();
  }

  private static void createRecipes() {
    recipes.add(recipeEnchantsArmor = new EnchantsArmor());
    recipes.add(recipeEnchantsBow = new EnchantsBow());
    recipes.add(recipeEnchantsSword = new EnchantsSword());
  }

  private static void addRecipes() {
    EnchantsItem.addRecipes();

    for (IRecipe recipe : recipes) {
      GameRegistry.addRecipe(recipe);
    }
  }
}
