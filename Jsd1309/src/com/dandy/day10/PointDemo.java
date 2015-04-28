package com.dandy.day10;

public class PointDemo {

	public static void main(String[] args) {
		Point point = new Point(3, 4);
		// System.out.println(point.x + ":" + point.y);
		/*
		 * Random rd=new Random(); Scanner sc=new Scanner(System.in);
		 */// Random()构造器中没有参数，而Scanner()构造器中有参数
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 4;

		Point p2 = new Point(3);
		// System.out.println(p2.x+":"+p2.y);

		// 求点到原点的距离
		Point p3 = new Point(3, 4);
		System.out.println(p3.distance());

		// 求两点之间的距离
		Point p4 = new Point(3, 4);
		System.out.println(p4.distance(7, 7));

		// 调用other类
		Point p5 = new Point(3, 4);
		Point other = new Point(7, 7);
		System.out.println(p5.distance(other)); // 第一种方式
		System.out.println(p5.distance(new Point(7, 7))); // 第二种方式

	}

}
