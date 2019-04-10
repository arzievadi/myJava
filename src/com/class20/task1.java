package com.class20;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
task1 obj=new task1();
   String email= obj.createEmail("John", "Snow", "gmail");
	System.out.println(email);
	
	email=obj.createEmail("Bob", "Snow", "outlook");//no need writing string coz we reassigning
	System.out.println(email);
	}
String createEmail(String name,String lastN,String emailType) {
	String email= name+lastN+"@"+emailType+".com";
return email.toLowerCase();
}
}
