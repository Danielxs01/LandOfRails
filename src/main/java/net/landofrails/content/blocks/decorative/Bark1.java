package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Bark1 extends ADecorativeBlock {

	public Bark1() {
		super(Material.wood);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Little Visuals");
	}

}
