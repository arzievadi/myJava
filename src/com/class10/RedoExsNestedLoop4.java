package com.class10;

import java.util.Scanner;

public class RedoExsNestedLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*5.
Write a guessing game where the user has to guess a secret number between 1 and 20. 
After every guess input, the program tells the user whether their number was too large or too small. 
The program will keep asking the user to enter the number 
until he finds the correct number. 
When the correct answer is found the system should display "Congratulations!!. You got it!".
 * 
 * /
 */
	Scanner scan;
	int secret,usernumber;
	
	secret=13;
	scan=new Scanner(System.in);
	System.out.println("plz enter any number from 1 to 20");
	do {
		
	usernumber=scan.nextInt();
	if (usernumber<secret) {
		System.out.println("num is too small,try again");
	}else if (usernumber>secret) {
		System.out.println("num is too large,try again");
	
	}
		
		
	}while(secret!=usernumber)	;
		
		System.out.println("congrats you got it!");
		
	}

}
