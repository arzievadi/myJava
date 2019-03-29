package com.class12;

public class RecapArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arr= {
				{1,2,3},// 1st array stored with index 0
				{10,20,30},//2nd array with index 1
				{100,200,300}//3rd array with index 2
				
		};
				     //  how many total arrays
		for (int i =0; i<arr.length; i++) {
		//	we put[i] to loop through all rows and columns
			for(int j=0; j<arr[i].length; j++) {//0  1  2   
				System.out.print(arr[i][j]+" , ");
			}
			System.out.println();
		}	
				
		System.out.println("------for ea loop-------------");
		//in 2d array assign each 1st 2nd and 3rd arrays one by one
		//loop through ea element inside 2d array--ea element of an erray
		for(int[] singleArray :arr) {
			//loop through ea single array
			for(int numbers:singleArray) {//{1,2,3}
				System.out.print(numbers+"  ");
			}
		System.out.println();
		}
		
		
		
	}

}
