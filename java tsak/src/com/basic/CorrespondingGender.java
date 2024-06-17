package com.basic;
/*
 * Write a program to read gender(M/F) and print the corresponding gender using a switch statement
 */
public class CorrespondingGender {
	public static void main(String[] args) {
		char gen = 1;

		switch (gen)
		{
		case 'M':
		case 'm':
			System.out.printf("Male");
			break;
		case 'F':
		case 'f':
			System.out.printf("Female");
			break;
		default:
			System.out.printf("Unspecified Gender.");
			break;
			}
		}
}
