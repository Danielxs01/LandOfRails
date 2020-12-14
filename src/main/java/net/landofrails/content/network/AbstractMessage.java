package net.landofrails.content.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;

public interface AbstractMessage {
	// the base class:
	public interface AbstractMessageHandler<T extends IMessage> extends IMessageHandler<T, IMessage> {

	}

	// class for messages sent to and handled on the client:
	public interface AbstractClientMessageHandler<T extends IMessage> extends AbstractMessageHandler<T> {

	}

	// class for messages sent to and handled on the server:
	public interface AbstractServerMessageHandler<T extends IMessage> extends AbstractMessageHandler<T> {

	}

}
