package com.class10;

import java.util.Scanner;

public class RedoNestedLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*6. Ask a user to input a leap year. 
	 * Give the user 10 chances to enter a correct leap year.
      As soon as the user enters the correct leap year exit the loop.
	 * /leap year is the year that 
	 */
	
	Scanner scan;
	int year;
	scan=new Scanner(System.in);
	
	for (int i=0;i<10;i++) {
	System.out.println("plz enter a guessed leap year ");
		year=scan.nextInt();
		//if year is divisible by 400----leap year
		//if year is divisible by 100-----not a leap year
		//if year is divisible by 4-------a leap year
		/*(year%400==0 || ((year%==0)&& (year%100=0))
		 * /
		 */
		if (year%400==0) {
			System.out.println("year is the leap year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("the year is the leap year");
		}else {
			System.out.println("the year is Not a leap year");
		}
	}
	
	
	}

}
