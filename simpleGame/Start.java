package SimpleGame;

import javax.swing.JFrame;

public class Start {

	 public static final int WIDTH=640;
	public static final int HEIGHT=480;
	public Start() {
	JFrame f=new JFrame("Simple Game");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(WIDTH+16,HEIGHT+39);
	f.add(new Ёкран(WIDTH,HEIGHT));
	f.setResizable(false);
	f.setLocationRelativeTo(null);
	f.setVisible(true);
	}
}
