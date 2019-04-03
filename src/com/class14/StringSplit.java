package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//string split()
	//as soon as it finds matching it will cut from there
	String str="Welcome Syntax Students Batch 4";
	String [] array=str.split("S");
	System.out.println(array.length);
	
	for(String substring:array) {
		System.out.println(substring); 
	}

	System.out.println("-----------------");
	for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
	}
	
	
	}

}
