package com.class17;

import java.util.Scanner;

public class Task123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a method that will take 2 parameters as a numbers and prints which number is larger.

Create a method that will take a number and prints whether the number is even or odd.

Create a method that will print whether given String is palindrome or not.
 * 
  
 * /
 */
		 Task123 obj=new  Task123();
		 obj.findLargest(0, 0);
	
	         obj.evenOdd(0,0);
	 
	              
	}
void findLargest(int a, int b) {
	if (a>b) {
		System.out.println("num "+a+ " is the largest");
	}else {
		System.out.println("num "+b+ " is the largest");
	}

}

void evenOdd(int c,int d) {
	if(c%2==0 || d%2==0) {
		System.out.println("num is even");
	}else {
		System.out.println("num is odd");
	}
}

void palindrome(String palindrome) {
	String second="";
	Scanner sc;
	sc=new Scanner(System.in);
	System.out.println("plz enter any string-word");
	String first=sc.nextLine();
	
	for(int i=first.length()-1; i>=0;i--) {
		System.out.print((first.charAt(i)));
	
	}if(first.contentEquals(second)) {
		System.out.println("palindrome");
	}else {
		System.out.println(" not palindrome");
	}
}
}
