package com.class11;

public class array2dInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// creating 2d array	
	
	int [] [] d=new int[4] [4];//4*4=16 elements
        //1 row
	d[0][0]=12;//o is a row num
	d[0][1]=13;
	d[0][2]=14;
	d[0][3]=15;
	
	//2row
	d[1][0]=1;//1 is a row num
	d[1][1]=2;
	d[1][2]=3;
	d[1][3]=4;
	
	//3row
	d[2][0]=5;// 2 is a row num
	d[2][1]=10;
	d[2][2]=15;
	d[2][3]=20;
	
	//4th
	d[3][0]=100;//3 is a row num
	d[3][1]=200;
	d[3][2]=300;
	d[3][3]=400;
	
	System.out.println(d[1][2]);// to print 3
	System.out.println(d[3][2]);//300
	System.out.println(d[2][3]);//20
	
	//------------------------------------------another way
	int [][] c= {
			{12,13,14,15},
			{1,2,3,4},
			{5,10,15,20},   
			{100,200,300,400}
	};
	
	System.out.println(c[3][1]);//200
	System.out.println(c[0][0]);//12
	
	
	}

	
	
	
	
}
