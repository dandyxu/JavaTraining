package com.dandy.day10.shape;

public class Shape {
	public Point location;            //Բ�ĺ;������Ϸ��ĵ�һ����

	public double area() {
		return 0;
	}

	public boolean contains(Point p) {
		return false;
	}

	public boolean contains(int x, int y) {
		return this.contains(new Point(x, y));
	}

}
