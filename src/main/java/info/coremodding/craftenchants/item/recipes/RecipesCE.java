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
