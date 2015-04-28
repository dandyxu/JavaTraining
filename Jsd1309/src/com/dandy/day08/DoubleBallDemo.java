package com.dandy.day08;

import java.util.Arrays;
import java.util.Random;

public class DoubleBallDemo {

	/**
	 * 双色球规则：从红球01~33中任选6个号码，从篮球01~16中任选1个号码，作为1注，每注2元，也可以进行组合投注
	 */
	public static void main(String[] args) {
		String[] pool = { "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
				"30", "31", "32", "33" };
		boolean[] used = new boolean[pool.length];
		Random rd = new Random();
		String[] balls = new String[6];
		int i = 0;
		while (true) {
			int index = rd.nextInt(pool.length); // [0,32]
			if (used[index] == true) { // 查看球是否被用过
				continue;
			}
			balls[i++] = pool[index];
			used[index] = true;
			if (i == balls.length) {
				break;
			}
		}
		Arrays.sort(balls);
		balls = Arrays.copyOf(balls, balls.length + 1);                //蓝色球只有1个
		balls[balls.length - 1] = pool[rd.nextInt(16)];
		System.out.println(Arrays.toString(balls));

	}
}
