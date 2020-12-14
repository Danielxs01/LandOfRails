package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Gravel1 extends Block implements IDecorativeBlock {

	public Gravel1() {
		super(Material.sand);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Gravel 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Pixabay");
	}

}
