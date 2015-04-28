package com.dandy.day07;

import java.util.Arrays;

import javax.swing.JFrame;

public class ArrayDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ary1; // 声明一个int类型的数组ary1
		// int ary2[]; //声明一个int类型的数组ary2，不推荐使用
		// 动态初始化需new这个关键字，
		JFrame frame = new JFrame();
		ary1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 动态初始化
		System.out.println(Arrays.toString(ary1));
		ary1 = new int[9]; // 创建一个长度为9的int类型数组
		// ary1={1,2,3,4}; 编译错误，静态初始化只能在声明的时候使用，而不能赋值
		// System.out.println(ary1);//打印出来的是内存地址
		System.out.println(Arrays.toString(ary1));

		int[] ary2 = { 3, 4, 5, 6, 7 };
		double[] ary3 = new double[2];
		System.out.println(Arrays.toString(ary3));
		boolean[] ary4 = new boolean[3];
		System.out.println(Arrays.toString(ary4));
		char[] ary5 = new char[4]; // \u0000
		System.out.println(Arrays.toString(ary5));
		char c = '\u0000';
		System.out.println(c);
		String[] ary6 = new String[8];
		System.out.println(Arrays.toString(ary6));

		String[] ary7 = { "红桃3", "红桃4", "黑桃2", "大王" };
		int length = ary7.length; // 调用这个属性时不用()
		System.out.println(Arrays.toString(ary7));
		System.out.println(length);
		System.out.println(ary7[2]);
		//System.out.println(ary7[7]);    数组下标越界异常
		
		

	}

}
