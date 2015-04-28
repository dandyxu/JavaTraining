package com.day01;

import javax.swing.JFrame;

public class PlanePrcJframe extends JFrame {
	public void showMe() {
		this.setTitle("·É»ú´óÕ½");
		this.setBounds(300, 150, 400, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void addPanel() {
		PlanePrcJpanel fjp = new PlanePrcJpanel();
		fjp.beginbkImg();
		this.add(fjp);

	}

	public static void main(String[] args) {
		PlanePrcJframe fjf = new PlanePrcJframe();
		fjf.addPanel();
		fjf.showMe();
	}
}
