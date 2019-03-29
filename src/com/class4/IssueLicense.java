package com.class4;

import java.util.Scanner;

public class IssueLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.println("enter your age plz");
		int age = scan.nextInt();
		if (age>=18) {
			System.out.println("it will be issued");
			
		}else {
			System.out.println("it will Not be issued");
		}
		
		
		
		
		
	}

}
