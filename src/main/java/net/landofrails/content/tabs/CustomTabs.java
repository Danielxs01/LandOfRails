package net.landofrails.content.tabs;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import net.landofrails.content.items.CustomItems;
import net.landofrails.content.items.SmallLogo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomTabs {

	public static final CreativeTabs blockTab = new CustomBlockTab();
	public static final CreativeTabs itemTab = new CustomItemTab();
	public static final CreativeTabs decorativeBlocksTab = new CustomDecorativeBlocksTab();

	private CustomTabs() {

	}

}

class CustomBlockTab extends CreativeTabs {

	public CustomBlockTab() {
		super("blocktab");
	}

	@Override
	public Item getTabIconItem() {
		Item item = Items.redstone;
		Optional<Item> optional = CustomItems.getItems().values().stream().filter(i -> i instanceof SmallLogo)
				.findFirst();
		return optional.isPresent() ? optional.get() : item;
	}

}

class CustomItemTab extends CreativeTabs {

	public CustomItemTab() {
		super("itemtab");
	}

	@Override
	public Item getTabIconItem() {
		Item item = Items.redstone;
		Optional<Item> optional = CustomItems.getItems().values().stream().filter(i -> i instanceof SmallLogo)
				.findFirst();
		return optional.isPresent() ? optional.get() : item;
	}

}

class CustomDecorativeBlocksTab extends CreativeTabs {

	public CustomDecorativeBlocksTab() {
		super("decorativeblockstab");
	}

	@Override
	public Item getTabIconItem() {
		Item item = Items.redstone;
		Optional<Item> optional = CustomItems.getItems().values().stream().filter(i -> i instanceof SmallLogo)
				.findFirst();
		return optional.isPresent() ? optional.get() : item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void displayAllReleventItems(@SuppressWarnings("rawtypes") List list) {

		Collections.sort(list, new Comparator<ItemStack>() {
			@Override
			public int compare(ItemStack itemStack1, ItemStack itemStack2) {
				return itemStack1.getUnlocalizedName().compareTo(itemStack2.getUnlocalizedName());
			}
		});

		super.displayAllReleventItems(list);
	}

}
