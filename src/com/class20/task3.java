package com.class20;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create a method that will take 1 parameter as a String and
 *  return reversed String. 
 *  Method should be visibly only within same package.

Create a method that will take a String and 
return whether String is palindrome or not. 
Method should available to all classes within your projects.

Create a method that will take a string and 
return array of words from that string. 
Method should be available only within same class./
 */
		task3 obj=new task3();
		System.out.println(obj.inputs("syntax"));
	System.out.println(obj.arr());
	}

protected String inputs(String word) {
	String reverse ="";
	for(int i = word. length() - 1; i >= 0; i--) {
		 reverse +=word. charAt(i); 
		}
	return reverse;
	
}
public String palindrome (String a) {
	String rev="";
	String result;
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
	}if(a.equalsIgnoreCase(rev)) {
		result="palindrome";
	}else {
		result="not palindrome";
	}return result;
}
private String[]arr(String a){
	String[]array=a.split(" ");
	return array;
}
/*Create a method that will take a string and 
return array of words from that string. 
Method should be available only within same class./
 * 
 
 * /
 */
		
}
