package com.basic;
/*
 * loop-Write a program to print all the ASCII values and their 
equivalent characters using a while loop. The ASCII values 
vary from 0 to 255
 */
public class Ascii {
	public static void main(String[] args) {
		for (int i = 0; i <= 255; i++) {
			System.out.println("Ascii value :"+ (char)i + "  =  " +i);
		}
//		Scanner sc=new Scanner(System.in);
//		int n;
//		System.out.println("enter char :");
//		n =sc.nextInt();
//		
//		for (int i = 0; i <= n; i++) {
//			System.out.println("Ascii value :"+ (char)i + "  =  " +i);
//		}
	}

}
