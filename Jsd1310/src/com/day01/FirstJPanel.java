package com.day01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class FirstJPanel extends JPanel implements MouseMotionListener {
	// 定义一个构造方法用于完成面板初始化

	// 定义变量用于存线的x,y坐标（属性私有化）
	private int x = 100, y = 530;
	// 定义变量用于存小球的坐标及方向
	private int bx = 200, by = 100, f = 0;

	// 定义一个构造方法
	public FirstJPanel() {
		this.setBackground(Color.white);
		this.addMouseMotionListener(this);
	}

	// 定义一个画笔
	public void paint(Graphics g) {
		super.paint(g);
		g.fillArc(bx, by, 50, 50, 0, 360);
		// 直线加粗
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(x, y, x + 200, y);
		if (by > 600) {
			g.drawString("Sorry,Game Over!", 150, 50);
		}

	}

	// 定义一个方法，启动多线程，用于小球跑
	public void startBall() {
		new Thread() {
			public void run() {
				while (true) {
					// 1:小球坐标变化
					if (f == 0) {
						bx++;
						by++;
					}
					if (f == 1) {
						bx--;
						by++;
					}
					if (f == 2) {
						bx--;
						by--;
					}
					if (f == 3) {
						bx++;
						by--;
					}
					// 判断四条边
					if (bx == 400 - 50) {
						if (f == 0)
							f = 1;
						else
							f = 2;
					}
					if (bx == 0) {
						if (f == 2)
							f = 3;
						else
							f = 0;
					}
					if (by == 0) {
						if (f == 3)
							f = 0;
						else
							f = 1;
					}
					// 判断小球是否落在直线上
					if (by == 530 - 50) {
						if (bx >= x && bx <= x + 200) {
							if (f == 1)
								f = 2;
							else
								f = 3;
						}
					}

					// 2:休息
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// 3:重绘
					repaint();

				}// endwhile

			}

		}.start();

	}

	// 拖动
	public void mouseDragged(MouseEvent e) {
		x = e.getX() - 120;
		repaint();
	}

	// 移动
	public void mouseMoved(MouseEvent e) {

	}

}
