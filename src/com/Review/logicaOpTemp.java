package com.Review;

public class logicaOpTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear summer clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		
	
		
		
		
		int t=0;
	
		if(t>=100) {
			System.out.println("stsy inside its too hot");
		
		if(t>50 && t<99) {
			System.out.println("wear summer c");
		}else if(t>30 && t<49) {
			System.out.println("wear winter c");
		}else if (t>10 && t<29) {
			System.out.println("stay inside its too cold");
		}
		}else{
			System.out.println("call for help");
		}
		
		
		System.out.println("t");
		
		
		
	}

}
