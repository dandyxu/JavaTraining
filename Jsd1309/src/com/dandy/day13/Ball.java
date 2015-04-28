package com.dandy.day13;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ball {
	int x, y;
	int r;
	Color color;// 小球的颜色
	int way;// 小球的方向
	JPanel panel;// 小球所在的画板
	int speed;// 小球的速度
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

	// 小球的运动
	public void move() {
		switch (way) {
		case LEFT_UP:
			x -= speed;
			y -= speed;
			// 判断方向
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
