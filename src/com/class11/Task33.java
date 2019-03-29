package com.class11;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;

	int[] array= {1,2,3,4,5,6,7};
	for(int i=0; i<array.length;i++) {
		sum+=array[i];
		//System.out.println(array[i]);
	System.out.print(sum);
	
	}
	
	//----------------enhanced	
		
	//int sum=0;
	int[] array2= {1,2,3,4,5,6,7};
	 for(int monkey:array2) {
	
		System.out.println(monkey); 
	 }
	
	
	
	
	
	
	
	
	
	
	
	}

}
