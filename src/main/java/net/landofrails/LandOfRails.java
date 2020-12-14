package net.landofrails;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.landofrails.proxy.CommonProxy;

@Mod(modid = Constants.MODID, name = Constants.NAME, version = Constants.VERSION, canBeDeactivated = false, useMetadata = true)
public class LandOfRails {

	public static Logger logger;

	@Instance
	public static LandOfRails instance;

	@SidedProxy(serverSide = Constants.SERVERPROXY, clientSide = Constants.CLIENTPROXY)
	public static CommonProxy commonProxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		logger.info("Starting (preInit)");
		commonProxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Starting (init)");
		commonProxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Starting (postInit)");
		commonProxy.postInit(event);
	}
}
