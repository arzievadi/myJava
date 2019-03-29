package com.class10;

public class TaskforArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//1.Create an array of chars and store grades into it:
		// A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
	
	
		 char[]grades= {'A','B','C','D','E','F'};
	
		 System.out.println(grades[2]);
		 
		 System.out.println(grades.length);
		// --------------------------------------
		
		 char[] grades1;
			grades1=new char[6];
			
				
			    grades1[0]='A';
			    grades1[1]='B';
			    grades1[2]='C';
			    grades1[3]='D';
			    grades1[4]='E';
			    grades1[5]='F';
			  
			    System.out.println(grades1[2]);
				 
				 System.out.println(grades1.length);
			
	
	
	//2.Create an array of names and store all names of your group.
			 //Then print your name from that array. 
			 //(use 2 different ways of creating an array).
	
					String[] names= {"asyl,melek,almaz,dinar"};
					 
					names=new String[4];
					
					names[0]="asyl";
					names[1]="melek";
					names[2]="almaz";
					names[3]="dinar";
					
					System.out.println(names[3]);

					System.out.println(names.length);
	
	
	//3.Create an array of words: 
	//Java, Saturday, day, coding, is.
	// Print the following sentence using element of array: 
	//“Saturday is Java coding Day”.
	
	//                   0     1 1    2    3     42
	String []words = {"java","saturday","day","coding","is"};
	String sentence= words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" " +words[2];
	System.out.println(sentence);
	
	}

}
