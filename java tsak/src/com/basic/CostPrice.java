package com.basic;
/*
 * If the total selling price of 15 items and the total profit earned 
on them is input through the keyboard, write a program to 
find the cost price of one item.
 */
public class CostPrice {
	public static void main(String[] args) {
		
		float cp,sp,pp;
		sp = 1000;
		pp = 200;
		cp = (sp-pp)/15;
		System.out.println("The cost price of one item :" +cp);
		
	}

}
