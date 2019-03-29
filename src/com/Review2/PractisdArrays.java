package com.Review2;


public class PractisdArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//write a program to test if an array contains a specific value. 6
	
	//hint:use boolean flag
	
	//{1,2,3,4,5,6,7,8,9,10};
	
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
	
	boolean found=false;
	for(int i=0;i<10; i++) {
		if (nums[i]==6) {
			found=true;
			break;
		}
	}
		if(found==true) {
			System.out.println("the array contains the value:6");
		}else {
			System.out.println("the array does Not contain the value: 6 ");
		}
	
	
	
	
	
	
	}
		
}
