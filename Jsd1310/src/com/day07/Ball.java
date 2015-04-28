package com.day07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

public class Ball {
	// 定义一个变量用于存小球的坐标，方向，半径
	private int bx, by, direction, r;
	// 定义一个小球的颜色
	public Color ballC;
	// 定义一个小球的四个方向
	public static final int right_up = 0;
	public static final int right_down = 1;
	public static final int left_up = 2;
	public static final int left_down = 3;
	// 定义一个变量用于小球的速度
	private int speed;

	// 构造方法完成小球的初始化
	public Ball(int bx, int by, int direction, int r, Color ballC, int speed) {
		super();
		this.bx = bx;
		this.by = by;
		this.direction = direction;
		this.r = r;
		this.ballC = ballC;
		this.speed = speed;
	}

	// 定义一个方法完成画小球
	public void drawBall(Graphics g) {
		g.setColor(ballC);
		g.fillArc(bx, by, 2 * r, 2 * r, 0, 360);
	}

	// 定义一个方法用于小球的方向
	public void ballDireciton() {
		switch (direction) {
		case right_up:
			bx += speed;
			by -= speed;
			if (bx >= 800 - r * 2)
				direction = left_up;
			if (by <= 0)
				direction = right_down;
			break;
		case right_down:
			bx += speed;
			by += speed;
			if (bx >= 800 - 2 * r)
				direction = left_down;
			if (by >= 600 - 2 * r - 20)
				direction = right_up;
			break;
		case left_up:
			bx -= speed;
			by -= speed;
			if (bx <= 0)
				direction = right_up;
			if (by <= 0)
				direction = left_down;
			break;
		case left_down:
			bx -= speed;
			by += speed;
			if (bx <= 0)
				direction = right_down;
			if (by >= 600 - 2 * r - 20)
				direction = left_up;
			break;
		}
	}

}
