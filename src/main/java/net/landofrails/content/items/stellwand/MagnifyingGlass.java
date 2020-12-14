package net.landofrails.content.items.stellwand;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MagnifyingGlass extends Item implements IStellwandItem {

	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack is, EntityPlayer p, @SuppressWarnings("rawtypes") List l, boolean b) {
		l.add("Work in Progress :)");
	}

}
