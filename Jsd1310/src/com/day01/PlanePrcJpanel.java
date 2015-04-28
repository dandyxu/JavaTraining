package com.day01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PlanePrcJpanel extends JPanel implements MouseMotionListener {
	Image bgImg;

	private int bx = 0, by = -5400;

	Image hImg;

	private int hx = 150, hy = 500;

	public PlanePrcJpanel() {
		bgImg = new ImageIcon("images/bk.jpg").getImage();
		hImg = new ImageIcon("images/hero.GIF").getImage();
		this.addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bgImg, bx, by, null);
		g.drawImage(hImg, hx, hy, null);

	}

	public void beginbkImg() {
		new Thread() {
			public void run() {
				while (true) {
					by++;
					if (by == 0) {
						by = -5400;
					}
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				}// endwhile
			}
		}.start();
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
		hx = e.getX() - hImg.getWidth(null) / 2;
		hy = e.getY() - hImg.getHeight(null) / 2;
	}

}
