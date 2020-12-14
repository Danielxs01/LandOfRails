package net.landofrails.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.landofrails.LandOfRails;
import net.landofrails.content.blocks.CustomBlocks;
import net.landofrails.content.items.CustomItems;
import net.landofrails.content.network.PacketDispatcher;
import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		LandOfRails.logger.info("preInit");

		CustomItems.init();
		CustomItems.register();
		CustomBlocks.init();
		CustomBlocks.register();

		PacketDispatcher.registerPackets();
	}

	public void init(FMLInitializationEvent event) {
		LandOfRails.logger.info("init");
	}

	public void postInit(FMLPostInitializationEvent event) {
		LandOfRails.logger.info("postInit");
	}

	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity;
	}

}
