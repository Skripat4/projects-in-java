package BitmapWork;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bitmap {
	BufferedImage bublik; 
	Graphics2D olala; 
	int width; 
	int height; 
	int[] pixels; 
	int[] tableY;
	int x;
	int y;
public Bitmap(int width, int height) {
	x = 0;
	y = 50;
	this.width = width;
	this.height = height;
	pixels = new int[width * height];
	bublik = new BufferedImage(this.width, this.height,
			BufferedImage.TYPE_INT_ARGB);
	olala = bublik.createGraphics();
	pixels = ((DataBufferInt) bublik.getRaster().getDataBuffer()).getData();
	tableY = new int[height];
	for (int i = 0; i < tableY.length; i++) {
		tableY[i] = i * this.width;
	}
}

	public void setPix(int x, int y, int r, int g, int b) {
		pixels[x + tableY[y]] = (255 << 24) | (r << 16) | (g << 8) | (b);
	}


	public void setPix(int x, int y, int color) {
		pixels[x + tableY[y]] = color;
	}


	public int getPix(int x, int y) {
		return pixels[x + tableY[y]];

	}

	public void LoadFile_1(String filename) {
		try {
			BufferedImage image = ImageIO
					.read(Bitmap.class.getResource(filename));
			bublik = image;
			this.width = bublik.getWidth();
			this.height = bublik.getHeight();
			int[] pix = new int[this.width * this.height];
			this.pixels = pix;
			bublik.getRGB(0, 0, this.width, this.height, pixels, 0, width);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void LoadFile(int x, int y, String filename) {
		
		ImageIcon image = new ImageIcon(filename);
		if ((image == null)
				|| (image.getImageLoadStatus() != MediaTracker.COMPLETE))
			try {
				URL url = new URL(filename);
				image = new ImageIcon(url);
			} catch (Exception e) {

			}
		this.olala.drawImage(image.getImage(), x, y, null);

		
	}

	public BufferedImage getBuf(){
		return this.bublik;
		
	}
}