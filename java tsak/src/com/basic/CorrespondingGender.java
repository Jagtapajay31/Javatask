package com.basic;

import java.util.Scanner;

/*
 * Write a program to read gender(M/F) and print the corresponding gender using a switch statement
 */
public class CorrespondingGender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char gen;
		
		System.out.println("Enter Gender (m/M or F/f) :");
		gen = sc.next().charAt(0);

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
