package com.class10;

import java.util.Scanner;

public class RedoExsNestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Ask user to enter the item they want to buy and  the price for the item. 
		//Then ask user to pay for it.
		//Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
		//Whenever user done with payments tell them "Thank you for shopping!"
	
		Scanner scan;
	String item;
	double price;
	double payment;
	double totalPayment = 0 ;
	double balance;
	double change;
	
	scan=new Scanner(System.in);
	System.out.println("plz enter your item");
	
	item=scan.nextLine();
	
	System.out.println("plz enter the item price");
	price=scan.nextDouble();
	
	do {
		System.out.println("plz enter payment amount");
		
		payment=scan.nextDouble();
	
		totalPayment=totalPayment +payment;
	
		balance=price-totalPayment;
		
		if(totalPayment>price) {
			change=totalPayment-price;
			System.out.println("plz take your change");
			break;
		
		}else if(totalPayment<price) {
			balance=price-totalPayment;
			System.out.println("plz enetr more $ "+balance); 
			
		
		}
		}while(totalPayment!=price);
	        System.out.println("thank you for shopping!");
	}

}
