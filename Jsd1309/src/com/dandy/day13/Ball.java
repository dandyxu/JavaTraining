package com.dandy.day13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ball {
	int x, y;
	int r;
	Color color;// С�����ɫ
	int way;// С��ķ���
	JPanel panel;// С�����ڵĻ���
	int speed;// С����ٶ�
	public static final int LEFT_UP = 0;
	public static final int LEFT_DOWN = 1;
	public static final int RIGHT_UP = 2;
	public static final int RIGHT_DOWN = 3;

	public Ball() {
		super();
	}

	public Ball(int x, int y, int r, Color color, int way, JPanel panel,
			int speed) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
		this.way = way;
		this.panel = panel;
		this.speed = speed;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillArc(x, y, 2 * r, 2 * r, 0, 360);

	}

	// С����˶�
	public void move() {
		switch (way) {
		case LEFT_UP:
			x -= speed;
			y -= speed;
			// �жϷ���
			if (y <= 0) {
				this.way = LEFT_DOWN;
			}
			if (x <= 0) {
				this.way = RIGHT_UP;
			}
			break;
		case LEFT_DOWN:
			x -= speed;
			y += speed;
			if (x <= 0) {
				this.way = RIGHT_DOWN;
			}
			if (y >= panel.getHeight() - 2 * r) {
				this.way = LEFT_UP;
			}
			break;
		case RIGHT_UP:
			x += speed;
			y -= speed;
			if (y <= 0) {
				this.way = RIGHT_DOWN;
			}
			if (x >= panel.getWidth() - 2 * r) {
				this.way = LEFT_UP;
			}
			break;
		case RIGHT_DOWN:
			x += speed;
			y += speed;
			if (y >= panel.getHeight() - 2 * r) {
				this.way = RIGHT_UP;
			}
			if (x >= panel.getWidth() - 2 * r) {
				this.way = LEFT_DOWN;
			}
			break;
		}
	}
}
