package com.dandy.day10;

public class Son extends Father {

	public int f(int x) {
		return super.f(x);
	}

	public void f() {
		System.out.println(name);
	}

	public Son() {
		System.out.println("��������Ĺ�����");
	}

	public static void main(String[] args) {
		Son son = new Son();
        
		
		
	}

}
