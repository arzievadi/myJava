package com.class12;

public class StringMan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// charAt()--returns a char at specified index[0] stsrts counting from [0]
	String str="Students";
	
	char character=str.charAt(4);
	
	System.out.println(character);
	
	for(int  i=0; i<str.length(); i++) {
		System.out.print(str.charAt(i)+" , ");
	}
	
	//indexOf()-returns an index of specified character(starts counting from 0 like in arrays)
	System.out.println("--------indexOf()-------------");
	
	String str1="Sunday";
	 int index=str1.indexOf("n");
	System.out.println(index);
	
	String str2="Syntax Technologies";
	System.out.println(str2.indexOf("Syntax"));//will print 0
	System.out.println(str2.indexOf("Technologies"));//will print beginning index 7
	System.out.println(str2.indexOf(" "));//6
	System.out.println(str2.indexOf("w"));//-1 there no w 
	
	//substring()- gives another string from your current string
	System.out.println("-------- substring------------");
	
	String str3="Today is Sunday Java class";
	
	String newString=str3.substring(5);
	System.out.println(newString);
	
	
	System.out.println(str3.substring(0, 5));//today
	System.out.println(str3.substring(9, 20));// sunday java
	System.out.println(str3.substring(16, 20));//java
	System.out.println(str3.substring(21));//class
	}

}
