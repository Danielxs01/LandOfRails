package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ColouredGravel extends Block implements IDecorativeBlock {

	public ColouredGravel() {
		super(Material.sand);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: msvr");
	}

}
