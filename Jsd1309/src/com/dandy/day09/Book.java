package com.dandy.day09;

import java.util.Arrays;

public class Book {
	String name; // Book������name����
	long id;
	String[] authors;
	double price;

	public String toString() {
		return name + ":" + price;
	}

	public String toString1() {
		return name + "��" + "����Ϊ"+Arrays.toString(authors) + "," + price;
	}
}
