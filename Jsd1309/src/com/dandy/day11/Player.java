package com.dandy.day11;

import java.util.Arrays;

public class Player {
	int id;
	String name;
	Card[] cards = {};

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	// 发牌方法
	public void add(Card card) {
		cards = Arrays.copyOf(cards, cards.length + 1); // 先做一个扩容
		cards[cards.length - 1] = card; // 将刚添加的那张牌赋给cards[]第一个元素
	}

	public String toString() {
		return name + ":" + Arrays.toString(cards);
	}

}
