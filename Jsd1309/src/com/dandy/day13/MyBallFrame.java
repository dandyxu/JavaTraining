package com.dandy.day13;

import javax.swing.JFrame;

public class MyBallFrame extends JFrame {
	// BallPanel panel;
	MyBallPanel panel;

	void addPanel() {
		// panel = new BallPanel();
		panel = new MyBallPanel();
		panel.startRun();
		this.add(panel);
	}

	void showMe() {
		this.setTitle("Ð¡Çò");
		this.setSize(1000, 780);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyBallFrame frame = new MyBallFrame();
		frame.addPanel();
		frame.showMe();
	}

}
