package com.class4;

import java.util.Scanner;

public class loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num1,num2;
	
	num2=20000;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("what amount of loan do you need ?");
	
	num1=scan.nextInt();
	System.out.println("");
	if (num1<num2) {
		System.out.println("approved");
		
	}else {
		System.out.println("not approved try one more time");
		}
	
	
	
	}

}
