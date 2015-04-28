package com.dandy.day03;

public class CharDemo {

	public static void main(String[] args) {
         char c='A';                              //必须是单个字符，反斜杠"\"不能用，为转义字符的起始标识
		 c='a';
		 int i=c;
		 System.out.println(i);                   //可以将字符类型的c赋给int类型的i
		 
		 c='\u4e2d';                              //表示是unicode码
		 System.out.println(c);
		 c='徐';
		 System.out.println(Integer.toHexString(c));//Integer.toHexString可以将char类型转换成16进制输出
		 c='文';
		 System.out.println(Integer.toHexString(c));
		 c='谦';
		 System.out.println(Integer.toHexString(c));		 
		 c='\u5f90';
		 System.out.print(c);
		 c='\u6587';
		 System.out.print(c);
		 c='\u8c26';
		 System.out.print(c);
		 //char ch='ab';           char类型只有一个字符
		 
		 
		 
		 
		
	}

}
