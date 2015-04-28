package com.dandy.day12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FullStarPanel extends JPanel {
	int[] xx;// 专门用来表示横坐标
	int[] yy;// 专门用来表示纵坐标
	int x = 700;// 蓝月亮的横坐标变量

	Font[] fs;

	public FullStarPanel() {
		xx = new int[300];
		yy = new int[300];
		for (int i = 0; i < xx.length; i++) {
			xx[i] = (int) (Math.random() * 700);
			yy[i] = (int) (Math.random() * 760);
		}
		fs = new Font[15];
		for (int i = 0; i < fs.length; i++) {
			fs[i] = new Font("宋体", Font.BOLD, 15 + i);
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		for (int i = 0; i < xx.length; i++) {
			g.setFont(fs[i % fs.length]);// 不断重复取15~29之间的下标,fs[]的下标只能取到15~29，而i则可以取到300；
			g.drawString("*", xx[i], yy[i]);

		}

		g.fillArc(600, 50, 50, 50, 0, 360);// 白月亮
		g.setColor(Color.BLUE);
		g.fillArc(x, 50, 50, 50, 0, 360);// 蓝月亮

	}

	public void snow() {
		new Thread() {
			public void run() {// run方法专门用来在线程里发布任务
				while (true) {
					for (int i = 0; i < yy.length; i++) {
						yy[i]++;
						if (yy[i] > 760) {
							yy[i] = 0;
						}
					}
					repaint();// 重画，相当于刷新
					try {
						Thread.sleep(10); // 让线程休眠10毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();// 启动这个线程

	}

	public void eclipse() {
		new Thread() {
			public void run() {
				while (true) {
					x--;
					if (x == 0) {
						x = 700;
					}
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();

	}
}
