package com.basic;
/*
 * Write a program to Check whether the number is even or odd using switch statement
 */
public class EvenOddSwitch {
	public static void main(String[] args) {
		int number=1;
		switch (number % 2) {
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