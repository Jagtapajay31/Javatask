package com.basic;
/*
 * Condition- If cost price and selling price of an item is input through the 
keyboard, write a program to determine whether the seller has 
made profit or incurred loss. Also determine how much profit 
he made or loss he incurred
 */
public class ProfitLoss {
	public static void main(String[] args) {
		int cp=100, sp=120, pp, lp;
		if(sp>cp) {
			pp = sp - cp;
			System.out.println("Profit price :" +pp);
		}else if(sp<cp) {
			lp = cp-sp;
			System.out.println("Loss Price");
			}
		else {
			System.out.println("No profit No loss");
		}
	}

}
