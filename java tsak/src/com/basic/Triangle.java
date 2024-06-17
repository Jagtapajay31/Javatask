package com.basic;
/*
 * condiiton---Write a program to check whether a triangle is valid or not, 
when the three angles of the triangle are entered through the 
keyboard. A triangle is valid if the sum of all the three angles 
is equal to 180 degrees
 */
public class Triangle {
	public static void main(String[] args) {
		int a = 60, b= 40, c= 80, sum;
		sum = a + b + c; 
		if(sum == 180 && a > 0 && b > 0 && c > 0) 
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}

}
