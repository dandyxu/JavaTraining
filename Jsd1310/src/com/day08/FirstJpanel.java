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

	// 定义一个构造方法用于完成初始化，10个球
	public FirstJpanel() {
		for (int i = 0; i < 2; i++) {
			addBall();
		}
		this.addMouseListener(this);
	}

	// 定义一个方法用于生成一个小球，并加到集合中
	public void addBall() {
		// 通过随机数计算出颜色
		int R = (int) (Math.random() * 255);
		int G = (int) (Math.random() * 255);
		int B = (int) (Math.random() * 255);
		Color ballC = new Color(R, G, B);
		// 通过随机数计算出方向
		int direction = (int) (Math.random() * 4);
		// 通过随机数计算出半径
		int rSize = (int) (Math.random() * 30 + 10);// [10,39]
		// 随机小球的速度
		int speed = (int) (Math.random() * 20 + 1);
		// 通过随机数计算出小球的坐标
		int bx = (int) (Math.random() * 800);
		int by = (int) (Math.random() * 600);
		bl = new Ball(bx, by, direction, rSize, ballC, speed);
		balls.add(bl);
	}

	// 定义一个画笔，调用Ball类里的画方法
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < balls.size(); i++) {
			balls.get(i).drawBall(g);
		}
	}

	// 定义一个方法用于小球运动
	public void startBall() {
		new Thread() {
			public void run() {
				while (true) {
					// 小球移动方向
					for (int i = 0; i < balls.size(); i++) {
						balls.get(i).ballDireciton();
					}
					// 小球碰撞

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

	// 鼠标单击
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

	// 鼠标压下
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
