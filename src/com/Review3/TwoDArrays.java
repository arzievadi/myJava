package com.Review3;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. write a program to print the length of ea array	
		/*
		 * int [][] ar={
    	 * {1,2,3},
    	 * {4,5,6,9},
    	 * {7,8}
		 * 
		 * };
		 * 
		 * 
		 * /
		 */
		
		 int [][] ar={
		    	  {1,2,3},
		    	  {4,5,6,9},
		    	   {7,8}
				  
				  };
		for (int i=0;i<ar.length; i++) {
			System.out.println("the length of row" +(i+1)+"="+ar[i].length);
				
		//---------------------for each loop
			System.out.println("----for loop-----");
		 for(int[] inner:ar) {
			 System.out.println("the length of row ="+inner.length); 
		 }// we r interseted in length thats why only one for loop
		
		}
		System.out.println("---------2nd task---------");
		//2.write a program to print all elements of the 2d array 
		//using a for loop and foreach  loop 
		
		for(int[] values:ar) {
			for(int total:values) {
				System.out.println(total);
			}System.out.println();
		}
		//we are interested in ea element thats why 2 for loops
		
		
	}

}
