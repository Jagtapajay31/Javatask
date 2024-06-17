package com.basic;
/*
 * Write a program to Find the number of days in a month using a switch statement
 */
public class DayMonthSwitch {
	public static void main(String[] args) {
		int month=11;
		int days;
		
	    switch (month) {
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	      days = 30;
	      break;

	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	      days = 31;
	      break;

	    case 2:
	      days = 28;
	      break;

	    default:
	      days = 0;
	      break;
	    }

	    if (days != 0)
	      System.out.printf("Number of days in %d month is: %d\n", month, days);
	    else
	      System.out.printf("You have entered an invalid month!!!\n");
		
	}
}
