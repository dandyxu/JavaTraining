package com.dandy.day05;

public class ForDemo5 {
	/**
	 *      公鸡  母鸡     小鸡
             x   y   100-x-y
             5   3    1/3       100元如何买100只鸡
               穷举法：
             0   0    100       
                 1    99
                 2    98
	 */
	public static void main(String[] args) {
		for (int x = 0; x<=20; x++) {
			for (int y = 0; y<=33; y++) {
			    if(5*x+3*y+(100-x-y)/3==100&&(100-x-y)%3==0){
			    	System.out.println("公鸡为"+x+";"+"母鸡为"+y+";"+"小鸡为"+(100-x-y));
			    }
			}
		}
	}
}
