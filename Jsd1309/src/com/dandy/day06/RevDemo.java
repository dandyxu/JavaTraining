package com.dandy.day06;

public class RevDemo {

	/**
	 * ตÝน้ f(n)=f(n-1)+n f(1)=1 f(5)=f(4)+5=f(3)+4+5=f(2)+3+4+5=f(1)+2+3+4+5
	 */
	public static void main(String[] args) {
		int n = 5;
		int y = f(n);
		System.out.println(y);

	}

	private static int f(int n) {
		if (n == 1) {
			return 1;
		}
		return f(n - 1) + n;
	}

}
