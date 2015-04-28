package com.dandy.day13;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class MyBallPanel extends JPanel {
	List<Ball> balls;// 集合

	public MyBallPanel() {
		balls = new ArrayList<Ball>();
		for (int i = 0; i < 10; i++) {
			int temp_x = (int) (Math.random() * 920);// 横坐标从0到919
			int temp_y = (int) (Math.random() * 700);// 纵坐标从0到699
			int temp_r = (int) (Math.random() * 15) + 15;// 半径从15到30

			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			Color color = new Color(r, g, b);

			int temp_way = (int) (Math.random() * 4);
			int temp_speed = (int) (Math.random() * 5) + 1;

			Ball ball = new Ball(temp_x, temp_y, temp_r, color, temp_way, this,
					temp_speed);

			balls.add(ball);

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLUE);
		for (int i = 0; i < balls.size(); i++) {
			Ball ball = balls.get(i);
			ball.draw(g);
		}

	}

	void startRun() {
		new Thread() {
			public void run() {
				while (true) {
					for (int i = 0; i < balls.size(); i++) {
						Ball ball = balls.get(i);
						ball.move();
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			};
		}.start();
	}

}
