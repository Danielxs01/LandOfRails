package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Concrete2 extends Block implements IDecorativeBlock {

	public Concrete2() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 2");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: La Miko");
	}

}