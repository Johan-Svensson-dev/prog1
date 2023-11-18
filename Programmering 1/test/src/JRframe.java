package src;

import javax.swing.JFrame;

public class JRframe {

	public static void main(String[] args) {
		JFrame frame = new JFrame ();
		frame.setSize(420,420);
	    frame.setTitle("My Test App");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}

}
