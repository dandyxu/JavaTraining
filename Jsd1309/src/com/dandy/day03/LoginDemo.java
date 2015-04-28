package com.dandy.day03;

public class LoginDemo {

	public static void main(String[] args) {
        int age=68;
        char gender='男';
        if(gender=='女'&&age++>=60){                           //gender=='女'&&age++为短路与，若第一个条件不满足，则整个语句不再看。
        	System.out.println("欢迎老太太来送钱！");}           //gender&age++为与，age++的运算结果是判断&是否成立的先决条件，必须先执行出来
        System.out.println(age);
        	
        
		
		
		
	}

}
