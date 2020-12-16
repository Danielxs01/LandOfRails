package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Concrete1 extends ADecorativeBlock {

	public Concrete1() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Scott Webb");
	}

}