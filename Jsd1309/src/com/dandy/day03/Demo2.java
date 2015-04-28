package com.dandy.day03;

public class Demo2 {
    //public int f(){
    	//int age;                     //声明一个int类型的变量age
    	//age=22;                      //给变量做初始化
    	//System.out.println("age:"+age);
    	//return 0;
    //}
	
	static int age=24;                                 //首先会进入main方法，结果找不到age的声明。如果再加上static属性，则可以。static只要一运行，则自动加载。
	public static void main(String[] args) {
       //int age;                      //声明一个int类型的变量age
       //age=21;                       //给变量做初始化
       //System.out.println(age);
       //age=23;                       //变量的重新赋值
       //System.out.println(age);      //在main方法中，运行顺序是自上而下，程序均是从main方法开始运行，无论main方法在何处
       //char age='c';变量不能重复定义
       
    //System.out.println(age);
		
		//int i;                                          不能重复定义变量i，如果去掉for循环中的int，则能通过编译
		for(int i=0;i<10;i++){
			System.out.println("Love you!");
		}                                                //变量离开作用域，将会被回收
		for(int i=0;i<1;i++){
			System.out.println("Get out!");
		}                                 
		}
	
       
       
	}

