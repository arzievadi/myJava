package com.Review;

public class SwitchdaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write as program that will display what day of the week an also the weekend
		
		
				int input=6;
				String output;
				
			switch(input) {
			case 1:
				output="monday";
				break;
			case 2:
				output="tuesd";
				break;
			case 3:
				output="wedn";
				break;
			case 4:
				output="thursd";
				break;
			case 5:
				output="frid";
				break;
			case 6:
				output="sat";
				break;
			case 7:
				output="sun";
				break;
				default:
					output="enter valid number";
				
	}
System.out.println(output);
}}
