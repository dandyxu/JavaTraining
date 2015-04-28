package com.dandy.day03;

public class Demo1 {

	public static void main(String[] args) {
        byte b=10;
        //b=128;                     超出了byte的取值范围
        short s=129;
        //s=40000;                   超出了short的取值范围
        int i=2100000000;
        //i=2200000000;              超出了int的取值范围
        long l=200000000000000000l;   //该数超出了int类型的取值范围，只要是整数，先默认使用int类型，再将该int类型赋给long l 
                                      //添加一个l，则声明l为long类型，则编译通过
        boolean isMan=true;
        boolean isKid=false;
        double d=3.66666666666666666666666666666666;
        System.out.println(d);
        float f=3.666666666666666666666666666666666f;         //小数默认使用的是double类型，必须加上f，才能声明成功；
        System.out.println(f);
        
        
	}
}
