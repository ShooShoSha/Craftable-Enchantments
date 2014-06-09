/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
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
