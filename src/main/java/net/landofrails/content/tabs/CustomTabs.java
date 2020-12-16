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
import net.minecraft.item.ItemBlock;
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

	private ItemSorter sorter;

	public CustomDecorativeBlocksTab() {
		super("decorativeblockstab");
		sorter = new ItemSorter();
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
		super.displayAllReleventItems(list);
		Collections.sort(list, sorter);
	}

	// Sorts items in alphabetical order using their display names
	private static class ItemSorter implements Comparator<ItemStack> {

		@Override
		public int compare(ItemStack o1, ItemStack o2) {
			Item item1 = o1.getItem();
			Item item2 = o2.getItem();

			// If item1 is a block and item2 isn't, sort item1 before item2
			if ((item1 instanceof ItemBlock) && (!(item2 instanceof ItemBlock))) {
				return -1;
			}

			// If item2 is a block and item1 isn't, sort item1 after item2
			if ((item2 instanceof ItemBlock) && (!(item1 instanceof ItemBlock))) {
				return 1;
			}

			String displayName1 = o1.getDisplayName();
			String displayName2 = o2.getDisplayName();

			if (displayName1.equals(displayName2)) {
				String unlName1 = o1.getUnlocalizedName();
				String unlName2 = o2.getUnlocalizedName();
				return unlName1.compareToIgnoreCase(unlName2);
			}

			return displayName1.compareToIgnoreCase(displayName2);
		}
	}

}
