package com.class6;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//what prints out if it is good weather to go for any activity
		
		
	//if the temperature is btw 40 degrees and 180 degrees and no rain----we will go 
		//otherwise----- we will not go hiking 
		//if temperature is btw 25 and 40 inclusive and snowing ----going snowboarding
		//otherwise are not going snowboarding
		//it if temp is more than 80 and sunny ---- go to the beach
		//otherwise ----not go to the beach
		
		//temp(>=40 <=80){
		//if(raining){
		//activity=watch movie;
		//}else{
        //activity=go hiking;
		//}
		//}else if(temp>=25 temp<40){
		//if(snowing){
		//activity=snowboarding;
		//}else{
		//do coding;
		//}
		//}else if(temp>80){
	//if(sunny) {
		//activity=go to the beach;
		//}else{
		//activity=more coding;
		//}
		//}else{
		//syso  ("plz enter different temp")
		//activity=unknown;
		//}
		
		Scanner scan;      
		boolean snow,rain,sun;
		int temp;
		String activity;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("plz enter a temp");
		temp=scan.nextInt();
		
	if(temp>=40 && temp<=80){
		System.out.println("is it raining?");
	rain=scan.nextBoolean();
				        if (rain){
				            activity="watch movie";            
				        }else {
				            activity="go hiking";
				        }
				}else if (temp >=25 && temp <40){
					System.out.println("is it snowing?");
					snow=scan.nextBoolean();
				    if (snow) {
				    	activity="snowboarding";
				    }else {
				        activity="do coding";
				    }
				}else if( temp >80){
					System.out.println("is it sunny?");
					sun=scan.nextBoolean();
				    if (sun) {
				        activity="go to the beach";
				    }else {
				        activity="more coding";
				    }
				}else {
				    System.out.println( "Please enter different temp");
				    activity="Uknown";
				}
	
	System.out.println(activity);
	
	


}}
