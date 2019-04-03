package com.class14;

public class IviewQuestAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*1. Write a program to swap 2 numbers without a temporary variable? 
	 * Swap  2 strings without a temporary variable?

2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

3. Find out how many alpha characters present in a string?//replaceAll()

4.How to find out the part of the string from a string? What is substring? Find number of words in string?

5. Write a java program to reverse String? Reverse a string word by word?
	 * 
	 * 
	 * /
	 */
	
	//task1-1
		
		 int x = 10;
	        int y = 20;
	        x = x+y;
	        y=x-y;
	        x=x-y;
	System.out.println(x+" "+y);
	
	System.out.println("----------------");
	
	//task1-2
	String c="hello";
	String d="world";
	
	c=c+d;//
	d=c.substring(0, c.length()-d.length());
	
	c=c.substring(d.length());
	System.out.println(c+" "+d);
	System.out.println();
	System.out.println("-------task 1 end--------------");
	System.out.println();

	
//----------------------------------------------------------------------------------------------------------------	
	
	
	//task2
	int[][] values = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};

int largest=values[0][0];
System.out.println("largest is the start of the loop value "+largest);
System.out.println("this is what is happening in values"+values);
	for(int[]list:values)	{
		for(int element:list) {
			System.out.println("current largest is  "+largest);
			
			System.out.println("current element is "+element);
			System.out.println("");
			if(largest<element) {
				largest=element;
				System.out.println("the new largest is "+largest );
			}
	System.out.println("");
		}
		
	}
	System.out.println("the largest element is "+largest);
	System.out.println("");
System.out.println("-----------smallest---------------");

	int smallest=values[0][0];
	System.out.println("smallest is the start of the loop value "+smallest);
	System.out.println("this is what is happening in values"+values);
		for(int[]list:values)	{
			for(int element:list) {
				System.out.println("current smallest is  "+smallest);
				
				System.out.println("current element is "+element);
				System.out.println("");
				if(smallest>element) {
					smallest=element;
					System.out.println("the newsmallest is "+smallest );
				}
		System.out.println("");
			
		
			
			}
			
			
			
			
			
		}
		System.out.println("the smallest element is "+smallest);
		System.out.println();
		
		int secondLargest=values[0][0];
		for(int[]list:values)	{
			for(int element:list) {
				System.out.println("current secondlargest is  "+secondLargest);
				
				System.out.println("current element is "+element);
				System.out.println("");
				if(secondLargest<element) {
					secondLargest=element;
					System.out.println("the new secondlargest is "+secondLargest );
				}
		System.out.println("");
			}
			
		}System.out.println("---------task2 end----------------");
		
	//how to print the second largest in  2d array 
//-------------------------------------------------------------------------------------------------------------------------	
	
		//task3
		String str2="Welcome Synt465%^%ax Students Batch465%^% 4";
		String noNums=str2.replaceAll("[0-9]","");
		String replaced2=noNums.replaceAll("[A-Za-z]","");
		System.out.println(replaced2 );
		System.out.println(replaced2.length());
		System.out.println("-----------------task3 end----------------------");
		System.out.println();
		
		
//----------------------------------------------------------------------------------------------------------------------------	
	
	//task4
		
		String str="Welcome Syntax Students Batch 4";
	System.out.println(str.substring(0, 14)+" "+str.length());
	System.out.println("---------task4  end------------");
	System.out.println();
			
	//task5
	String str3="Welcome Synt465%^%ax Students Batch465%^% 4";
for(int i=str3.length()-1; i>=0;i--) {
		System.out.print((str3.charAt(i)));
	}
	
	}
	
	}


