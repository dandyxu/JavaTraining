package com.dandy.day04;

public class StringDemo {

	public static void main(String[] args) {
		String s="123456,Hello Beauty!��oh Yeah!";
		//        012345678910                              ÿ���ַ��¶���Ӧһ���α�
		System.out.println(s);
		int length=s.length();
		System.out.println(length);
		
		//s="ѧjava";                       //10���ֽڣ�1���ַ�ռ2���ֽ�
		
		char c=s.charAt(7);                 //charAt(index)��ʾ�ܹ�ͨ���α�õ��α�����Ӧ���Ǹ��ַ����α��Ӧ��0��ʼ 
		System.out.println(c);
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
}
