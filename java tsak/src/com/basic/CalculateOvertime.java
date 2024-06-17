package com.basic;
/*
 * loop-Write a program to calculate overtime pay of 10 employees. 
Overtime is paid at the rate of Rs. 12.00 per hour for every 
hour worked above 40 hours. Assume that employees do not 
work for fractional part of an hour
 */
public class CalculateOvertime {
	public static void main(String[] args) {
		int i,hr = 45,bonus;
		for (i = 1; i <= 10; i++) {
			System.out.println("employes work :" +hr);
		}
		if (hr>40) {
			bonus=(hr-40)*12;
			System.out.println("bouns of employs over time :" +bonus);
		} else {
			System.out.println("employes not overtime");
			
		}
	}

}