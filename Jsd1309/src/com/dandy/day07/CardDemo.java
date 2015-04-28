package com.dandy.day07;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {

	/**
	 * Card Game
	 */
	public static void main(String[] args) {
		String[] cards = { "����A ", "����8 ", "����3 ", "����5 ", "����K ", "����3 ",
				"����10", "����Q ", "����J ", "����8 ", "÷��A ", "÷��4 ", "÷��10", "÷��Q ",
				"��ƬJ ", "��ƬK ", "��Ƭ2 ", "��Ƭ9 ", "����  ", "С��     " };
		System.out.println(cards.length);
		String[] players = { "ϰ��ƽ", "�°���", "�ս�" };
		Random rd = new Random();
		for (int i = cards.length - 1; i > 0; i--) { // ��cards��������һ������ʼ��������ǰ��
			int j = rd.nextInt(i); // [0,i-1] �ֱ���ǰi-1λ�е���������н������Դﵽϴ�Ƶ�Ŀ��
			String temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
		// System.out.println(Arrays.toString(cards));

		for (int i = 0, index = 0; i < cards.length; i++) {
			String card = cards[i];
			String player = players[index++ % 3]; // 0,1,2
			System.out.print(player + "��" + card + " ");
			if (index % players.length == 0) {
				System.out.println();
			}

		}

	}

}
