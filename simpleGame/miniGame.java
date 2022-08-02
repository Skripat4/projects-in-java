package simpleGame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;

import PixelScreen.bitmap;


public class miniGame {
BufferedImage ekran;
bitmap fon;
	public miniGame(int w,int h) {
	ekran= new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
	fon =new bitmap(w,h);
	
	for(int y=0;y<h;y++) {
		for (int x=0;x<w;x++) {
			fon.setPix(x, y, 0, 255, 0);
		}
	}
	for(int y=0;y<h;y++) {
		for (int x=0;x<3;x++) {
			fon.setPix(x, y, 255, 0, 0);
		}
	}
	}
	BufferedImage ekran() {
		return fon.getBuf();
	}
}
