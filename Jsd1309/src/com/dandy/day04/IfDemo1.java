package com.dandy.day04;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("������һ������");
	      int i=sc.nextInt();
	      if(i%2==0){
	    	  System.out.println(i+"��һ��ż��");
	      }else{
	    	  System.out.println(i+"��һ������");
	      }
	}
}
