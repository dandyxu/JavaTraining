package com.day01;

import javax.swing.JFrame;

public class FirstPracticeJFrame extends JFrame {
	public void showMe() {
		this.setTitle("Ð¡Çò·´µ¯");
		this.setBounds(250, 100, 500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void addPanel() {
		FirstPracticeJPanel fjp = new FirstPracticeJPanel();
		this.add(fjp);
	}

	public static void main(String[] args) {
		FirstPracticeJFrame fjf = new FirstPracticeJFrame();
		fjf.addPanel();
		fjf.showMe();

	}

}
