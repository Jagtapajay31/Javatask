package com.basic;
/*
 * loop-Write a program for a matchstick game being played between 
the computer and a user. Your program should ensure that the 
computer always wins. Rules for the game are as follows: 
− There are 21 matchsticks. 
− The computer asks the player to pick 1, 2, 3, or 4 
matchsticks. 
− After the person picks, the computer does its 
picking. 
− Whoever is forced to pick up the last matchstick 
loses the game
 */
public class Matchsticks {
	private static final int N = 0;

	@SuppressWarnings("null")
	public static void main1(String[] args) {
		for (int i = 0; i < N; i += 1) 
	    {
	        int[] arr = null;
			System.out.print(5 - arr[i] + " ");
	    }
	    System.out.println();
	}
	 
	// Driver code
	public static void main(String[] args) 
	{
	    int arr[] = {3, 4, 2, 2};
	 
	    int N = arr.length;
	 
	    TwentyoneMatchstick(arr, N);
	}

	private static void TwentyoneMatchstick(int[] arr, int n) {
		// TODO Auto-generated method stub
		
	}
	}