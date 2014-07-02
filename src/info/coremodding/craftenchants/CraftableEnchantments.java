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
package info.coremodding.craftenchants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import info.coremodding.craftenchants.event.initialize.Initializer;
import info.coremodding.craftenchants.event.initialize.PreInitializer;
import info.coremodding.craftenchants.proxy.Proxy;

/**
 * The main mod class
 */
@Mod(modid = CraftableEnchantments.ID, name = CraftableEnchantments.NAME)
public class CraftableEnchantments {
  public static final String ID = "craftenchants";
  public static final String NAME = "Craftable Enchantments";

    /**
     * The instance of the class forge uses
     */
    @Instance(ID)
    public static CraftableEnchantments instance;

    /**
     * Forge's instance of the mod proxy
     */
    @SidedProxy(clientSide = Proxy.CLIENT, serverSide = Proxy.SERVER)
    public static Proxy proxy;

    /**
     * @param preEvent The event that triggered the method
     */
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent preEvent) {
        PreInitializer.handle(preEvent);
    }
    
    @EventHandler
    public void onInitialization(FMLInitializationEvent event) {
        Initializer.handle(event);
    }
}
