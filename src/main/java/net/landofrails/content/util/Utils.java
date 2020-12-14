package net.landofrails.content.util;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

import javax.imageio.ImageIO;

import net.minecraft.util.MathHelper;

public class Utils {

	public static BufferedImage rotate(BufferedImage image, double angle, GraphicsConfiguration gc) {

		angle = Math.PI * (angle / 360) * 2;

		double sin = Math.abs(Math.sin(angle));
		double cos = Math.abs(Math.cos(angle));
		int w = image.getWidth();
		int h = image.getHeight();
		int neww = (int) Math.floor(w * cos + h * sin);
		int newh = (int) Math.floor(h * cos + w * sin);
		int transparency = image.getColorModel().getTransparency();
		BufferedImage result = gc.createCompatibleImage(neww, newh, transparency);
		Graphics2D g = result.createGraphics();
		g.translate((neww - w) / 2, (newh - h) / 2);
		g.rotate(angle, w / 2d, h / 2d);
		g.drawRenderedImage(image, null);
		return result;

	}

	@SuppressWarnings("java:S1075")
	public static void main(String[] args) {

		final String basePath = "D:\\eclipseworkspace\\LandOfRails\\src\\main\\resources\\assets\\landofrails\\textures\\blocks\\asphaltLines"
				+ "\\";

		final String targetName = basePath + "asphaltST_{0}.png";
		String path = basePath + "asphaltST.png";
		// path = ""

		if (path.equalsIgnoreCase("")) {

			File[] files = new File(basePath).listFiles();
			for (File f : files) {
				String name = basePath + f.getName().split("\\.")[0];
				name += "_{0}.png";
				rotate(f, name);
			}

		} else {
			rotate(new File(path), targetName);
		}

	}

	private static void rotate(File file, String targetName) {

		if (file.isDirectory())
			return;

		try {
			BufferedImage image = ImageIO.read(file);

			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gd.getDefaultConfiguration();

			for (int i = 0; i < 4; i++) {

				int degree = 90 * i;
				BufferedImage rotatedImage = rotate(image, degree, gc);
				ImageIO.write(rotatedImage, "PNG", new File(MessageFormat.format(targetName, degree)));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getDirectionTowards(float rotationYaw) {

		return MathHelper.floor_double((double) ((rotationYaw * 4F) / 360F) + 0.5D) & 3;
	}

	public static int getDirectionFacing(float rotationYaw) {
		int direction = getDirectionTowards(rotationYaw);
		direction = direction >= 2 ? direction - 2 : direction + 2;

		return direction;
	}

	public static int getDiagonalFacing(float rotationYaw) {

		int direction = MathHelper.floor_double((double) (rotationYaw * 4F) / 360F) & 3;
		direction = direction >= 2 ? direction - 2 : direction + 2;
		return direction;

	}

}
