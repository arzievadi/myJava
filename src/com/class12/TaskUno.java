package com.class12;

public class TaskUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.  length function or method returns numbers of characters in String
		String str="Syntax";
		 int lengthOfString=str.length();
		
		System.out.println( lengthOfString);
		
		String str1="syntax technologies";
		 int lengthOf2String=str1.length();
		
		 System.out.println(lengthOf2String);
		
		
		String str2="welcome, students!";
		System.out.println(str2.length());
		
		
		
		//2.  toUpperCase()-------convert characters to upperCase
	    String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		//3.  toLowerCase()-------convert characters to LowerCase
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		
		//4.  comparison of two strings NEVER USE == SIGN ONLY IN SOME CASES,just use .equals
		//if strings are equal ----true if not -----false 
		String str4="Hello";
	    String str5="hello";
	    
	   boolean equality= str4.equals(str5);
	    System.out.println(equality);
	    
	    //5.  ONLY IN CHROME use ignoreCase
	    //equalsIgnorecase()----compares 2 strings but ignores case
	    //as long as the value is same 
	    String expectedBrowser="Chrome";
	    String actualBrowser="chrome";
	    
	   boolean equals= expectedBrowser.equalsIgnoreCase(actualBrowser);
	    System.out.println(equals);
	}

}
