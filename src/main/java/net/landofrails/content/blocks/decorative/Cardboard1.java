package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Cardboard1 extends ADecorativeBlock {

	public Cardboard1() {
		super(Material.wood);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: icon0.com");
	}

}
