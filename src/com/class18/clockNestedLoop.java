package com.class18;

public class clockNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//24 hrs 60 mins
	
		clockNestedLoop nests=new clockNestedLoop();
	
	nests.nest1();
	
	
	
	}
void nest1() {

for (int h=0;h<24; h++ ){
		for(int m=0; m<60; m++) {
			
			
			if (m<10) {
				System.out.println(h+ ":0"+m);
			}
			else {
				System.out.println(h+ ":"+m);
			}
			
			
			System.out.println(h+ ":"+m);
		
		
		
		
		}
	}
	
}
}
