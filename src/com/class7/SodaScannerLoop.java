package com.class7;

import java.util.Scanner;

public class SodaScannerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
		//ask user to pay for soda 
		//keep asking user to pay for soda until entered price is equal to 1.99	
		//after user got a right amount print"please enjoy your soda"
	 
	
		
		Scanner scan;
	double price;
		
		scan=new Scanner (System.in);
		 
		do {
			System.out.println("please pay for soda");
		price=scan.nextDouble();
		}
		while(price!=1.99);
			
				System.out.println("please enjoy your soda");
				}
		
		
		
		}
		 
		
		
	


