package com.class20;

public class AccessModifiers {
/* Create a method that will take 1 parameter as a String and
 *  return reversed String. 
 *  Method should be visibly only within same package.
 * /
 */
	public static void main(String [] args) {
		AccessModifiers obj=new AccessModifiers();
	String reversed=obj.reverseString("hello");
	System.out.println(reversed);
//-------------------------------------------------
	System.out.println(obj.isPalindrome("mom"));
	String[] array=obj.getWordsFromString("have a good night students");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]);
	}
	System.out.println("-------------------------------------------");
	for (String word:array) {
		System.out.print(word);
	}
	}

protected String reverseString(String str) {
	String reversed="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed=reversed+str.charAt(i);
	}
return reversed;
}
/*
 * Create a method that will take a String and 
return whether String is palindrome or not. 
Method should available to all classes within your projects./
 */

public boolean isPalindrome(String str) {
	String reversed="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed=reversed+str.charAt(i);
	}
	if (reversed.equalsIgnoreCase(str)) {
		return true;
	}else {
		return false;
	}

}
//public boolean isPalindrom (String str) {
	//boolean flag=false;

//	String reversed=reverseString(str);
	
	//if (reversed.equalsIgnoreCase(str)) {
	//	 flag=true;
//}return flag;
	//}
//----------------------------------
/*
 * Create a method that will take a string and 
return array of words from that string. 
Method should be available only within same class.//
 */

private String[] getWordsFromString(String str) {
	String[] words=str.split("");//returns array of string thats why string[]
    return words;
}
}
