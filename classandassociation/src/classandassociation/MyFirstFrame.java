package classandassociation;

import javax.swing.JFrame;


public class MyFirstFrame extends JFrame {
	public MyFirstFrame(String title,int width,int height) {
		this.setTitle(title);
		this.setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
