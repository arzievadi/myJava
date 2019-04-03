package com.class13;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day=new String("thursday");
	
		 if (!day.isEmpty()) {
			 if(day.length()%2!=0 && day.length()>=3) {
				 System.out.println(day.charAt(day.length()/2));
			 }
		 }

	}

}
