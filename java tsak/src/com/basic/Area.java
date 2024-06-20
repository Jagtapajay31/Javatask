package com.basic;
/*
 * condition---Given the length and breadth of a rectangle, write a program to 
find whether the area of the rectangle is greater than its 
perimeter. For example, the area of the rectangle with length = 5 
and breadth = 4 is greater than its perimeter
 */
public class Area {
	public static void main(String[] args) {
		double l, b, area, perimeter;
		l = 50;
		b = 4;
		area = l * b;
		perimeter = 2 * (l + b);
		if (area<perimeter) {
			System.out.println("Area of rectangle is greater than Perimeter");
		} else {
			System.out.println("Perimeter of rectangle is greater than Area");
		}
	}
}