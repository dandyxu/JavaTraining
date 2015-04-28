package com.dandy.day09;

public class BookDemo {

	/**
	 * 测试Book类
	 */
	public static void main(String[] args) {
		Book book = new Book();
		book.name = "蛮荒记";
		book.id = 12345235345345234l; // long类型必须要加l，否则被认为是int类型
		book.authors = new String[] { "我吃西红柿" }; // 静态初始化只能在数组声明的时候进行赋值book.authors={"我吃西红柿"}
		book.price = 345;
		// System.out.println(book.toString());
		System.out.println(book.toString1());

	}

}
