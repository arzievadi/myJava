package com.class10;

public class RedoExsNestedLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			/*3. Print the following pattern:
			 *  1
				12
				123
				1234
				12345
				
				4. Print the following pattern:
			    *    
				**
				***
				****
				*****
				****
				***
				**
				*
			 *
			 *
			 */
				
		
		
		////////3
		
		
		for (int i=1;i<=5; i++)	{
			for (int j=1; j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}	

		
		
		//////4
		for (int m=1; m<=5;m++) {
			for (int k=1;k<=m;k++) {
				System.out.print("*");	
			}System.out.println("");
		}
		for (int a=1;a<=5;a++) {
		for(int b=4;b>=a;b--) {

			System.out.print("*");
		}System.out.println();
		
	
	
	} }}
	
	
	
	


