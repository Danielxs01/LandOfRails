package net.landofrails.content.items.masks;

import java.util.List;

import net.landofrails.Constants;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.ISpecialArmor;

public class ItemMask extends ItemArmor implements ISpecialArmor {

	public static ItemMask instance;
	private IIcon[] icons = new IIcon[4];

	public ItemMask() {
		super(ArmorMaterial.CLOTH, 0, 0);
		setMaxDamage(0);
		setHasSubtypes(true);
		instance = this;
	}

	@Override
	public void registerIcons(IIconRegister register) {
		for (int i = 1; i <= 4; i++)
			icons[i - 1] = register.registerIcon(Constants.MODID + ":masks/itemMask" + i);
	}

	@Override
	public IIcon getIcon(ItemStack stack, int pass) {
		return icons[stack.getItemDamage()];
	}

	@Override
	public IIcon getIconFromDamage(int damage) {
		return icons[damage];
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage,
			int slot) {
		return new ArmorProperties(slot, damage, slot);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

		if (stack.getItem() instanceof ItemMask) {
			int meta = stack.getItemDamage();
			if (meta < 4) {
				return Constants.MODID + ":textures/items/masks/armorMask" + (meta + 1) + ".png";
			}
		}

		return super.getArmorTexture(stack, entity, slot, type);
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {

		return 0;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 4; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		/*
		 * Items bekommen keinen Schaden.
		 */
	}

}
