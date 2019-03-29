package com.class6;

import java.util.Scanner;

public class switchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prompt user to enter their country 
		//based on the country----specify favorite food
		
		//
		
		Scanner scan;
		String country;
		String favoritefood;
	 
		scan=new Scanner(System.in);
		System.out.println("which country are u from");
		country=scan.nextLine();
	
		switch(country) {
		
		
		case "usa":
			favoritefood="burger";
			break;
		case"afghanistan":
			favoritefood="palau";
			break;
		case"russia":
		favoritefood="pelmeni";
		break;
		case"italy":
		favoritefood="pasta";
		break;
		case"turkey":
		favoritefood="baklava";
		case"morocco":
		favoritefood="couscous";
		break;
		case"kazakhstan":
		favoritefood="beshparmak";
		break;
		case "pakistan":
		favoritefood="biryani";
		default:
			favoritefood="default";
		
		}
		
		
System.out.println("your favorite food "+favoritefood);

		
		
		
		
		
	}
	
	
	
	
	

}
