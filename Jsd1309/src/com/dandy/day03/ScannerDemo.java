package com.dandy.day03;

import java.util.Scanner;

public class ScannerDemo {
    

	public static void main(String[] args) {
           Scanner console=new Scanner(System.in);
           System.out.println("请输入一个数：");
           int i=console.nextInt();                 //能够扫描我们输入的那个数
           System.out.println(i*8);
		
		
	}

}
