package net.landofrails.content.blocks.decorative;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.landofrails.Constants;
import net.landofrails.content.tabs.CustomTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public abstract class ADecorativeBlock extends Block implements IDecorativeBlock {

	private Map<String, Block> additionalBlocks = new HashMap<>();

	protected ADecorativeBlock(Material m) {
		super(m);
		this.setLightLevel(0.0f);
	}

	public Map<String, Block> getAdditionalBlocks(String name, ADecorativeBlock ab) {
		if (additionalBlocks.isEmpty()) {
			additionalBlocks.put(name + "slab", new DecorativeSlab(ab));
			additionalBlocks.put(name + "stairs", new DecorativeStairs(ab));
			additionalBlocks.put(name + "wall", new DecorativeWall(ab));
			additionalBlocks.put(name + "fence", new DecorativeFence(ab, name));
			additionalBlocks.put(name + "gate", new DecorativeFenceGate(ab));
			additionalBlocks.put(name + "button", new DecorativeButton(ab));
			additionalBlocks.put(name + "carpet", new DecorativeCarpet(ab));
			additionalBlocks.put(name + "pressurePlate", new DecorativePressurePlate(ab, name));
		}
		return additionalBlocks;
	}

	public class DecorativeSlab extends BlockSlab implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeSlab(ADecorativeBlock b) {
			super(false, b.getMaterial());
			this.b = b;

			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String func_150002_b(int arg0) {
			return null;
		}

		@Override
		public CreativeTabs getCreativeTabToDisplayOn() {
			return b.getCreativeTabToDisplayOn();
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
			return new ItemStack(this);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Slab");
		}

	}

	public static class DecorativeStairs extends BlockStairs implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeStairs(ADecorativeBlock b) {
			super(b, 0);
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Stairs");
		}

	}

	public static class DecorativeWall extends BlockWall implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeWall(ADecorativeBlock b) {
			super(b);
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.1f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public boolean isOpaqueCube() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Wall");
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public void getSubBlocks(Item item, CreativeTabs tab, List list) {
			list.add(new ItemStack(item, 1, 0));
		}

	}

	public static class DecorativeFence extends BlockFence implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeFence(ADecorativeBlock b, String name) {
			super(Constants.MODID + ":decorative/" + name, b.getMaterial());
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Fence");
		}

	}

	public static class DecorativeFenceGate extends BlockFenceGate implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeFenceGate(ADecorativeBlock b) {
			super();
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Gate");
		}

	}

	public static class DecorativeButton extends BlockButton implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativeButton(ADecorativeBlock b) {
			super(true);
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Button");
		}

	}

	public static class DecorativeCarpet extends BlockCarpet implements IDecorativeBlock {
		private ADecorativeBlock b;

		public DecorativeCarpet(ADecorativeBlock b) {
			super();
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("Carpet");
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public void getSubBlocks(Item item, CreativeTabs tab, List list) {
			list.add(new ItemStack(item, 1, 0));
		}

	}

	public static class DecorativePressurePlate extends BlockPressurePlate implements IDecorativeBlock {

		private ADecorativeBlock b;

		public DecorativePressurePlate(ADecorativeBlock b, String name) {
			super(Constants.MODID + ":decorative/" + name, b.getMaterial(), Sensitivity.everything);
			this.b = b;
			setCreativeTab(CustomTabs.decorativeBlocksTab);
			this.setLightOpacity(255);
			this.setLightLevel(0.0f);

		}

		@Override
		public boolean renderAsNormalBlock() {
			return false;
		}

		@Override
		public String getUnlocalizedName() {
			return b.getUnlocalizedName();
		}

		@Override
		public IIcon getIcon(int side, int meta) {
			return b.getIcon(side, meta);
		}

		@Override
		public void getDescription(List<String> desc) {
			b.getDescription(desc);
			desc.add("PressurePlate");
		}

	}

}
