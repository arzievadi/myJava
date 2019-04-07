package com.class18;

public class NestedLoopPractiseRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedLoopPractiseRepetition innerOuter=new NestedLoopPractiseRepetition();
	
	innerOuter.innerOuter1();
	
	
	
	
	
	
	
	
	}
void innerOuter1() {
	for(int i=0;i<3;i++) {
		
		
	for(int y=0; y<3; y++) {
		System.out.println("im inner loop");
	}
	
	
	
	System.out.println("im outer loop");
		
	}
}
}
