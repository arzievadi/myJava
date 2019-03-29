package com.class4;

public class NestedifAgain {

	public static void main(String[] args) {
		
		//declare a variable for gpa and having a diploma
		//if user has a diploma-------congrats
		//if gpa is higher 3.5--------hire person
		//else do not hire
		
		double gpa=3.6;//more or less gpa
		double expectedGpa=3.7;
		boolean hasDiploma=true;//either false
		
		
		if (hasDiploma) {
			System.out.println("congratulations");
			
			if(gpa<expectedGpa) {
		System.out.println("you are hired");
			}else {
				System.out.println("we can not hire you");
			}
			} else {
				System.out.println("please get your degree");
				
			}
		
	
	}}
