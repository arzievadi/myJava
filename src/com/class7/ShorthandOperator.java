package com.class7;

public class ShorthandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//compound operator
		int a=10;
		a=a+10;
		System.out.println(a);//20
		
		int b=100;
		b=b+100;
		System.out.println(b);//200
		
		
		
		int c=100;
		c+=100;//c=c+100 shorthand operator//100+100=200
		System.out.println(c);
		
		c+=35;//c=c+35//200+35
		System.out.println(c);
		
		c+=50;//c=c+50
		System.out.println(c);//235+50=285
		
	int d=30;
	d-=10;//30-10//d=d-10
	System.out.println(d);//20
	
	d+=50;//20+50//d=d+50
			System.out.println(d);//70
	
	d/=5;//d=d/5    //70/5=14
	System.out.println(d);//14
	
	d%=2;//14/2=7  or if d%=4 it would be 14/4=2 coz its reminder for modulus
	System.out.println(d);//7   or 2
	
	
	
	
	
	}

}
