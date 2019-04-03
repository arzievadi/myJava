package com.class14;

public class FunctionsOfJavalast4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.st function Replace()
		//will replace old char/value with new char/value
		
	
	String str="I am good tester#1!";
	String newStr=str.replace("a","e");
	System.out.println(newStr);
	
	
	String newStr1=str.replace("good","great");
	System.out.println(newStr1);
	// what we are looking for to replace ,new value
	String newStr2=str.replace("tester", "programmer");
	System.out.println(newStr2);
	
	
	String newStr3=str.replace("Tester", "programmer");
	System.out.println(newStr3);//will print as it is coz there no upper case tester
	
	//now we want ? instead of !
	str=str.replace("!","?");
	System.out.println(str);
	
	str=str.replace("1", "2");
	System.out.println(str);
	
	//2-------replaceAll()
	//will replace all that matches specified patter [regex];
	
	//to get only character from numbers
	String str1="12Hello 3234 World 465%^%";
	String replacedNoNumbers=str1.replaceAll("[0-9]","");
	System.out.println(replacedNoNumbers );
	
	//now we want get rid of all nums and marks and leave chratcers only
	//^ mark----NOT in this case
	String newString=replacedNoNumbers.replaceAll("[^A-Za-z]","");
	System.out.println(newString);
	
	
	
	//now i want to get rid of everything except marks
	String replacedNoCharacters=replacedNoNumbers.replaceAll("[A-Za-z]","");
	System.out.println(replacedNoCharacters );
	
	String str2="1Hello123";
	System.out.println(str2.replaceAll("[^0-9]", ""));
	
	}

}
