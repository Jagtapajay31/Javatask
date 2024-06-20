package com.basic;
/*
 * 2.condition---A five-digit number is entered through the keyboard. Write a 
program to obtain the reversed number and to determine 
whether the original and reversed numbers are equal or not.
 */
public class ReversedNumbers {
	public static void main(String[] args) {
//		int number=12345, reverse =0;
//		while (number !=0){
//			int remainder = number % 10;
//			reverse = reverse *10+remainder;
//			number=number/10;
//			}
//		System.out.println("The reverse of the given number is: " + reverse);
//		if (number==number) {
//        System.out.println("Input Number Reversed Number are equal: "+number);
//		System.out.println("Input Number Reversed Number  are equal :"+number);
//		}else
//		{
//    	System.out.println("Input Number %d & Reversed Number %d are not equal"+number);
//		}
		int no = 12345,no1, rev, a, b, c, d, e;
		
		no1 = no/10;
		a = no%10;
		
		no1 = no1/10;
		b = no1%10;
		
		no1 = no1/10;
		c = no1%10;
		
		no1 = no1/10;
		d = no1%10;
		
		e = no1%10;
		
		rev = a*10000 + b*1000 + c*100 + d*10 + e*1;
		System.out.println("The reverse number is "+rev);
		if (no == rev) {
			System.out.println("No are equal");
		}else {
			System.out.println("No are not equal");
		}
	}
	}