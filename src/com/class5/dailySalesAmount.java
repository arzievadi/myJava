package com.class5;

import java.util.Scanner;

public class dailySalesAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write java program to ask user enter  daily sales amount
	//based on the sales range comission will be different 
		//ex; sales	 is<100----comission=2
		
		//sales more than 100 and less than 200=5
		
		Scanner scan;
		int sales;
		int comission;
		
		scan=new Scanner(System.in);
		
		System.out.println("plz enter sales amount");
		sales=scan.nextInt();
		
		if(sales>0 && sales<100) {
			comission=2;
		}else if(sales>=100 && sales<200) {
			comission=5;
		}else if(sales>=200 && sales<500) {
			comission=10;
		}else if(sales>=500){
			comission=20;
		}else {
			comission=0;
		}
		
		
		System.out.println("your comission is "+comission);
	}

}
