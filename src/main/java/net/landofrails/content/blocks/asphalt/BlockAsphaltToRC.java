package net.landofrails.content.blocks.asphalt;

import net.landofrails.Constants;
import net.landofrails.LandOfRails;
import net.landofrails.content.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockAsphaltToRC extends Block {

	private IIcon[] tops = new IIcon[8];
	private IIcon side = null;

	public static final String FULLTEXTURENAME = Constants.MODID + ":" + "asphaltToRC/";

	private static final int TOP = 1;

	public BlockAsphaltToRC() {
		super(Material.ground);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		side = reg.registerIcon(FULLTEXTURENAME + "asphalt");

		for (int i = 1; i <= 4; i++) {
			tops[i - 1] = reg.registerIcon(FULLTEXTURENAME + "left/asphalt_" + i);
			tops[i + 3] = reg.registerIcon(FULLTEXTURENAME + "right/asphalt_" + i);
		}

	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == TOP)
			return tops[meta];
		return this.side;
	}

	@Override
	/***
	 * onBlockPlacedBy(...) Checks the direction the player is facing and sets the
	 * metadata according to this
	 */
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack item) {
		int facing = Utils.getDirectionFacing(entity.rotationYaw);
		int diagonal = Utils.getDiagonalFacing(entity.rotationYaw);

		LandOfRails.logger.info("Facing: {}, Diagonal: {}", facing, diagonal);

		if (facing - diagonal == 0)
			facing += 4;

		LandOfRails.logger.info("Facing: {}", facing);

		world.setBlockMetadataWithNotify(x, y, z, facing, 2);
	}

}
