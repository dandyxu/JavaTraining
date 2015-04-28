package com.dandy.day06;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	/**
	 * @param args
	 */
	void showMe() {
		this.setSize(600, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void addPanel(JPanel panel) {
		this.add(panel);
	}

	public static void main(String[] args) {
		MyFrame frame1 = new MyFrame();
		Panel1 panel1 = new Panel1();
		frame1.showMe();
		frame1.addPanel(panel1);
		MyFrame frame2 = new MyFrame();
		Panel2 panel2 = new Panel2();
		frame2.showMe();
		//frame2.addPanel(panel2);
	}

}
