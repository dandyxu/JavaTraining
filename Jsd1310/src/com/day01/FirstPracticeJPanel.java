package com.day01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class FirstPracticeJPanel extends JPanel {
	public FirstPracticeJPanel() {
		this.setBackground(Color.white);

	}
	private int x=100,y=530;

	public void paint(Graphics g) {
		super.paint(g);
		g.fillArc(250, 250, 80, 80, 0, 360);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(x, y, x+200, y);
	}
}
