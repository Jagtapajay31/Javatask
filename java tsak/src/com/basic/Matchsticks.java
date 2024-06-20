package com.basic;

import java.util.Scanner;

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
public class Matchsticks 
{
	public static void main(String[] args) 
	{
		int numsticks=21;
		System.out.println("would you like to go first? (y/n)");
		Scanner sc=new Scanner(System.in);
		Scanner input;
		String goFirst= input.nextLine();
		Scanner take=new Scanner(System.in);
		int numTake=0;
		while (numsticks > 0) 
		{
			if (goFirst.equals("y") || goFirst.equals("Y")) 
			{
				System.out.println("There are "+ numsticks + "sticks");
				System.out.println("how many sticks to take (1 or 2)");
//				numTake = numTake.nextLine();
				if (numTake>2) 
				{
					numTake=2;
				} else if(numTake<1)
				{
					numTake=1;
				}
				numsticks = numsticks - numTake;
				
				if (numsticks<=0) 
				{
					System.out.println("you lose!");
				} else 
				{
					if ((numsticks-2)%3==0 || numsticks-2==0) 
					{
						numTake=1;
					} else 
					{
						numTake=2;
					}
					System.out.println("computer take"+ numTake + "sticks");
					numsticks = numsticks - numTake;
					
					if (numsticks <=0) 
					{
						System.out.println("you win!");
					}
				}
			}
			else 
			{
				if ((numsticks-2)%3==0 || numsticks-2==0) 
				{
					numTake=1;
				} else 
				{
					numTake=2;
				}
				System.out.println("computer take"+ numTake + "sticks");
				numsticks = numsticks - numTake;
				
				if (numsticks <=0) 
				{
					System.out.println("you win!");
				}
				else 
				{
					System.out.println("There are "+ numsticks + "sticks");
					System.out.println("how many sticks to take (1 or 2)");
//					numTake = take.nextLine();
					if (numTake>2) 
					{
						numTake = 2;
					} else if(numTake<1)
					{
						numTake=1;
					}
					numsticks = numsticks - numTake;
					
					if (numsticks<=0)
					{
						System.out.println("you lose!");
					}
				}
			}
		}
	}
}