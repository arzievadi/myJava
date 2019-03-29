package com.Review;

import java.util.Scanner;

public class Class2IfElseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	///////////////////// if statement
				//write a program where int x is greater than int y
				//print out x is greater than y"
				
				int x=5;
				int y=4;
				
				if (x>y) {
					
					System.out.println("x is greater than y");
					}
				
				
////////////////// if else statement 
				// write a program to find if a number is even or odd
				//print out  "my number must be even " or "my number must be odd"
				//must use if else
				
				int  a=6;
				if(a%2==0) {
					
			System.out.println(a +" is an even number");
				}
				else {
				System.out.println("my number must be odd");
				}
				
				
				
//////////////write a program to find if the variable time is either morning or the afternoon or the evening using military time
				//print out "good morning" or "good day"or "good evening"
				//must use if then a else if and lastly else
				//(military time)
				//0700=7am
				//1205=lunch
				//1800=6pm
				
				
				
				int b=0700;
				if (b<=0700) {
					System.out.println("good morning");
				}
				else if (b<=1205) {
					System.out.println("good day");
				}
				else {
					System.out.println("goood evening");
					}
				
			

////////////////NESTED IF(sunny nested in the summer)
			//write a program with two boolean values summer and sunny
			//as a family we go on vacation Only when its the sum mer time.once we are on vazation we like to go to the beach Only when its sunny
			
	boolean summer=true;
	
	boolean sunny=false;
 
	
	
	if (summer) {
		
		System.out.println("it is summer");
		
		if (sunny) {
			System.out.println("we r going to the beach");
		}else {
			System.out.println("we r not going to the beach");
		}
		}
	else {
		System.out.println("its not the summmer");
}	
			{
			
/////////////////////SCANNER
				
				//Write a program to find out a persons name,
				//gender,
				//age,
				//mobile number
				//ex.print out system.out.println("name:"+ name);
				
				
				String name ="";
				String gender;
				int age;
				long mobileNumber;
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter your name");
				name=sc.nextLine();
				System.out.println("name "+name);
				
				 
				System.out.println("enter your gender");
				gender=sc.nextLine();
				System.out.println("gender "+gender);
				
			   
			     System.out.println("enter your age");
			     age=sc.nextInt();
			     System.out.println("age "+age);
			     
			   
			     System.out.println("enter mobile number");
			     mobileNumber=sc.nextLong();
			     System.out.println("mobileNumber "+mobileNumber);
				}}}
			
			
	


