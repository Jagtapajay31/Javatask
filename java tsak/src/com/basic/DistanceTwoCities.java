package com.basic;
/*
 * The distance between two cities (in km.) is input through the 
keyboard. Write a program to convert and print this distance 
in meters, feet, inches and centimeter.
 */
public class DistanceTwoCities {
	public static void main(String[] args) {
		float m,km,cm,i,ft;
		km = 5;
		m = km*1000;
		cm = m*100;
		i = cm/2.54f;
		ft = i/12;
		
		System.out.println("Meters : "+m);
		System.out.println("Centimeters : "+cm);
		System.out.println("Inches : "+i);
		System.out.println("Feet : "+ft);
	}

}
