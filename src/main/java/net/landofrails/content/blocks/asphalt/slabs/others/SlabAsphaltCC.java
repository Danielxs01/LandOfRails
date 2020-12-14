package net.landofrails.content.blocks.asphalt.slabs.others;

import net.landofrails.content.blocks.CustomBlocks;
import net.landofrails.content.util.RotatableSlab;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class SlabAsphaltCC extends RotatableSlab {

	public SlabAsphaltCC() {
		super(false, Material.ground);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return CustomBlocks.asphaltCC.getIcon(side, meta);
	}

}
