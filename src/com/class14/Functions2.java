package com.class14;

public class Functions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// toCharArray()
		//converts string to an arrayof characters
		
	String str="saturday";	
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		//using for each loop--------------
		   for (char c:array) {
		       System.out.println(c);

		   }
		   //now we want to print reversed "saturday"
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		
		
	}

}
