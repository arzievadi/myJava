package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[][] num= {
			{11,12,13,14},                                //4
			
			{21,22,23},//21,22,23 less columns than rows  //3
			
			{31,32,33,34}                                 //4
			
	};
	
//	int rows=num.length;
//	System.out.println(rows);//3
	
	//if we have less columns we just change the indexnum[1].length
//	int cols=num[0].length;//we have to go inside the row to get the length of the row
//	System.out.println(cols);//4
	
	
	for (int row=0;row<num.length;row++)         {//loop through rows
		for(int col=0;col<num[row].length;col++) {//loop through columns
			
			System.out.println(num[row][col]+"   ");
		}
		System.out.println();
	
	}
	//--------------------String
	//to print all values:
	
	String[][] food= {//[3][4]
			{"burger","fries","hot dog","meatloaf"},//1 array or 1st row
			{"lo mein","fried rice"},
			{"biriyani","korma","naan","chick peas"}
	};
	
	 for (int i=0; i<food.length; i++) {
		 for(int j =0;j<food[i].length;j++) {
			 System.out.print(food[i][j]+" ");
		 }
	System.out.println();
	 }
	
	
	
	}

}
