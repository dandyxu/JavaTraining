package com.dandy.day11;

public class Card {
	public static final int DIAMOND = 0; // 专门表示常量，代表方块
	public static final int CLUB = 1; // 代表梅花
	public static final int HEART = 2; // 代表红桃
	public static final int SPADE = 3; // 代表黑桃
	public static final int JOKER = 4; // 代表王

	public static final int THREE = 0;
	public static final int FOUR = 1;
	public static final int FIVE = 2;
	public static final int SIX = 3;
	public static final int SEVEN = 4;
	public static final int EIGHT = 5;
	public static final int NINE = 6;
	public static final int TEN = 7;
	public static final int JACK = 8;
	public static final int QUEEN = 9;
	public static final int KING = 10;
	public static final int ACE = 11;
	public static final int DEUCE = 12;
	public static final int BLACK = 13;
	public static final int COLOR = 14;

	int rank; // 点数
	int suit; // 花色

	public Card() {

	}

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public static final String[] SUIT_NAME = { "方块", "梅花", "红桃", "黑桃", "" };

	public static final String[] RANK_NAME = { "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K", "A", "2", "小王", "大王" };

	public String toString() {
		return SUIT_NAME[this.suit] + RANK_NAME[this.rank];

	}

}
