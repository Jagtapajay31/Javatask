package com.basic;
/*
 * The length & breadth of a rectangle and radius of a circle are 
input through the keyboard. Write a program to calculate the 
area & perimeter of the rectangle, and the area & 
circumference of the circle
 */
public class CalculateArea {
	public static void main(String[] args) {
		int l, b, area, perimeter, redius;
		float circumferences;
		l = 4;
		b = 10;
		area = l * b;
		perimeter = 2 * (l + b);
		redius = 10;
		circumferences = 2*22/7*redius;
		
		System.out.println("area :" +area);
		System.out.println("perimeter :"+perimeter);
		System.out.println("circumferences :"+circumferences);
	}

}
