package com.basic;
/*
 * Write a program to read a weekday number and print weekday name using switch statement
 */
public class WeekdayNumber {
	public static void main(String[] args) {
		int daynum =7;
		
		switch (daynum) {
		case 0:
			System.out.printf("Sunday");
			break;
		case 1:
			System.out.printf("Monday");
			break;
		case 2:
			System.out.printf("Tuesday");
			break;
		case 3:
			System.out.printf("Wednesday");
			break;
		case 4:
			System.out.printf("Thursday");
			break;
		case 5:
			System.out.printf("Friday");
			break;
		case 6:
			System.out.printf("Saturday");
			break;
		default:
		System.out.println("Invalid Number");
		break;
		}
	}
}