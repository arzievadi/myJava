package com.Review2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to sum the values of an array
	
	//	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	
	//1.int []nums = {1,2,3,4,5,6,7,8,9,10};
	//System.out.println(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]+nums[5]+nums[6]+nums[7]+nums[8]+nums[9]);
		
	/////////or---------------------------------------------------------------
	
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		//int[]=new int[10];when we dont know the values of elements
	int sum=0;
	for (int i=0;i<nums.length;i++) {
		sum+=nums[i];
	}System.out.println(sum);
	
	
	
	
	}

}
