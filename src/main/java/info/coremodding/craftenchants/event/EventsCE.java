/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import net.minecraftforge.common.MinecraftForge;

public class EventsCE {
  private static LivingDrops livinigDropsEvent = new LivingDrops();
  private static EntityInteract entityInteractEvent = new EntityInteract();

  public static void initialize() {
    registerFMLEvents();
    registerForgeEvents();
  }

  private static void registerFMLEvents() {

  }

  private static void registerForgeEvents() {
    MinecraftForge.EVENT_BUS.register(livinigDropsEvent);
    MinecraftForge.EVENT_BUS.register(entityInteractEvent);
  }
}
