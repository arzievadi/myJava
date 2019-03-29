package com.class10;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	           // 0, 1, 2, 3 indexes
	int[] array= {10,20,30,40};
	
	System.out.println(array[2]);//2 index
	
	///to find size there a method
	
	System.out.println(array.length); //it will print 4 ---- {10,20,30,40}
	
	//----------------------------------------------------------------
	
	//string of names-5;
	String[] names= {"john,mike,jane,olga,talgat"};
	
	System.out.println("there are "+names.length+"values in my array of names");
	System.out.println(names[2]);
	// int[] numbers;
	//numbers={10,20,30}; this wont work
	
	}

}
