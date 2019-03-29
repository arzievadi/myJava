package com.class8;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] groceryList= {
				{"apples","pears","mangos","peaches","cherries"},
				{"kale","squash","cucumber","tomato","avocado","cabbage"},
				{"milk","eggs","cheese"}
		};
		
		
		for (String[] singleArray:groceryList) {
			for(String items:singleArray) {
				System.out.print(items+"  ");
			}
		System.out.println();
		}
		
		
}}