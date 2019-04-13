package com.class22;

public class Task3Constructor {
/*
 * 3. Write a program  that will have a private default constructor
 *  class and create 2 objects of this class: 1 - inside same class;
 *  2 - from outside the class./
 */

private Task3Constructor (String str) {
	System.out.println("i am a private default constructor  "+str);
	
}
	
public static void main(String [] args) {
	 
	Task3Constructor  obj=new Task3Constructor ("type anything here");

}

}
