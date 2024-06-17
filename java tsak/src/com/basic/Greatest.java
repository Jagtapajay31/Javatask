package com.basic;
/*
 * Write a program to find the greatest of the three numbers 
entered through the keyboard using conditional operators
 */
public class Greatest {
	public static void main(String[] args) {
		int a=1010,b=101,c=100;
		if (a>b && a>c) {
			System.out.println("largest number a");
		}
		else if (b>a && b>c) {
			System.out.println("largets number b");
		}
		else if (c>a && c>b) {
			System.out.println("larget number c");
		}
		else {
			System.out.println("all number are same dencity");
		}
	}

}
