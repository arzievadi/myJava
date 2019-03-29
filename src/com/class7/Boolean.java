package com.class7;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a boolean variable  workDay and assign true value
		// create int variable day and assign it to 1 
		//as long as it is workDay print -----"i need a day off" and increment day 
		//day once day is 6----- your condition for your loop should become false
	
	
	boolean workDay=true;
	
	int day=1;
	
	 while(workDay) {
		
		    if(day==6) {
			System.out.println("i Dont need a day off");
			 workDay=false;
		   }else {
			 System.out.println("i need a day off");
		 }
		 day++;
	 }
	
	}
	
}
