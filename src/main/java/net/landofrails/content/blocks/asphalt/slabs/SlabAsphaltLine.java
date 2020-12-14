package net.landofrails.content.blocks.asphalt.slabs;

import com.ibm.icu.text.MessageFormat;

import net.landofrails.Constants;
import net.landofrails.content.util.RotatableSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

@SuppressWarnings("java:S1075")
public abstract class SlabAsphaltLine extends RotatableSlab {

	public String path;
	public String displaytexture;
	public String sidetexture;

	private IIcon[] displayIcon = new IIcon[8];
	private IIcon sideIcon;

	public SlabAsphaltLine() {
		super(false, Material.ground);
		String type = this.getType();
		String colour = this.getColour();
		String name = this.getName();

		path = Constants.MODID + ":asphaltLines/" + type + "/";
		displaytexture = path + name + colour + "_{0}";
		sidetexture = path + "asphalt";
	}

	@Override
	public void registerBlockIcons(IIconRegister register) {
		for (int i = 0; i < 4; i++) {
			String p = MessageFormat.format(displaytexture, "" + (i * 90));
			displayIcon[i] = register.registerIcon(p);
			displayIcon[i + 4] = register.registerIcon(p);
		}
		sideIcon = register.registerIcon(sidetexture);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 1 && meta < 8)
			return displayIcon[meta];
		return sideIcon;
	}

	public abstract String getType();

	public abstract String getName();

	public abstract String getColour();

}
