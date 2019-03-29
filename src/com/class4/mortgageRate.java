package com.class4;

public class mortgageRate {

	public static void main(String[] args) {
		

	double mR=4.5;
	
	int mP=200000;
	
	if(mR>4.5)
	{
		System.out.println("will not buy a house");
		
	}else {
		System.out.println("will buy a house");
	}if (mP>200000) {
		System.out.println("will take loan");
		
	}else {
		System.out.println("will pay by cash");
	}
		
		//2////
	double mR1=4.8;
	int mP1=300000;
	
	
	if(mR1<4.5) {
		System.out.println("i will buy a house");
		if(mP1<200000) {
	System.out.println("i am paying with cash")	;
	
	}else {
		System.out.println("i will take a loan");
		
		}
	}else {
		System.out.println("i will not buy a hosue");
		
	}
	
		
	
		
	}
}
