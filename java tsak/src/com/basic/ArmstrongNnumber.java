package com.basic;
/*
 * loop-Write a program to print out all Armstrong numbers between 
1 and 500. If sum of cubes of each digit of the number is 
equal to the number itself, then the number is called an 
Armstrong number. For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 
* 5 ) + ( 3 * 3 * 3 ) 
 */
import com.basic.Interchange;
public class ArmstrongNnumber {
	public static int main(String[] args) {
		int power(int x, long y){
	        if (y == 0)
	            return 1;
	        if (y % 2 == 0)
	            return power(x, y / 2) * power(x, y / 2);
	        return x * power(x, y / 2) * power(x, y / 2);
	}

	    int order(int x)
	    {
	        int n = 0;
	        while (x != 0) {
	            n++;
	            x = x / 10;
	        }
	        return n;
	    }
	 
	    boolean isArmstrong(int x)
	    {
	        int n = order(x);
	        int temp = x, sum = 0;
	        while (temp != 0) {
	            int r = temp % 10;
	            sum = sum + power(r, n);
	            temp = temp / 10;
	        }
	        return (sum == x);
	}
}
}