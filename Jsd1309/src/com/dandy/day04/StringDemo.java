package com.dandy.day04;

public class StringDemo {

	public static void main(String[] args) {
		String s="123456,Hello Beauty!，oh Yeah!";
		//        012345678910                              每个字符下都对应一个游标
		System.out.println(s);
		int length=s.length();
		System.out.println(length);
		
		//s="学java";                       //10个字节，1个字符占2个字节
		
		char c=s.charAt(7);                 //charAt(index)表示能够通过游标得到游标所对应的那个字符，游标对应从0开始 
		System.out.println(c);
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
}
