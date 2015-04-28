package com.dandy.day03;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("请输入一个数：");
           int id=sc.nextInt();
           int gw=id%10;
           int sw=id/10%10;
           int bw=id/100%10;
           int qw=id/1000;
           System.out.println(id+"的个位数为"+gw);                  //拼接字符串
           System.out.println(id+"的十位数为"+sw);
           System.out.println(id+"的百位数为"+bw);
           System.out.println(id+"的千位数为"+qw);

	}

}
