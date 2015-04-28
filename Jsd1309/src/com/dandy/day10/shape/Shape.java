package com.dandy.day10.shape;

public class Shape {
	public Point location;            //圆心和矩形左上方的第一个点

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
