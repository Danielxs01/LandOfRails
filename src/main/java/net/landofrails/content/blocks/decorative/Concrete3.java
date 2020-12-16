package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Concrete3 extends ADecorativeBlock {

	public Concrete3() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 4");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: MILO TEXTURES");
	}

}