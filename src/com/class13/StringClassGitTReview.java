package com.class13;

public class StringClassGitTReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*Create a String and print it in reverse order (Sunday → yadnuS).

Create a String and if the String is not empty perform the following:
 if the String has an odd number of characters 
 and has 3 or more characters, print the character 
 in the middle of the String
	 * /
	 */
	
	String a="Sunday";

	for(int i=a.length()-1; i>=0;i--) {
		System.out.print((a.charAt(i)));
	}
	
	// task 2.?????
	
String day=new String("thursday");
 if (!day.isEmpty()) {
	 if(day.length()%2!=0 && day.length()>=3) {
		 System.out.println(day.charAt(day.length()/2));
	 }
	
 }
	}

}
