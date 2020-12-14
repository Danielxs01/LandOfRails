package net.landofrails.content.blocks.asphalt;

import com.ibm.icu.text.MessageFormat;

import net.landofrails.Constants;
import net.landofrails.content.util.RotatableBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAsphaltCC extends RotatableBlock {

	public static final String PATH = Constants.MODID + ":asphaltCC/";
	public static final String DISPLAYTEXTURE = PATH + "asphaltCC{0}";
	public static final String SIDETEXTURE = PATH + "asphalt";

	private IIcon[] displayIcon = new IIcon[8];
	private IIcon sideIcon;

	public BlockAsphaltCC() {
		super(Material.ground);
	}

	@Override
	public void registerBlockIcons(IIconRegister register) {
		for (int i = 0; i < 8; i += 2) {
			String path = MessageFormat.format(DISPLAYTEXTURE, i < 4 ? "2" : "1");
			displayIcon[i] = register.registerIcon(path);
			String path2 = MessageFormat.format(DISPLAYTEXTURE, i < 4 ? "1" : "2");
			displayIcon[i + 1] = register.registerIcon(path2);
		}
		sideIcon = register.registerIcon(SIDETEXTURE);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 1)
			return displayIcon[meta];
		return sideIcon;
	}

}
