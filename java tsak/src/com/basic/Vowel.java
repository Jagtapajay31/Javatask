package com.basic;

public class Vowel {
	public static void main(String[] args) {
		char ch='a';
//		int choice = 2;
				
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel!!");
			break;

		default:
			System.out.println("Consonant");
			break;
			}
		}
	}