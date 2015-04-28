package com.dandy.day12;

import javax.swing.JFrame;

public class MyFullStarFrame extends JFrame {
	FullStarPanel panel;

	void addPanel() {
		panel = new FullStarPanel();
		panel.snow();
		panel.eclipse();
		this.add(panel);

	}

	void showMe() {
		this.setSize(780, 680);
		this.setTitle("»¨300¿ÅÐÇÐÇ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyFullStarFrame frame = new MyFullStarFrame();
		frame.addPanel();
		frame.showMe();
	}

}
