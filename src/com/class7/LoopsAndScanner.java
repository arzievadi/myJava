package com.class7;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prompt a user to ask the name 3 times and print"you are doing great "
		
		
		
		Scanner scan;
		String name;
		int a=1;
		scan=new Scanner(System.in);
		
				
				
		while(a<=3) {
			System.out.println("plz enter your name");
		name=scan.nextLine();
				
		System.out.println("you are doing great "+name);	
		a++;
		
		
		}
		
	
		
		
		
		
		
	}

}