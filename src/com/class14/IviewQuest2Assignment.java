package com.class14;

import java.util.Scanner;

public class IviewQuest2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 6. Write a Java Program to find whether a String is palindrome or not?

	7. Write a java program to check whether a given number is prime or not?

	8. Write a Java Program to print first 10 numbers of Fibonacci series.
		 * 
		 * 
		 * 
		 * 
		 * /
		 */
		//task6
		String second="";
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("plz enter any string-word");
		String first=sc.nextLine();
		
		for(int i=first.length()-1; i>=0;i--) {
			System.out.print((first.charAt(i)));
		
		}if(first.contentEquals(second)) {
			System.out.println("palindrome");
		}else {
			System.out.println(" not palindrome");
		}
		System.out.println("----------end of 6--------------------");
		
		//task7 prime num should be divisible by one 
		//and by itself only
	
	
	
	
	
	
	
	}

}
