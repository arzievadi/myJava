package com.class7;

public class taskAtClassOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


//////////////print only odd numbers  from 1 to 20
		
	int num=1;
	
		while(num<=20) {
			System.out.println("im inside while loop");
		
			if (num%2!=0) {//it should be odd,so it picks up odd numbers only; 1/2=0.5! ;0.5 is not equal to 1 so this condition is true with ! sign
			System.out.println(num);
			
		}
		
			num++;
		}
		
		
		
		
		
	}

}
