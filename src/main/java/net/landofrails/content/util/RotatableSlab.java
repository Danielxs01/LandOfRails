package net.landofrails.content.util;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class RotatableSlab extends BlockSlab {

	protected RotatableSlab(boolean b, Material m) {
		super(b, m);
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

		world.setBlockMetadataWithNotify(x, y, z, facing, 2);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
		return new ItemStack(this);
	}

	@Override
	public String func_150002_b(int arg0) {
		return null;
	}

}
