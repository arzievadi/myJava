package com.class18;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedDemo demos=new NestedDemo();
	
	demos.demo1();
	
	
	

	}
void demo1() {

	for (int i=1; i<=3; i++) {
		
	for (int y=1; y<=3; y++) {
		System.out.println(i+"  "+y);//11 12 13; //21 22 23;//31 32 33
	}
	
	
	}	
}
}
