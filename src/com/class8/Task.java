package com.class8;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////TASK
	
		//1.print nums 1 to 100
	
		//2.nums  from 100 to 1
	
	//3.odd nums from 1 to 20 (2 ways)
	
	//4.even nums from 20 to 50 (2 ways)
  
		//5.odd nums btw 20 and 50(2 ways)
	
		
		
		
		//1.
	for( int a=1; a<=100; a++) {
		System.out.println(a);
	}
		//2.
	for(int b=100; b>=1;b--)	{
		System.out.println(b);
	}
		//3
	for( int c=1; c<=20; c+=2) {
		System.out.println(c);
	}
	for ( int c1=20; c1>=1;c1--) {
		System.out.println(c1);
		}

	for (int c2=20;c2>=1; c2-=3)	{
		System.out.println(c2);
	}
	//4
	for (int d=20; d<=50; d+=2) {
		System.out.println(d);
	}
	for(int d1=50; d1>=20; d1-=2) {
		System.out.println(d1);
	}
	//5.
	for(int f=50; f>=20; f--) {
		if(f%2!=0)
		System.out.println(f);
	}
	for(int f1=20;f1>=50; f1++) {
		if(f1%2!=0)
		System.out.println(f1);
	}
	
	}
	

}
