package net.landofrails.content.network.client;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.landofrails.content.network.packet.AbstractMessageHandler;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractClientMessageHandler<T extends IMessage> extends AbstractMessageHandler<T> {

	public final IMessage handleServerMessage(EntityPlayer player, T message, MessageContext ctx) {
		return null;
	}

}
