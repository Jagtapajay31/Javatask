package com.basic;
/*
 * Ramesh’s basic salary is input through the keyboard. His 
dearness allowance is 40% of basic salary, and house rent 
allowance is 20% of basic salary. Write a program to calculate 
his gross salary
 */
public class GrossSalary {
	public static void main(String[] args) {
		int Basic_salary = 40000;
		int da= 40000*40/100;
		int hra= 40000*20/100;
		
		System.out.println("Ramesh’s gross salary is: "+(Basic_salary+da+hra));
		}
}