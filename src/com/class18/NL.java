package com.class18;

public class NL {

	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
//i want to print pattern,square:
	/******
	 *    *   
	 *    *
	 ****** 
	 */

		NL patterns=new NL();
		patterns.pattern1();
		patterns.pattern2();
		patterns.pattern3();
		patterns.pattern4();
		
		

}
	
void pattern1() {
	for (int a=4;a>=1;a--) {
		for (int b=5;b>=1;b--) {
			
			System.out.print(b);
		}System.out.println();
		System.out.println();
	}
	
}
void pattern2() {
	for (int i1=5;i1>=1;i1--) {
		for(int y=5;y>=1;y--) {
		
			System.out.print(i1);	
		}
		System.out.println();
	}
}

void pattern3() {
	for (int c=0;c<=4;c++) {
		for(int d=0;d<=c;d++) {
			
			System.out.print("*");
		}System.out.println();
		System.out.println();
		}	
}
void pattern4() {
	for(int l=1; l<=4;l++) {
		for(int p=1;p<=5;p++) {
			System.out.print("*");
		}System.out.println();
	}
}

}
	
	
	
	
	
	


