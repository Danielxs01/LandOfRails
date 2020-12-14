package net.landofrails.content.util;

import net.landofrails.LandOfRails;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RotatableBlock extends Block {

	protected RotatableBlock(Material m) {
		super(m);
	}

	@Override
	/***
	 * onBlockPlacedBy(...) Checks the direction the player is facing and sets the
	 * metadata according to this
	 */
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack item) {
		int facing = Utils.getDirectionFacing(entity.rotationYaw);
		int diagonal = Utils.getDiagonalFacing(entity.rotationYaw);

		if (facing - diagonal == 0)
			facing += 4;

		LandOfRails.logger.info("Facing: " + facing);

		world.setBlockMetadataWithNotify(x, y, z, facing, 2);
	}

}
