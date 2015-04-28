package com.oop.day01;

public class MethodInvocation {

	int x;
	int y;

	void up(int dy) {
		y -= dy;
	}

	void down(int dy) {
		y += dy;
	}

	int distance(MethodInvocation p) {
		int dx = x - p.x;
		int dy = y - p.y;
		return (int) Math.sqrt(dx * dx + dy * dy);

	}

	public static void main(String[] args) {
		MethodInvocation p1 = new MethodInvocation();
		MethodInvocation p2 = new MethodInvocation();
		p1.x = 100;
		p1.y = 200;
		p1.up(100);
		p2.x = 300;
		p2.y = 400;
		p2.down(100);
		int distance = p1.distance(p2);
		System.out.println(distance);

	}

}
