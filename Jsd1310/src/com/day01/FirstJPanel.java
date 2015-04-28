package com.day01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class FirstJPanel extends JPanel implements MouseMotionListener {
	// ����һ�����췽�������������ʼ��

	// ����������ڴ��ߵ�x,y���꣨����˽�л���
	private int x = 100, y = 530;
	// ����������ڴ�С������꼰����
	private int bx = 200, by = 100, f = 0;

	// ����һ�����췽��
	public FirstJPanel() {
		this.setBackground(Color.white);
		this.addMouseMotionListener(this);
	}

	// ����һ������
	public void paint(Graphics g) {
		super.paint(g);
		g.fillArc(bx, by, 50, 50, 0, 360);
		// ֱ�߼Ӵ�
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(x, y, x + 200, y);
		if (by > 600) {
			g.drawString("Sorry,Game Over!", 150, 50);
		}

	}

	// ����һ���������������̣߳�����С����
	public void startBall() {
		new Thread() {
			public void run() {
				while (true) {
					// 1:С������仯
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
					// �ж�������
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
					// �ж�С���Ƿ�����ֱ����
					if (by == 530 - 50) {
						if (bx >= x && bx <= x + 200) {
							if (f == 1)
								f = 2;
							else
								f = 3;
						}
					}

					// 2:��Ϣ
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// 3:�ػ�
					repaint();

				}// endwhile

			}

		}.start();

	}

	// �϶�
	public void mouseDragged(MouseEvent e) {
		x = e.getX() - 120;
		repaint();
	}

	// �ƶ�
	public void mouseMoved(MouseEvent e) {

	}

}
