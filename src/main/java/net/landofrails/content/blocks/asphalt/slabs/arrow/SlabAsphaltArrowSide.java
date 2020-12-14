package net.landofrails.content.blocks.asphalt.slabs.arrow;

import com.ibm.icu.text.MessageFormat;

import net.landofrails.Constants;
import net.landofrails.content.util.RotatableSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public abstract class SlabAsphaltArrowSide extends RotatableSlab {

	public static final String PATH = Constants.MODID + ":asphaltArrow/side{0}/";
	public static final String DISPLAYTEXTURE = PATH + "asphaltArrow{1}_{2}";
	public static final String SIDETEXTURE = PATH + "asphalt";

	private IIcon[] displayIcon = new IIcon[8];
	private IIcon sideIcon;

	private String colour;

	public SlabAsphaltArrowSide() {
		super(false, Material.ground);
		this.colour = this.getColour();
	}

	@Override
	public void registerBlockIcons(IIconRegister register) {
		for (int i = 0; i < 4; i++) {
			String p = MessageFormat.format(DISPLAYTEXTURE, this.colour, "Right", "" + (i * 90));
			displayIcon[i] = register.registerIcon(p);
		}
		for (int i = 0; i < 4; i++) {
			String p = MessageFormat.format(DISPLAYTEXTURE, this.colour, "Left", "" + (i * 90));
			displayIcon[i + 4] = register.registerIcon(p);
		}
		String p = MessageFormat.format(SIDETEXTURE, this.colour);
		sideIcon = register.registerIcon(p);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 1 && meta < 8)
			return displayIcon[meta];
		return sideIcon;
	}

	public abstract String getColour();

}
