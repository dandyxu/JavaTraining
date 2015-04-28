package com.dandy.day04;

import java.util.Scanner;

public class IfDemo2 {

	/**
	 * 判断一个数能被7整除，但不能被3整除
	 */
	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("请输入一个数：");
          int i=sc.nextInt();
          /*if(i%7==0&&i%3!=0){
        	  System.out.println(i+"能被7整除，并且不能被3整除");
        	  
          }else{
        	  System.out.println(i+"不满足条件");
          }*/
          if(i%7==0){
        	  if(i%3!=0){
        		  System.out.println(i+"能被7整除，但不能被3整除");
        	  }else{
        		  System.out.println(i+"不满足第二个条件");
        	  }
          }else{
        	  System.out.println(i+"连第一个条件都不满足,bitch is so bitch");
          }
	}
}
