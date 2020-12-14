package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Planks3 extends Block implements IDecorativeBlock {

	public Planks3() {
		super(Material.wood);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 3");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Pixabay");
	}

}
