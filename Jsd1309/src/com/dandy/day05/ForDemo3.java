package com.dandy.day05;

public class ForDemo3 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		// for (i = 1; i <= 100; i+=2) {
		// sum+=i;
		// }
		//System.out.println(sum);}

		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
