package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Gravel2 extends ADecorativeBlock {

	public Gravel2() {
		super(Material.sand);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Gravel 2");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Pixabay");
	}

}
