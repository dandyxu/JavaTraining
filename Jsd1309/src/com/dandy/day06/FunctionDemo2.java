package com.dandy.day06;

public class FunctionDemo2 {

	/**
	 * 5,7 3x^2+4*x+y^2
	 */
	public static void main(String[] args) {
		int y = add(5, 7);
		System.out.println(y);
	}

	public static int add(int x, int y) {
		return 3 * x * x + 4 * x + y * y;
	}
}
