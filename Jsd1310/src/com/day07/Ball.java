package com.day07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

public class Ball {
	// ����һ���������ڴ�С������꣬���򣬰뾶
	private int bx, by, direction, r;
	// ����һ��С�����ɫ
	public Color ballC;
	// ����һ��С����ĸ�����
	public static final int right_up = 0;
	public static final int right_down = 1;
	public static final int left_up = 2;
	public static final int left_down = 3;
	// ����һ����������С����ٶ�
	private int speed;

	// ���췽�����С��ĳ�ʼ��
	public Ball(int bx, int by, int direction, int r, Color ballC, int speed) {
		super();
		this.bx = bx;
		this.by = by;
		this.direction = direction;
		this.r = r;
		this.ballC = ballC;
		this.speed = speed;
	}

	// ����һ��������ɻ�С��
	public void drawBall(Graphics g) {
		g.setColor(ballC);
		g.fillArc(bx, by, 2 * r, 2 * r, 0, 360);
	}

	// ����һ����������С��ķ���
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
