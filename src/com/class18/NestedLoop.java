package com.class18;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	for (int i=0; i<=5; i++) {
//		System.out.print(i);
//	}for (int i=0; i<=5; i++) {
	//	System.out.print(i);
//	}for (int i=0; i<=5; i++) {
	//	System.out.print(i);
//	}for (int i=0; i<=5; i++) {
	//	System.out.print(i);
	//}// we could do this but.....we gonna use nested loop
	
	// i want to print pattern :
	
	//12345//4 rows //we can assign as outer loop 
	//12345 //5 columns// we can control using our inner loop 
	//12345
	//12345
	
		 NestedLoop prints=new  NestedLoop();
prints.print1();
	
	
	
	}
void print1() {
	
	for(int i=1; i<5; i++) {
		for( int y=1; y<6; y++) {
			
			System.out.print(y);//11111 if i///12345 y
			
			
		}System.out.println();
	}
		
}
}
