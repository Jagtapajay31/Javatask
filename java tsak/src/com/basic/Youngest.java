package com.basic;
/*
 * 2.condition---If the ages of Ram, Shyam and Ajay are input through the 
keyboard, write a program to determine the youngest of the 
three.
 */
public class Youngest {
	public static void main(String[] args) {
		int ram,shyam,Ajay;
		ram=16;
		shyam=15;
		Ajay=20;
		
		if (ram>shyam && ram>Ajay) {
			System.out.println("The youngest age is ram:"+ram);
		}
		else if(shyam>ram && shyam>Ajay) {
			System.out.println("The youngest age is shyam:"+shyam);
		}
		else if(Ajay>ram && Ajay>shyam) { 
			System.out.println("The youngest age is Ajay:"+Ajay);
		}
	}
}