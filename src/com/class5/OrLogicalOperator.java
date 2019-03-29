package com.class5;

public class OrLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we have 7 days a week 
		//if days are from 1-5-----weekday
		//if days are from 6-7---weekend
	//otherwise "not a valid day"
		
		int day=5;//declaring value
		//false   OR   false OR false OR  false  OR  true----true
		if(day==1 || day==2 || day==3 || day==4 || day ==5 ) {
			System.out.println("it is a weekday");
			//  false  OR   false----false
		}else if (day==6 || day==7) {
			System.out.println("it is a weekend");
			
		}else {
			System.out.println("not a valid day");
		}
		
		
		
	}

}
