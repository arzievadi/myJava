package com.class14;

public class TaskAtClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Create a String that will hold a sentence. 
	 * Write a program to get a new String without any spaces.

Create a String that should be combination of letters, 
numbers and special characters. 
Find out how many alpha characters are there in the String.

You have a String a=“Today is a good day! 
It is Thursday! We have a Java Class!“. 
How would you find out how many sentences are in that String?
	 * 
	 * 
	 * /
	 */
	//1task
		String str="Welcome Syntax Students Batch 4";
		String [] array=str.split(" ");
		for(String substring:array) {
			System.out.print(substring); 
		}System.out.println();
System.out.println("------------------");
		


    //task2???????????????????
		String str2="Welcome Synt465%^%ax Students Batch465%^% 4";
		String noNums=str2.replaceAll("[0-9]","");
		String replaced2=noNums.replaceAll("[A-Za-z]","");
		System.out.println(replaced2 );
		System.out.println(replaced2.length());

System.out.println("-------------------");
	
//task3
	
		String a= "Today is a good day! It is Thursday! Wehave a Java Class!";
		String[] spl=a.split("!");
		System.out.println(spl.length);
		
		
	}}
