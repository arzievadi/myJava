package com.class5;

public class AndLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// if number btw 1-10-----number is small
		//if number btw 11-100-----number is medium
		//if number is btw 101-1000----number is large
		
		
		
		int num=15;
		
	//true and false----false
		if(num>=1 && num<=10) {
		System.out.println("number is small");
		
	//true and true----true(this line going to be executed coz its true)
		} else if (num>=11 && num<=100) {
			System.out.println("number is medium");
			
	//false and true---false
		}else if(num>=101 && num <=1000) {
			System.out.println("number is large");
		
		}else {
			System.out.println("number is out of range");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
