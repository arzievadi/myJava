package com.Review;

import java.util.Scanner;

public class LOScanner {
public static void main(String [] args) {
	//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
    // Age should NOT be greater than 18  print out  Too Young
    // Age should be between 18 and 35 inclusive  print out Young Person
    // Age should greater 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
    // If the age is greater than 100 print print out  You are too Old
    // Create an int variable named age
    // Must use a Scanner

	
	int age;
	Scanner sc;
	String output= "too young,young person,middle age,too old";
	
	sc=new Scanner(System.in);
	System.out.println("please eneter your age");
	age=sc.nextInt();
	
	if(age<18) {
		output= "too young";
	}else if (age>=18 && age<=35) {
		output="young person";
	}else if(age>=36 || age<=99) {
		output="middle age";
	}else if(age>=100) {
		output="too old";
	}
	
System.out.println(output);
	

	
	
	
	
	
	
}
}
