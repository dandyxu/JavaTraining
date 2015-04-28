package com.dandy.day10;

public class CircleDemo {

	/**
	 * Circle≤‚ ‘¿‡
	 */
	public static void main(String[] args) {
		Circle c = new Circle(3, 4, 5);
		System.out.println(c.area());
		System.out.println(c.around());
		//System.out.println(c.contains());
		System.out.println(c.contains(10,10));
	}

}
