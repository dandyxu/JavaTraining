package com.dandy.day04;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
        int x=3,y=4;
        System.out.println(x>y?x:y);
        //int age=18;
        Scanner console=new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age=console.nextInt();                                   //必须声明一个变量，将扫描的结果赋予该变量
        System.out.println(age>=18?"可以进入":"未成年人禁止进入");
		int n=78;
		String s=(n>=90)?"a":((n<60)?"c":"b");
		System.out.println(s);
        
	}

}
