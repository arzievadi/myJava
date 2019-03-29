package com.class12;

public class FA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*create a grocery ;list: fruits 
		 *                         veggies
		 *                          dairy
		 *  retrieve all values using 2 different loops                       
		 * /
		 */
		
		
		String[][] groceryList= {
				{"apples","pears","mangos","peaches","cherries"},
				{"kale","squash","cucumber","tomato","avocado","cabbage"},
				{"milk","eggs","cheese"}
		};
		
		
		for(int i=0;i<groceryList.length;i++) {
			for(int j=0;j<groceryList[i].length;j++)
				System.out.print(groceryList[i][j]+"   ");
		
		System.out.println();
		}
		
		System.out.println("-----enhanced   loop--------");
		// string since there are string elements not integers
		for (String[] singleArray:groceryList) {
			for(String items:singleArray) {
				System.out.print(items+"  ");
			}
		System.out.println();
		}
	
	
	
	
	
	
	}

}
