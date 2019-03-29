package com.class6;

import java.util.Scanner;

public class notOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean a=true;
System.out.println("the value of a boolean "+true);//its going reverse true to FAlse

boolean snow=true;
//if its not snowing ill come to the class
//otherwise ill stay at home


if (snow) {//or (!snow)
	System.out.println("ill stay home");//ill come to the class
}
//its not gonna print anythoing since the initial boolean is true


	
int x=10;
int y=20;
if (x>y) {//(!(x>y))
	
	System.out.println("x greater than y");//hello
	//its gonna print hello since we have !
	
	
	
	
	
	
	
	
	
	
	int num1,num2,num3=0;//largest=0
	Scanner scan=new Scanner(System.in);
	System.out.println("plz eneter 3 distinct double values");//distinct=different
	num1=scan.nextInt();
	num2=scan.nextInt();
	num3=scan.nextInt();
	//1.num1>num2 &num1>num3
	//2.num2>num1 &num2>num3
	//3.num3>num1 & num3>num2
	//5,3,4
	
	
	if (!(num1==num2 && num1==num3 && num2==num3)) {//if number are not equal
		}
	}
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	if (num1>num2)
		if(num1>num3) {
			
			System.out.println(num1+"is the largest");//largest=num1;
			}else {
		
		System.out.println(num3+"is the largest");
	
	}
else {//assuming num2>num1
		
		if(num2>num3) {
			System.out.println(num2+"is the largest");//largest num2;
			
		}else {
			System.out.println(num3+"is the largest");//largest num3;
	
	
}	
}}}


