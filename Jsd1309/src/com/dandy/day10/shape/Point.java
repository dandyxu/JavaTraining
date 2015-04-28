package com.dandy.day10.shape;

public class Point {
	int x;
	int y;

	// ���������������󣬹��췽����Ĳ�����һ������������
	// ������ ����Ĺ��췽��
	public Point(int x, int y) {
		this.x = x; // this����������ǵ�ǰ�࣬�൱�ڵ�ǰ��Ķ�����Point
		this.y = y;
	}

	public Point() {

	}

	// ����������������
	public Point(int x) {
		// this.x=x;
		// this.y=x;
		this(x, x); // ���ñ��������Ĺ�������ʵ���ϵ��õ���Point(int x,int y)��ֻ��д�ڱ��������ĵ�һ��
	}

	// ���� ������ ����
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
