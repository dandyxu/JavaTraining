package com.dandy.day10.shape;

public class Point {
	int x;
	int y;

	// 构造器的重载现象，构造方法里的参数不一样叫重载现象
	// 构造器 特殊的构造方法
	public Point(int x, int y) {
		this.x = x; // this这个，表明是当前类，相当于当前类的对象是Point
		this.y = y;
	}

	public Point() {

	}

	// 构造器的重载现象
	public Point(int x) {
		// this.x=x;
		// this.y=x;
		this(x, x); // 调用本类其他的构造器，实际上调用的是Point(int x,int y)，只能写在本构造器的第一行
	}

	// 属性 构造器 方法
	public double distance() {
		return Math.sqrt(this.x * x + y * y);
	}

	public double distance(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));

	}

	public double distance(Point other) {
		// return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y
		// -other.y)* (this.y - other.y));

		return this.distance(other.x, other.y);
	}

}
