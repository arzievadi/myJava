package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		// if user younger than 16;user<16 not allowed to work
		//Otherwise allow to work
		//-if user is younger than 64; user<64----go to work
		//otherwise if less than 64;user<64-------enjoy your life
		
		
		int age=18;//older or younger
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			
			System.out.println("you are too young no work for you");
			
		}else {
			System.out.println("you are eligible to work");
			
			
			if (age<retirementAge) {
				System.out.println("go to work");
				
			}else {
				System.out.println("please enjoy your life");
				
			}
		}
		
		
		
		
		
	}

}
