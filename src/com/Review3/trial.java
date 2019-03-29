package com.Review3;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[][] rating = { { 2, 6, 9, 3, 7 }, 
				         { 1, 7, 9, 4, 8 }, 
				         { 0, 4, 6, 2, 5 }, 
				          { 0, 1, 2, 3 } };

int sum = 0;
for (int col = 0; col <= 3; col++) {
sum += rating[2][col];
}
System.out.println("The average of row 2 is : " + sum / 4);	
	
	
	
	
	
	
	
	
	
	}

}
