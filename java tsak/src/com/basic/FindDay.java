package com.basic;

public class FindDay {
	static void findDay(int Y, int B)
	  {
	    int lyear, rest, totaldays, day;
	 
	    // Count years between
	    // years Y and B
	    Y = (Y - 1) - B;
	 
	    // Count leap years
	    lyear = Y / 4;
	 
	    // Non leap years
	    rest = Y - lyear;
	 
	    // Total number of days in the years
	    // lying between the years Y and B
	    totaldays = (rest * 365)
	      + (lyear * 366) + 1;
	 
	    // Actual day
	    day = (totaldays % 7);
	 
	    if (day == 1)
	      System.out.println("Monday");
	 
	    else if (day == 2)
	      System.out.println("Tuesday");
	 
	    else if (day == 3)
	      System.out.println("Wednesday");
	 
	    else if (day == 4)
	      System.out.println("Thursday");
	 
	    else if (day == 5)
	      System.out.println("Friday");
	 
	    else if (day == 6)
	      System.out.println("Saturday");
	 
	    else if (day == 0)
	      System.out.println("Sunday");
	 
	    else
	      System.out.println("INPUT YEAR IS WRONG!");
	  }
	 
	  // Driver code
	  public static void main(String[] args)
	  {
	    int Y = 2024, B = 1900;
	    findDay(Y, B);
	  }
	}
	 
	// This code is contributed by code_hunt.
