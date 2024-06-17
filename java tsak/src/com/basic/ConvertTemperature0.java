package com.basic;
/*
 * Temperature of a city in Fahrenheit degrees is input through 
the keyboard. Write a program to convert this temperature 
into Centigrade degrees.
 */
public class ConvertTemperature0 {
	public static void main(String[] args) {
		float Fahrenheit, Centigrade;
		Fahrenheit = 45;
		Centigrade = ((Fahrenheit-32)*5)/9;
		
		System.out.println("temperature into Centigrade degrees :"+Centigrade);
		}

}