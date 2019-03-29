package com.class10;

import java.util.Scanner;

public class RedoExrsNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range prints the sum of the even and odd integers.
	
	
	
	Scanner input=new Scanner (System.in);
	int startPoint;
	int endPoint;
	
	int sumofEven=0;
	int sumofOdd=0;
	
	
	System.out.println("eneter your starting point: ");
	startPoint=input.nextInt();
	System.out.println("enter your ending point: ");
	endPoint=input.nextInt();
	
	if (startPoint<endPoint) {
		for (int a=startPoint; a<=endPoint; a++) {
			if (a%2==0) {
				sumofEven+=a;
			
			}
			else{
				sumofOdd+=a;
				}
			}System.out.println("your sum of even numbers is: "+sumofEven);
			System.out.println("your sum of odd numbers is: "+sumofOdd);
	}
		
	}  
	}


