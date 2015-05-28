/*
 * This project is 100% open source. Use anything within its code in 
 * anyway you like. I only ask that you give credit where it is due.
 *
 * Thanks.
 */
package com.naddox.advancedmod;

import com.naddox.advancedmod.proxy.CommonProxy;
import com.naddox.advancedmod.reference.Reference;
import com.naddox.advancedmod.utility.Log;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/*
 *@author Naddox <calebdk09@gmail.com>
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static AdvancedMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        Log.info("Pre Initialization Completed!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        Log.info("Initialization Completed!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
        Log.info("Post Initialization Completed!");
    }
}
