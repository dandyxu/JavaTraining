package com.dandy.day10.shape;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s = new Circle(5, 5, 4); // 多态，父类的引用指向子类的对象
		Point p = new Point(6, 8);
		System.out.println(s.area());
		System.out.println(s.contains(p));

		Shape s1 = new Rectangle(8, 8, 4, 5);
		Point p1 = new Point(4, 4);
		System.out.println(s1.area());
		System.out.println(s1.contains(p1));

		print(s);
		print(s1);

	}

	public static void print(Shape s) {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 20; x++) {
				if (s.contains(x, y)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
