package net.landofrails.content.blocks.decorative;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ADecorativeItemBlock extends ItemBlock {

	public ADecorativeItemBlock(Block block) {
		super(block);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {

		if (field_150939_a instanceof IDecorativeBlock) {
			IDecorativeBlock block = (IDecorativeBlock) field_150939_a;
			List<String> desc = new ArrayList<>();
			block.getDescription(desc);
			list.addAll(desc);
		}

	}

}
