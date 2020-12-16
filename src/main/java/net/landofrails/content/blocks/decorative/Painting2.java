package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Painting2 extends ADecorativeBlock {

	public Painting2() {
		super(Material.cloth);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 2");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Steve Johnson");
	}

}
