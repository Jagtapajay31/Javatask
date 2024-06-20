package com.basic;
import java.util.Scanner;

/*
 * loop-Write a program to print out all Armstrong numbers between 
1 and 500. If sum of cubes of each digit of the number is 
equal to the number itself, then the number is called an 
Armstrong number. For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 
* 5 ) + ( 3 * 3 * 3 ) 
 */
import com.basic.Interchange;
public class ArmstrongNnumber {
	public static void main(String[] args) {    
			int num,temp, digits=0, last=0, sum=0;   
			Scanner sc= new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			num=sc.nextInt();  
			if(isArmstrong(num))  
			{  
				System.out.print("Armstrong ");  
			}  
			else   
			{  
				System.out.print("Not Armstrong ");  
			}  
		int n = 0;
		temp=n;   
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
			temp = n;   
			while(temp>0)   
		{   
				last = temp % 10;   
				sum +=  (Math.pow(last, digits));   
				temp = temp/10;   
		}  
		if(n==sum)   
		return;      
		else return;   
	}
//		int power(int x, long y){
//	        if (y == 0)
//	            return 1;
//	        if (y % 2 == 0)
//	            return power(x, y / 2) * power(x, y / 2);
//	        return x * power(x, y / 2) * power(x, y / 2);
//	}
//
//	    int order(int x)
//	    {
//	        int n = 0;
//	        while (x != 0) {
//	            n++;
//	            x = x / 10;
//	        }
//	        return n;
//	    }
//	 
//	    boolean isArmstrong(int x)
//	    {
//	        int n = order(x);
//	        int temp = x, sum = 0;
//	        while (temp != 0) {
//	            int r = temp % 10;
//	            sum = sum + power(r, n);
//	            temp = temp / 10;
//	        }
//	        return (sum == x);

	private static boolean isArmstrong(int num) {
		// TODO Auto-generated method stub
		return false;
	}
		}

