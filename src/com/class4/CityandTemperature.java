package com.class4;

import java.util.Scanner;

public class CityandTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// ask user to enter a city and temperature in fahranheit
		//your program should convert f-----c
		//your program should say "the tempertaure in the city----is ----- "
		
		
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("please enter your city");
		cityName=myScanner.nextLine();
		
		
		System.out.println("please enetr a temperaturein fahrenheit");
		temp=myScanner.nextInt();
		//formula
        //(f-32)*5/9
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temperature in the city " +cityName+" is "+convertedTemp +"c");
		
		
				
		
	}

}
