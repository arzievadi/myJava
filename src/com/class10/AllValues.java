package com.class10;

public class AllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 //   0  1    2   3   4   5//6 from 1 to 6 not zero thats why -1
	char []grades={'a','b','c','d','e','f'};
	 
	for (int i=0; i<=grades.length-1; i++) {/// -1 instead of i equal to 6 to prevent error in printing
		 System.out.println(grades[i]);
	 }
	
	
	String[] array= {"1","2","3","4","5","6","7"};
	
	for(int i=0;i<=array.length-1;i++) {
		System.out.println(array[i]);
	}
	
	
	
	
	
	
	
	}

}
