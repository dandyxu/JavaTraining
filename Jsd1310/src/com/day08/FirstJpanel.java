package com.day08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class FirstJpanel extends JPanel implements MouseListener {

	Ball bl;
	ArrayList<Ball> balls = new ArrayList<Ball>();

	// ����һ�����췽��������ɳ�ʼ����10����
	public FirstJpanel() {
		for (int i = 0; i < 2; i++) {
			addBall();
		}
		this.addMouseListener(this);
	}

	// ����һ��������������һ��С�򣬲��ӵ�������
	public void addBall() {
		// ͨ��������������ɫ
		int R = (int) (Math.random() * 255);
		int G = (int) (Math.random() * 255);
		int B = (int) (Math.random() * 255);
		Color ballC = new Color(R, G, B);
		// ͨ����������������
		int direction = (int) (Math.random() * 4);
		// ͨ�������������뾶
		int rSize = (int) (Math.random() * 30 + 10);// [10,39]
		// ���С����ٶ�
		int speed = (int) (Math.random() * 20 + 1);
		// ͨ������������С�������
		int bx = (int) (Math.random() * 800);
		int by = (int) (Math.random() * 600);
		bl = new Ball(bx, by, direction, rSize, ballC, speed);
		balls.add(bl);
	}

	// ����һ�����ʣ�����Ball����Ļ�����
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < balls.size(); i++) {
			balls.get(i).drawBall(g);
		}
	}

	// ����һ����������С���˶�
	public void startBall() {
		new Thread() {
			public void run() {
				while (true) {
					// С���ƶ�����
					for (int i = 0; i < balls.size(); i++) {
						balls.get(i).ballDireciton();
					}
					// С����ײ

					for (int i = 0; i < balls.size() - 1; i++) {
						for (int j = i + 1; j < balls.size(); j++) {
							int chk = bl.collede(balls.get(i), balls.get(j));
							if (chk == 1) {
								if (balls.get(i).getR() > balls.get(j).getR()) {
									balls.get(i).setR(
											balls.get(i).getR()
													+ balls.get(j).getR());
									balls.remove(j);
								} else if (balls.get(i).getR() < balls.get(j)
										.getR()) {
									balls.get(j).setR(
											balls.get(i).getR()
													+ balls.get(j).getR());
									balls.remove(i);
								}
							}
						}
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						repaint();

					}// endwhile
				}
			}
		}.start();

	}

	// ��굥��
	public void mouseClicked(MouseEvent arg0) {
		addBall();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	// ���ѹ��
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
