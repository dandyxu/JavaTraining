package com.dandy.day09;

import java.util.Arrays;

public class Book {
	String name; // Book类中有name属性
	long id;
	String[] authors;
	double price;

	public String toString() {
		return name + ":" + price;
	}

	public String toString1() {
		return name + "，" + "作者为"+Arrays.toString(authors) + "," + price;
	}
}
