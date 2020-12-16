package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Crystals1 extends ADecorativeBlock {

	public Crystals1() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Jonny Lew");
	}

}