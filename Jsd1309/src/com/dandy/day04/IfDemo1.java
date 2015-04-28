package com.dandy.day04;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("请输入一个数：");
	      int i=sc.nextInt();
	      if(i%2==0){
	    	  System.out.println(i+"是一个偶数");
	      }else{
	    	  System.out.println(i+"是一个奇数");
	      }
	}
}
