package net.landofrails.content.blocks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.landofrails.Constants;
import net.landofrails.content.blocks.asphalt.BlockAsphaltCC;
import net.landofrails.content.blocks.asphalt.BlockAsphaltToRC;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltWhiteArrow;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltWhiteArrowSide;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltWhiteDoubleArrow;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltYellowArrow;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltYellowArrowSide;
import net.landofrails.content.blocks.asphalt.slabs.arrow.SlabAsphaltYellowDoubleArrow;
import net.landofrails.content.blocks.asphalt.slabs.corner.SlabAsphaltCornerWhite;
import net.landofrails.content.blocks.asphalt.slabs.corner.SlabAsphaltCornerYellow;
import net.landofrails.content.blocks.asphalt.slabs.cross.SlabAsphaltSLYSideCrossWhite;
import net.landofrails.content.blocks.asphalt.slabs.cross.SlabAsphaltSLYSideCrossYellow;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltInnerDiagonalWhite;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltInnerDiagonalYellow;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltLineWhite;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltLineYellow;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltOuterDiagonalWhite;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltOuterDiagonalYellow;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltThickDiagonalWhite;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltThickDiagonalYellow;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltThickLineWhite;
import net.landofrails.content.blocks.asphalt.slabs.lines.SlabAsphaltThickLineYellow;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltCC;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLXDoubleCrossWhite;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLXDoubleCrossYellow;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLXSideCrossWhite;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLXSideCrossYellow;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLYCrossWhite;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLYCrossYellow;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLYFullCrossWhite;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltSLYFullCrossYellow;
import net.landofrails.content.blocks.asphalt.slabs.others.SlabAsphaltToRC;
import net.landofrails.content.blocks.asphalt.slabs.text.SlabAsphaltEX;
import net.landofrails.content.blocks.asphalt.slabs.text.SlabAsphaltIT;
import net.landofrails.content.blocks.asphalt.slabs.text.SlabAsphaltOP;
import net.landofrails.content.blocks.asphalt.slabs.text.SlabAsphaltST;
import net.landofrails.content.blocks.decorative.ADecorativeBlock;
import net.landofrails.content.blocks.decorative.ADecorativeItemBlock;
import net.landofrails.content.blocks.decorative.Bark1;
import net.landofrails.content.blocks.decorative.Bricks1;
import net.landofrails.content.blocks.decorative.Cardboard1;
import net.landofrails.content.blocks.decorative.ColouredGravel;
import net.landofrails.content.blocks.decorative.Concrete1;
import net.landofrails.content.blocks.decorative.Concrete2;
import net.landofrails.content.blocks.decorative.Concrete3;
import net.landofrails.content.blocks.decorative.Concrete4;
import net.landofrails.content.blocks.decorative.Crystals1;
import net.landofrails.content.blocks.decorative.Fabric1;
import net.landofrails.content.blocks.decorative.Fabric2;
import net.landofrails.content.blocks.decorative.Gravel1;
import net.landofrails.content.blocks.decorative.IDecorativeBlock;
import net.landofrails.content.blocks.decorative.Painting1;
import net.landofrails.content.blocks.decorative.Painting2;
import net.landofrails.content.blocks.decorative.Planks1;
import net.landofrails.content.blocks.decorative.Planks2;
import net.landofrails.content.blocks.decorative.Planks3;
import net.landofrails.content.blocks.decorative.Planks4;
import net.landofrails.content.blocks.decorative.Rain1;
import net.landofrails.content.blocks.decorative.Sand1;
import net.landofrails.content.blocks.decorative.Sandstone1;
import net.landofrails.content.blocks.decorative.Stone1;
import net.landofrails.content.blocks.decorative.Wall1;
import net.landofrails.content.blocks.decorative.Wall2;
import net.landofrails.content.tabs.CustomTabs;
import net.minecraft.block.Block;

public class CustomBlocks {

	public static BlockAsphaltToRC asphaltToRC = new BlockAsphaltToRC();
	public static BlockAsphaltCC asphaltCC = new BlockAsphaltCC();

	private CustomBlocks() {

	}

	private static Map<String, Block> blocks = new HashMap<>();

	public static void init() {
		// Add blocks here:

		blocks.put("asphaltToRC", asphaltToRC);
		blocks.put("asphaltSlabToRC", new SlabAsphaltToRC());

		blocks.put("asphaltCC", asphaltCC);
		blocks.put("asphaltSlabCC", new SlabAsphaltCC());

		blocks.put("asphaltYellowArrow", new SlabAsphaltYellowArrow());
		blocks.put("asphaltYellowArrowSide", new SlabAsphaltYellowArrowSide());
		blocks.put("asphaltYellowDoubleArrow", new SlabAsphaltYellowDoubleArrow());
		blocks.put("asphaltWhiteArrow", new SlabAsphaltWhiteArrow());
		blocks.put("asphaltWhiteArrowSide", new SlabAsphaltWhiteArrowSide());
		blocks.put("asphaltWhiteDoubleArrow", new SlabAsphaltWhiteDoubleArrow());

		blocks.put("asphaltEX", new SlabAsphaltEX());
		blocks.put("asphaltIT", new SlabAsphaltIT());
		blocks.put("asphaltST", new SlabAsphaltST());
		blocks.put("asphaltOP", new SlabAsphaltOP());

		blocks.put("asphaltLineYellow", new SlabAsphaltLineYellow());
		blocks.put("asphaltLineWhite", new SlabAsphaltLineWhite());
		blocks.put("asphaltInnerDiagonalYellow", new SlabAsphaltInnerDiagonalYellow());
		blocks.put("asphaltInnerDiagonalWhite", new SlabAsphaltInnerDiagonalWhite());
		blocks.put("asphaltOuterDiagonalYellow", new SlabAsphaltOuterDiagonalYellow());
		blocks.put("asphaltOuterDiagonalWhite", new SlabAsphaltOuterDiagonalWhite());
		blocks.put("asphaltThickDiagonalYellow", new SlabAsphaltThickDiagonalYellow());
		blocks.put("asphaltThickDiagonalWhite", new SlabAsphaltThickDiagonalWhite());
		blocks.put("asphaltThickLineYellow", new SlabAsphaltThickLineYellow());
		blocks.put("asphaltThickLineWhite", new SlabAsphaltThickLineWhite());

		blocks.put("asphaltCornerYellow", new SlabAsphaltCornerYellow());
		blocks.put("asphaltCornerWhite", new SlabAsphaltCornerWhite());

		blocks.put("asphaltSLXDoubleCrossYellow", new SlabAsphaltSLXDoubleCrossYellow());
		blocks.put("asphaltSLXDoubleCrossWhite", new SlabAsphaltSLXDoubleCrossWhite());
		blocks.put("asphaltSLXSideCrossYellow", new SlabAsphaltSLXSideCrossYellow());
		blocks.put("asphaltSLXSideCrossWhite", new SlabAsphaltSLXSideCrossWhite());
		blocks.put("asphaltSLYCrossYellow", new SlabAsphaltSLYCrossYellow());
		blocks.put("asphaltSLYCrossWhite", new SlabAsphaltSLYCrossWhite());
		blocks.put("asphaltSLYFullCrossYellow", new SlabAsphaltSLYFullCrossYellow());
		blocks.put("asphaltSLYFullCrossWhite", new SlabAsphaltSLYFullCrossWhite());
		blocks.put("asphaltSLYSideCrossYellow", new SlabAsphaltSLYSideCrossYellow());
		blocks.put("asphaltSLYSideCrossWhite", new SlabAsphaltSLYSideCrossWhite());

		blocks.put("colouredGravel", new ColouredGravel());
		blocks.put("gravel1", new Gravel1());
		blocks.put("wall1", new Wall1());
		blocks.put("wall2", new Wall2());
		blocks.put("stone1", new Stone1());
		blocks.put("bricks1", new Bricks1());
		blocks.put("sand1", new Sand1());
		blocks.put("bark1", new Bark1());
		blocks.put("planks1", new Planks1());
		blocks.put("planks2", new Planks2());
		blocks.put("planks3", new Planks3());
		blocks.put("planks4", new Planks4());
		blocks.put("painting1", new Painting1());
		blocks.put("painting2", new Painting2());
		blocks.put("rain1", new Rain1());
		blocks.put("fabric1", new Fabric1());
		blocks.put("fabric2", new Fabric2());
		blocks.put("crystals1", new Crystals1());
		blocks.put("cardboard1", new Cardboard1());
		blocks.put("concrete1", new Concrete1());
		blocks.put("concrete2", new Concrete2());
		blocks.put("concrete3", new Concrete3());
		blocks.put("concrete4", new Concrete4());
		blocks.put("sandstone1", new Sandstone1());

		Map<String, Block> additionalBlocks = new HashMap<>();
		for (Entry<String, Block> entry : blocks.entrySet()) {
			if (entry.getValue() instanceof ADecorativeBlock) {
				ADecorativeBlock db = (ADecorativeBlock) entry.getValue();
				additionalBlocks.putAll(db.getAdditionalBlocks(entry.getKey(), db));
			}
		}
		blocks.putAll(additionalBlocks);

		for (Entry<String, Block> entry : blocks.entrySet())
			setName(entry.getValue(), entry.getKey());
	}

	public static void register() {
		for (Entry<String, Block> block : blocks.entrySet()) {
			if (block.getValue() instanceof IDecorativeBlock) {
				GameRegistry.registerBlock(block.getValue(), ADecorativeItemBlock.class, block.getKey());
			} else {
				GameRegistry.registerBlock(block.getValue(), block.getKey());
			}
		}
	}

	public static void setName(Block block, String name) {
		block.setBlockName(name);
		if (block instanceof ADecorativeBlock) {
			block.setBlockTextureName(Constants.MODID + ":decorative/" + name);
		} else {
			block.setBlockTextureName(Constants.MODID + ":" + name);
		}
		if (block.getCreativeTabToDisplayOn() == null)
			block.setCreativeTab(
					block instanceof ADecorativeBlock ? CustomTabs.decorativeBlocksTab : CustomTabs.blockTab);
	}

	public static Map<String, Block> getBlocks() {
		return blocks;
	}

}
