package com.dandy.day10.shape;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int x, int y, int w, int h) {
		this.location = new Point(x, y);
		this.width = w;
		this.height = h;
	}

	@Override
	public double area() {
		return this.height * this.width;
	}

	@Override
	public boolean contains(Point p) {
		return this.contains(p.x, p.y);

	}

	@Override
	public boolean contains(int x, int y) {
		int x1 = x - location.x;
		int y1 = y - location.y;
		return x1 >= 0 && x1 <= width && y1 >= 0 && y1 <= height;
	}

}
