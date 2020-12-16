package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Planks2 extends ADecorativeBlock {

	public Planks2() {
		super(Material.wood);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 2");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: FWStudio");
	}

}
