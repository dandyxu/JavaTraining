package com.dandy.day03;

public class CharDemo {

	public static void main(String[] args) {
         char c='A';                              //�����ǵ����ַ�����б��"\"�����ã�Ϊת���ַ�����ʼ��ʶ
		 c='a';
		 int i=c;
		 System.out.println(i);                   //���Խ��ַ����͵�c����int���͵�i
		 
		 c='\u4e2d';                              //��ʾ��unicode��
		 System.out.println(c);
		 c='��';
		 System.out.println(Integer.toHexString(c));//Integer.toHexString���Խ�char����ת����16�������
		 c='��';
		 System.out.println(Integer.toHexString(c));
		 c='ǫ';
		 System.out.println(Integer.toHexString(c));		 
		 c='\u5f90';
		 System.out.print(c);
		 c='\u6587';
		 System.out.print(c);
		 c='\u8c26';
		 System.out.print(c);
		 //char ch='ab';           char����ֻ��һ���ַ�
		 
		 
		 
		 
		
	}

}
