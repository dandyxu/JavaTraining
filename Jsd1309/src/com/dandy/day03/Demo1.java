package com.dandy.day03;

public class Demo1 {

	public static void main(String[] args) {
        byte b=10;
        //b=128;                     ������byte��ȡֵ��Χ
        short s=129;
        //s=40000;                   ������short��ȡֵ��Χ
        int i=2100000000;
        //i=2200000000;              ������int��ȡֵ��Χ
        long l=200000000000000000l;   //����������int���͵�ȡֵ��Χ��ֻҪ����������Ĭ��ʹ��int���ͣ��ٽ���int���͸���long l 
                                      //���һ��l��������lΪlong���ͣ������ͨ��
        boolean isMan=true;
        boolean isKid=false;
        double d=3.66666666666666666666666666666666;
        System.out.println(d);
        float f=3.666666666666666666666666666666666f;         //С��Ĭ��ʹ�õ���double���ͣ��������f�����������ɹ���
        System.out.println(f);
        
        
	}
}
