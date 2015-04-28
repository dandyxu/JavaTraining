package com.dandy.day10;

public class Father {
	int x;
	String name;
	public Father(){
		System.out.println("调用父类的构造器");
	}

	private int f() {               //无法继承，因为已经被封装了
		return 0;
	}

	public int f(int x) {
		return x;
	}

}
