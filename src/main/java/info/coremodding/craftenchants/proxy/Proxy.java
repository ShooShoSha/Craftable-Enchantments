/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.proxy;

import net.minecraft.creativetab.CreativeTabs;

import info.coremodding.craftenchants.library.CreativeTabCE;

public interface Proxy {
  /** The client proxy location */
  public static final String CLIENT = "info.coremodding.craftenchants.proxy.Client";
  /** The server proxy location */
  public static final String SERVER = "info.coremodding.craftenchants.proxy.Server";

  public static final CreativeTabs tabMain = CreativeTabCE.getInstance();
}
