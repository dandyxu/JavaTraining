package com.dandy.day04;

import java.util.Scanner;

public class IfDemo2 {

	/**
	 * �ж�һ�����ܱ�7�����������ܱ�3����
	 */
	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("������һ������");
          int i=sc.nextInt();
          /*if(i%7==0&&i%3!=0){
        	  System.out.println(i+"�ܱ�7���������Ҳ��ܱ�3����");
        	  
          }else{
        	  System.out.println(i+"����������");
          }*/
          if(i%7==0){
        	  if(i%3!=0){
        		  System.out.println(i+"�ܱ�7�����������ܱ�3����");
        	  }else{
        		  System.out.println(i+"������ڶ�������");
        	  }
          }else{
        	  System.out.println(i+"����һ��������������,bitch is so bitch");
          }
	}
}
