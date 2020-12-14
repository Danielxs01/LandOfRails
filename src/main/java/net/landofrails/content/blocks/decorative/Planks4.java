package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Planks4 extends Block implements IDecorativeBlock {

	public Planks4() {
		super(Material.wood);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 4");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: FWStudio");
	}

}
