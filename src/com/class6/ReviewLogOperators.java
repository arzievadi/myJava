package com.class6;

import java.util.Scanner;

public class ReviewLogOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///////////////1.logical operator
		
		double num1,num2,num3;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("plz eneter 3 distinct double values");//distinct=different
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
	
	if(num1>num2  && num1>num3) {
		System.out.println(num1+" is the largest");
		
	}else if (num2>num1 && num2>num3) {
		System.out.println(num2 +" is the largest");
		
	}else if(num3>num1 && num3>num2) {
		System.out.println(num3+" is the largest");
	}
	//no need for else since there no false statement
	
	//////////////2.nested if
	
	
	int a,b,c;
	
	Scanner scan1=new Scanner(System.in);
	System.out.println("plz eneter 3 distinct values");//distinct=different
	a=scan1.nextInt();
	b=scan1.nextInt();
	c=scan1.nextInt();
	//1.num1>num2 &num1>num3
	//2.num2>num1 &num2>num3
	//3.num3>num1 & num3>num2
	//5,3,4
	
	
	if (a>b)
		if(a>c) {
			System.out.println(a+" is the largest");//largest=num1;
			}else {
		
		System.out.println(c+" is the largest");
	 
	}
	    else
	{         //assuming num2>num1
		
		if(b>c) {
			System.out.println(b+" is the largest");//largest num2;
			
		}else {
			System.out.println(c+" is the largest");//largest num3;
		}
	}
	
	
	}

}
