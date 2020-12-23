package net.landofrails.content.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.landofrails.content.items.masks.ItemMask;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CustomRecipes {

	private CustomRecipes() {

	}

	public static void register() {
		// @formatter:off
		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 0), "XYX", "   ", "   ", 'X', Items.string, 'Y', Blocks.wool);
		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 1), "   ", "XYX", "   ", 'X', Items.string, 'Y', Blocks.wool);
		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 2), "   ", "   ", "XYX", 'X', Items.string, 'Y', Blocks.wool);

		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 3), "XYX", "   ", "   ", 'X', Items.string, 'Y', Blocks.glass_pane);
		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 3), "   ", "XYX", "   ", 'X', Items.string, 'Y', Blocks.glass_pane);
		GameRegistry.addRecipe(new ItemStack(ItemMask.instance, 1, 3), "   ", "   ", "XYX", 'X', Items.string, 'Y', Blocks.glass_pane);
		// @formatter:on
	}

}
