package com.dandy.day13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	int[] xx;
	int[] yy;

	public BallPanel() {
		xx = new int[10];
		yy = new int[10];
		for (int i = 0; i < xx.length; i++) {
			xx[i] = (int) (Math.random() * 900);
			yy[i] = (int) (Math.random() * 700);

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.GREEN);
		g.setColor(Color.RED);
		for (int i = 0; i < xx.length; i++) {
			g.fillArc(xx[i], yy[i], 50, 50, 0, 360);
		}

	}

}
