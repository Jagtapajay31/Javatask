package com.basic;

import java.util.Scanner;

/*
 * Write a program to Check whether the number is even or odd using switch statement
 */
public class EvenOddSwitch {
	public static void main(String[] args) {
		int number;
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		
		switch (number=sc.nextInt()% 2) {
		case 0:
			System.out.println("This is Even Number");
			break;
		case 1:
			System.out.println("This is Odd Number");
			break;
		default:
			System.out.println("Unexpected Number");
			break;
		}
	}
}