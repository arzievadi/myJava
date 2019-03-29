package com.class7;

public class ShortOPEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/////incrementing by 1;incrementr decrement applicable for variables NOT values
		
		int x=1;
		x=x+1;
		
		 System.out.println(x);
		
		 int y=1;
			y=y+1;
			
			 System.out.println(y);
		
		/////incrementing by 1
			 
			 
			int z=1;
			z++;
			 System.out.println(z); //2
		
		/////	 
		int w=2;
		w++;//2+1
		 System.out.println(w); //3
			 
			////////decrementing by 1
			
		 int v=10;
		 v--;//10-1
		 System.out.println(v);//9
		 
		/////////// ///////post decrement post increment
		 
		 int a=10;
		 int b=++a;//preincrement=increment----assign
		 System.out.println(b);//11
		 System.out.println(a);//11
		 
		 int c=10;//postincrement=assign-----increment
		  int d=c++; 
	     System.out.println(d);//10
		 System.out.println(c);//11
	
		 int q=100;
		 int e=q--;
		 System.out.println(e);//100
		 System.out.println(q);//99
	
	
		 int h=50;
		 int g=--h;
		 System.out.println(h);//49
		 System.out.println(g);//49
	
	int m=50;
	int l=m--;
	
	System.out.println(l);//50
	System.out.println(m);//49
	}

}
