package com.basic;
/*
 * loop-Two numbers are entered through the keyboard. Write a 
program to find the value of one number raised to the power 
of another
 */
public class Power {
	public static void main(String[] args) {
		int Power=3;
		int Base=1;
		double result = 1;
		
		for (int i = 1; i <= Power; i++) {
			System.out.print(i);
			result = result*Base;	
		}
		System.out.println(Base + " raised to the power of " +Power + " is " + result);	
	}
}