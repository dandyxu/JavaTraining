package com.dandy.day12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FullStarPanel extends JPanel {
	int[] xx;// ר��������ʾ������
	int[] yy;// ר��������ʾ������
	int x = 700;// �������ĺ��������

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
			fs[i] = new Font("����", Font.BOLD, 15 + i);
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		for (int i = 0; i < xx.length; i++) {
			g.setFont(fs[i % fs.length]);// �����ظ�ȡ15~29֮����±�,fs[]���±�ֻ��ȡ��15~29����i�����ȡ��300��
			g.drawString("*", xx[i], yy[i]);

		}

		g.fillArc(600, 50, 50, 50, 0, 360);// ������
		g.setColor(Color.BLUE);
		g.fillArc(x, 50, 50, 50, 0, 360);// ������

	}

	public void snow() {
		new Thread() {
			public void run() {// run����ר���������߳��﷢������
				while (true) {
					for (int i = 0; i < yy.length; i++) {
						yy[i]++;
						if (yy[i] > 760) {
							yy[i] = 0;
						}
					}
					repaint();// �ػ����൱��ˢ��
					try {
						Thread.sleep(10); // ���߳�����10����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();// ��������߳�

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
