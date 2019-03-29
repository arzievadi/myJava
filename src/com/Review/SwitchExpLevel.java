package com.Review;

import java.util.Scanner;

public class SwitchExpLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to found out the user level of experience
	    // Must use a switch statement with  a String variable named levelString and a int variable named level
	    
	// Beginner level should be 1
	// Intermediate level should be 2
	// Expert level should be 3
	
	
	int level;
	
	String levelS ;
	Scanner sc;
	sc=new Scanner(System.in);
	System.out.println("enter your level");
	level=sc.nextInt();
	
	
	
	
	switch (level){
	case 1:
		levelS ="beginner";
		break;
	case 2:
		levelS ="intermediate";
		break;
	case 3:
		levelS ="expert";
		break;
		
	default:
			levelS="invalid";
		
	}
	
	System.out.println("your level is  "+levelS);
	
	
	
	}

}
