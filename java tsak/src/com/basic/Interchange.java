package com.basic;

public class Interchange {
	public static void main(String[] args) {
		int c,d,temp;
		c=2;
		d=1;
		
		System.out.println("before swapping c:" +c+ " d:" +d);
		
		temp=c;
		c=d;
		d=temp;
		
		c= c^d;
		d= c^d;
		c= c^d;		
		 
		c = c+d;//30
		d = c-d;//30-20=10
		c = c-d;//30-10=20
		
		c=c*d;//2
		d=c/d;//1
		c=c/d;//2
		
		System.out.println("after swapping c:" +c+ " d:" +d);

		
		//System.out.println("value of interchange c :" "+c +" "\n value of interchange d :"+d);
		
	}

}