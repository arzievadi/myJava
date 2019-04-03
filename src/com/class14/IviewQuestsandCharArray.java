package com.class14;

public class IviewQuestsandCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//TASK reverse string wo using a reverse function
	
		//1 using toChararray()---------------
	String original="Today is Java Class";
	
	String reverse="";//declare emty string
	char[] array=original.toCharArray();
	
	for(int i=array.length-1;i>=0;i--) {
		reverse=reverse+array[i];
		
	}
	System.out.println("reversed string is: "+reverse);
	
	//2 using CharAt()-------------------------
	String reverse1="";
	for(int i=original.length()-1;i>=0;i--) {
		reverse1=reverse1+original.charAt(i);
	}
	System.out.println("reversed string is: "+reverse1);
	
	//3 using substring()
	String reverse2="";
	for(int i=original.length();i>0;i--) {
		//beginning index, ending index
		reverse2=reverse2+original.substring(i-1, i);
	}
	System.out.println("reversed string is: "+reverse2);
	
	}

}
