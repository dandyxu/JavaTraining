package com.dandy.day06;

public class Demo1 {

	/**
	 * 水仙花数 100-1000 xyz=x^3+y^3+z^3
	 */
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int x = i / 100;
			int y = i / 10 % 10;
			int z = i % 10;
			if (x * x * x + y * y * y + z * z * z == i) {
				System.out.println(i + "是一个水仙花数！");
			}
		}

	}
}