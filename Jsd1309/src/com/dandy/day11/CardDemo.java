package com.dandy.day11;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {

	public static void main(String[] args) {
		Card[] cards = new Card[54];
		int i = 0;
		for (int rank = Card.THREE; rank <= Card.DEUCE; rank++) {
			cards[i++] = new Card(Card.DIAMOND, rank);
			cards[i++] = new Card(Card.CLUB, rank);
			cards[i++] = new Card(Card.HEART, rank);
			cards[i++] = new Card(Card.SPADE, rank);

		}
		cards[i++] = new Card(Card.JOKER, Card.BLACK);
		cards[i++] = new Card(Card.JOKER, Card.COLOR);
		System.out.println(Arrays.toString(cards));
		// System.out.println(i);

		Random rd = new Random(); // 洗牌算法
		for (i = cards.length - 1; i > 0; i--) {
			int j = rd.nextInt(i);// 必须有一个范围
			Card card = cards[i];
			cards[i] = cards[j];
			cards[j] = card;

		}
		System.out.println(Arrays.toString(cards));

		Player[] players = new Player[3];
		players[0] = new Player(1, "习近平");
		players[1] = new Player(2, "奥巴马");
		players[2] = new Player(3, "普京");

		int index = 0;
		for (i = 0; i < cards.length; i++) {
			Card card = cards[i];
			Player someone = players[index++ % players.length];
			someone.add(card);

		}
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
	}
}
