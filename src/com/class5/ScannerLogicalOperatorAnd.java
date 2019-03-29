package com.class5;

import java.util.Scanner;

public class ScannerLogicalOperatorAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ask user to enter age and based on the age we wi---toddler
		//if age is older than 5 but les than 12---- kid
		//if age is older than 12 but less than 20 ---teenager
		//if age is older than 20 but less than 64---adult
		//if age is older or equal to 64---senior
		
		Scanner myScanner;           //declaring
		int age;                    //declaring
		
	 myScanner=new Scanner(System.in);
		System.out.println("please eneter your age");
		age=myScanner.nextInt();
		
		
		if(age>=1 && age<3) {
			System.out.println("yoyu are a baby");
		}else if (age<=3 && age<5) {
			System.out.println("you are a toddler");
			
		}else if (age>=5 && age<13) {
			
			System.out.println("you arew a kid");
		}else if(age >=13 && age<20) {
			System.out.println("you are a teenager");
			
		}else if(age >=20 && age<64) {
			System.out.println("you are an adult");
		}else {
			System.out.println("you are a senior");
		}
		
		
		
		
		
	}

}
