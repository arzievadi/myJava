package com.class11;

public class Task2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///----task 1
	String[][] names= {
			{"Mr","Mrs","Ms","Miss"},
			{"Smith","Obama","Jackson","Jordan"}
	};
	
	System.out.println(names[0][1]+" " +names[1][0]+"  "+" "+names[0][0]+" "+names[1][1]+"  "+" "+names[0][2]+"  "+names[1][2]+"  "+names[0][3]+"  "+names[1][3]);
	
	////-----task 2
	String[][] array= {
			{"smith","obama","Jackson","Jordan"},
			{"a","b","c","d","e","f"}
	};
	System.out.println(array[0][2]+"  grade is  "+array[1][0]+"       "+array[0][1]+"  grade is  " +array[1][1]);
	
	
	
	
	
	
	
	}

}
