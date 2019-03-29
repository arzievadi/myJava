package com.class10;

public class GetAllArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] names= {"john","mike","jane","talgat","olga","mehmet","siyar"};
	
	int a=3;
 System.out.println(names[a]);//talgat
	a=+2;//a=a+2
	System.out.println(names[a]);//mehmet
	a-=4;//a=a-4
	System.out.println(names[a]);//mike
	
	
	int size=names.length;
	System.out.println(size);
	
	//System.out.println(names[0]);
	//System.out.println(names[1]);
//	System.out.println(names[2]);
	
	
	
	for (int i=0;i<size;i++) {
		System.out.println(names[i]);
	}
	
	
	
	
	
	
	}

}
