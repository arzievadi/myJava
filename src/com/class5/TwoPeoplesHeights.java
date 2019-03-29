package com.class5;

import java.util.Scanner;

public class TwoPeoplesHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//propmpt  persons height in inches
		//short under 5 feet ;
		//medium 5-6 feet;
		//tall 6 feet-over;
		
		int h=15;
		
		
		if(h<5) {
			System.out.println("short");
			
		}else if(h>=5 && h<6) {
			System.out.println("medium");
		}else{
			System.out.println("tall");
			}
		
	
	Scanner inc=new Scanner (System.in);
	System.out.println("please eneter your height");
	int height=inc.nextInt();
	
	
	if (height<5) {
		System.out.println("short");
	}else if(height==5 || height<6) {
	
	}else if(height>=6) {
		System.out.println("tall");
	}else {
		System.out.println("please enter the valid number");
	}
	
	
	
	
	
	
	
	}
	
	
	

}
