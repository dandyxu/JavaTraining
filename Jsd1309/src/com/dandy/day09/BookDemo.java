package com.dandy.day09;

public class BookDemo {

	/**
	 * ����Book��
	 */
	public static void main(String[] args) {
		Book book = new Book();
		book.name = "���ļ�";
		book.id = 12345235345345234l; // long���ͱ���Ҫ��l��������Ϊ��int����
		book.authors = new String[] { "�ҳ�������" }; // ��̬��ʼ��ֻ��������������ʱ����и�ֵbook.authors={"�ҳ�������"}
		book.price = 345;
		// System.out.println(book.toString());
		System.out.println(book.toString1());

	}

}
