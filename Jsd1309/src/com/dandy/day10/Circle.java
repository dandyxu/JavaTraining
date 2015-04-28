package com.dandy.day10;

public class Circle {

	/**
	 * 定义一个圆
	 */
	double r;
	Point center;

	public Circle() {

	}

	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	public Circle(int x, int y, double r) {
		this(new Point(x, y), r);
	}

	public double area() {
		return Math.PI * r * r;
	}

	public double around() {
		return Math.PI * 2 * r;
	}

	public boolean contains(Point p) {
		// if (Math.sqrt((this.center.x - p.x) * (this.center.x - p.x)
		// + (this.center.y - p.y) * (this.center.y - p.y)) <= r) {
		// return true;
		return this.center.distance(p) <= r;

	}

	public boolean contains(int x, int y) {
		return this.center.distance(x, y) <= r;
	}

}
