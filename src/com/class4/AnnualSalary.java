package com.class4;

import java.util.Scanner;

public class AnnualSalary {

	public static void main (String [] args) {
		
		int workY=5;
		int annualSalary=50000;
		
		if(workY>5) {
			System.out.println("eligible for bonus");
			    if(annualSalary>50000) {
				 System.out.println("you r eligible for 5000 bonus");
				
			    }else {
				 System.out.println("you r eligible for 3000");
			}
		}else {
			System.out.println("you r not eligible for bonus");
		}
		
		//2////
		int workY1=5;
		int annualSalary1=50000;
		if(workY1>5) {
			System.out.println("eligible for bonus");
		}else {
			System.out.println("not eligible for bonus");
			if(annualSalary1>50000) {
				System.out.println("you will get a bonus of 5000");
				
			}else {
				System.out.println("you will get a 3000 bonus");
				
				
			}
			
		}
		
		//
		Scanner scanner=new Scanner(System.in);
		
		
		
		
		
		
	}
}
