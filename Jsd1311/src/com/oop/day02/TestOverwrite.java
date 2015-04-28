package com.oop.day02;

public class TestOverwrite extends Shape {

	int r;

	public TestOverwrite(int x, int y, int z) {

	}

	public boolean contains(int x, int y) {

		return true;
	}

	public static void main(String[] args) {

		Shape s1 = new TestOverwrite(3, 4, 5);
		System.out.println(s1.contains(1, 1));//此处应该是调用子类的contains()方法，但自动调用时却是父类的cotains，方法重写失效？
	}
	

}
