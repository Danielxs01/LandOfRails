package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Sand1 extends ADecorativeBlock {

	public Sand1() {
		super(Material.sand);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from Pexels.com");
		desc.add("Photographer: Aleksandar Pasaric");
	}

}
