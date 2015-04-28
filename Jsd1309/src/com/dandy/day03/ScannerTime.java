package com.dandy.day03;

import java.util.Scanner;

public class ScannerTime {
//该功能为将一个时间分为小时+分钟+秒的格式，在控制台输入7199秒，打印出1小时59分59秒出来
	
	public static void main(String[] args) {
		Scanner time=new Scanner(System.in);
        System.out.print("请输入一个时间，单位为秒：");
        int i=time.nextInt();                         //能够扫描我们输入的那个数
        int hour=i/3600;                              //得到小时数
        int min=i/60%60;                              //得到分钟数
        int sec=i%60;                                 //得到秒数
        System.out.println(i+"秒="+hour+"小时"+min+"分"+sec+"秒");
        
	}
}
