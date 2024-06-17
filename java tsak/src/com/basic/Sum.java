package com.basic;
/*
 * If a five-digit number is input through the keyboard, write a 
program to calculate the sum of its digits.
 */

public class Sum {
	public static void main(String[] args) {
		int a,r1,r2,r3,r4,r5,b;
		a = 12345;
		
		
		r1=a%10;//12345%10 //5
		a=a/10;//1234
		r2=a%10;//
		a=a/10;
		r3=a%10;
		a=a/10;
		r4=a%10;
		a=a/10;
		r5=a%10;
		a=a/10;
		
		b=r1+r2+r3+r4+r5;
		
		System.out.println("sum of digits :" +b);
		
	}

}