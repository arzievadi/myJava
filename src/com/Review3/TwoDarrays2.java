package com.Review3;

public class TwoDarrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //   Write a program to find the average of row 2.
//                   2 6 9 3 7
//                   1 7 9 4 8
//                   0 4 6 2 5
                  0 1 2 3
       int[][] rating = { { 2, 6, 9, 3, 7 }, 
                       { 1, 7, 9, 4, 8 }, 
                     { 0, 4, 6, 2, 5 }, 
                    { 0, 1, 2, 3 } };
		 */
		 int[][] rating = { { 2, 6, 9, 3, 7 }, 
                 { 1, 7, 9, 4, 8 }, 
               { 0, 4, 6, 2, 5 }, 
              { 0, 1, 2, 3 } };
		 
		 
		 int sum = 0;
		 
		for(int i=0; i<rating.length;i++) {
			
			sum+=rating[2][i];
			System.out.print(rating[2][i]+" ");
			
		}System.out.println();
		System.out.println(sum/rating.length);
	
	
		 
	}

}
