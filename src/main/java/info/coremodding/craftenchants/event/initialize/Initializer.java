/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event.initialize;

import cpw.mods.fml.common.event.FMLInitializationEvent;

import info.coremodding.craftenchants.item.recipes.RecipesCE;

public class Initializer {
  public static void handle(FMLInitializationEvent event) {
    RecipesCE.initialize();
  }
}
