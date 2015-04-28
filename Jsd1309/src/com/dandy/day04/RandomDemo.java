package com.dandy.day04;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		   Random rd=new Random();
		   //int i=rd.nextInt(33)+1;                     //[1,33]
		   //System.out.println(i);
		    
		   //int i=rd.nextInt(26)+97;                      //[97,122]
		   //int i=rd.nextInt(26)+'a';                      //[97,122]
		   char c=(char)(rd.nextInt(26)+'a');
		   System.out.println(c);
		   
	}

}
