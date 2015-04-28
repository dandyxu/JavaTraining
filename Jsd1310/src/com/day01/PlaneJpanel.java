package com.day01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PlaneJpanel extends JPanel implements MouseMotionListener {
	// 定义一个Image对象用于存背景
	Image bgImg;
	// 定义背景图的坐标
	private int bx = 0, by = -5400;
	// 定义Image对象用于存英雄机
	Image hImg;
	// 英雄机的坐标
	private int hx = 150, hy = 500;

	// 定义一个构造方法用于加载图片
	public PlaneJpanel() {
		bgImg = new ImageIcon("images/bk.jpg").getImage();
		hImg = new ImageIcon("images/hero.GIF").getImage();
		this.addMouseMotionListener(this);
	}

	// 画笔
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bgImg, bx, by, null);
		g.drawImage(hImg, hx, hy, null);
	}

	// 定义一个方法用于背景
	public void startBkImg() {
		new Thread() {
			public void run() {
				while (true) {
					by++;
					if (by == 0) {
						by = -5400;
					}
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}// endwhile
			}
		}.start();
	}

	// 拖动
	public void mouseDragged(MouseEvent e) {

	}

	// 移动
	public void mouseMoved(MouseEvent e) {
		hx = e.getX() - hImg.getWidth(null) / 2;
		hy = e.getY() - hImg.getHeight(null) / 2;
	}
}
