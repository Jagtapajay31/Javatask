package com.basic;
/*
 * If the marks obtained by a student in five different subjects 
are input through the keyboard, find out the aggregate marks 
and percentage marks obtained by the student. Assume that 
the maximum marks that can be obtained by a student in each 
subject is 100.
 */
public class Result {
	public static void main(String[] args) {
		int English, Maths, Scinece, Physic, Chemistry;
		English=88;
		Maths=84;
		Scinece=89;
		Physic=92;
		Chemistry=90;
		
		
		System.out.println("Mark :"+(English+Maths+Scinece+Physic+Chemistry));
		System.out.println("percentage :"+(English+Maths+Scinece+Physic+Chemistry)*100/500f);
	}

}
