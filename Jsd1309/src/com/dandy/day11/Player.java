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

	// ���Ʒ���
	public void add(Card card) {
		cards = Arrays.copyOf(cards, cards.length + 1); // ����һ������
		cards[cards.length - 1] = card; // ������ӵ������Ƹ���cards[]��һ��Ԫ��
	}

	public String toString() {
		return name + ":" + Arrays.toString(cards);
	}

}
