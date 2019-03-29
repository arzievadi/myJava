package com.Review2;

public class exerciseNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /**
	        * Write a program that prints the following pattern
	        *
	        * ....1
	        * ...22
	        * ..333
	        * .4444
	        * 55555
	        *
	        */
	
	for(int a=1;a<=5;a++) {
		for(int b=1;b<=(5-a);b++) {
			System.out.print(".");	
		}
			for (int c=1;c<=a;c++) {
				
				System.out.print(a);
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	}


