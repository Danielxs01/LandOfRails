package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Wall2 extends ADecorativeBlock {

	public Wall2() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 2");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Stas Knop");
	}

}
