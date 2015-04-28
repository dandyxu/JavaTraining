package com.dandy.day06;

public class FunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int y=add(10,20);
        System.out.println(y);
        double z=add(25);
        System.out.println(z);
	}
	
//  	
	public static int add(int x,int y){
		return x+y;
	}
	public static double add(int x){
		return x+10;
	}

}
