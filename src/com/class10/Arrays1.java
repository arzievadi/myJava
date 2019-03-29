package com.class10;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//int num=20;we cant assign at the same time two int num
	
	/*int a=10; only one value 10
	 * int b=4 values
	 * 
	 * 
	 * 
	 * 10      20    30   40
	 * b[0], b[1], b[2], b[3]indexes
	 * 
	 * index always starts from zero
	 * /
	 * Size of arrays-----thats how many values we can store in array
	 * 
	 * 
	 * 
	 */
		int num;//declaring
		num=10;//int num=10;//initialize
		
	int[] array1;//declaring
	int [] array2;//declaring
	int array3[];//declaring
	
//object   
	array1=new int[4];//initializing or creating array
	
	
	//assign value
	  array1[0]=10;
	  array1[1]=20;
	  array1[2]=30;
	  array1[3]=40;
	
	//accessing values
	  System.out.println(array1[2]);//array in index 2 is 30
	
	//-----------------------------------------------------------------------
	int [] numbers=new int [3];
	
	    numbers[0]=5;
	    numbers[1]=10;
	    numbers[2]=15;
	   //numbers[3]=20;//
	 // System.out.println(numbers[3]);//array index out of bond exceptions when error
		
	    System.out.println(numbers[2]);//15
	
	   
	
	String[] a=new String[3];// string data type
	
	a[0]="hello";
	a[1]="hi";
	a[2]="bye";
	System.out.println(a[1]+" friends");
	
	
	
	
	}

}
