package simpleGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener {
Timer mainTimer=new Timer(20,this);

int width;
int height;

miniGame game;

public Screen(int w,int h) {
	this.width=w;
	this.height=h;
	game=new miniGame(w,h);
	mainTimer.start();
	addKeyListener(new myKeyAdapter());
	setFocusable(true);
}

private class myKeyAdapter extends KeyAdapter// клавиши
{
	public void keyPressed(KeyEvent e) {
		//game.keypreddwd*e)
	}
	
	public void keyReleased(KeyEvent e) {
		//game.keyReleased(e)
	}
	
}

public void paint(Graphics g) {
	g=(Graphics2D) g;
	g.drawImage(game.ekran(),0,0,null);
}
public void actionPerformed(ActionEvent e) {
	//game.update
	repaint();
}
}
