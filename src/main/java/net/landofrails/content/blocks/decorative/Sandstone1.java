package net.landofrails.content.blocks.decorative;

import java.util.List;

import net.minecraft.block.material.Material;

public class Sandstone1 extends ADecorativeBlock {

	public static Sandstone1 instance = new Sandstone1();

	public Sandstone1() {
		super(Material.rock);
	}

	@Override
	public void getDescription(List<String> desc) {
		desc.add("Nr. 1");
		desc.add("Image from SeltixSub");
		desc.add("Generated with GIMP");
	}

}
