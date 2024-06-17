package com.basic;
/*
 * loop-Write a program to enter the numbers till the user wants and 
at the end it should display the count of positive, negative and 
zeros entered
 */
public class PositiveNegativeZero {
	public static void main(String[] args) {
		int positive = 0, negative = 0, zeros = 0;
	       int number = 0;
		while(number == 1) {

	           System.out.println("Enter your number : ");

	           int number1 = 1;

	           if(number1 > 0) {

	               positive++;

	           } else if(number1 < 0) {

	               negative++;

	           } else {

	               zeros++;

	           }
	       System.out.println("Positives : "+ positive);

	       System.out.println("Negatives : "+ negative);

	       System.out.println("Zeros : "+ zeros);
	}
}
}