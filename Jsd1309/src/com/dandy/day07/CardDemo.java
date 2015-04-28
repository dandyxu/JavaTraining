package com.dandy.day07;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {

	/**
	 * Card Game
	 */
	public static void main(String[] args) {
		String[] cards = { "红桃A ", "红桃8 ", "红桃3 ", "红桃5 ", "黑桃K ", "黑桃3 ",
				"黑桃10", "黑桃Q ", "黑桃J ", "黑桃8 ", "梅花A ", "梅花4 ", "梅花10", "梅花Q ",
				"方片J ", "方片K ", "方片2 ", "方片9 ", "大王  ", "小王     " };
		System.out.println(cards.length);
		String[] players = { "习近平", "奥巴马", "普金" };
		Random rd = new Random();
		for (int i = cards.length - 1; i > 0; i--) { // 从cards数组的最后一个数开始，依次向前，
			int j = rd.nextInt(i); // [0,i-1] 分别与前i-1位中的随机数进行交换，以达到洗牌的目的
			String temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
		// System.out.println(Arrays.toString(cards));

		for (int i = 0, index = 0; i < cards.length; i++) {
			String card = cards[i];
			String player = players[index++ % 3]; // 0,1,2
			System.out.print(player + "：" + card + " ");
			if (index % players.length == 0) {
				System.out.println();
			}

		}

	}

}
