package com.class8;

public class For {
public static void main(String [] args) {
	
	
	int sum=0;
	for(int i=1; i<=5; i++) {
		sum=sum+i;
		
	}System.out.println(sum);
	
	
	//find sum of all even nums from 1 to 100
	
	int total=0;
	for(int a=0; a<=100; a+=2) {
	total=total+a;
	}System.out.println(total);//2550
	
	
	int sumAll=0;
	for(int y=10;y<=50;y+=10) {
		sumAll=sumAll+y;
	}
	System.out.println(sumAll);//50
	
	int all=0;
	for (int v=0;v<=100; v++) {
	if(v%2==0) {
		all=all+v;
			System.out.println(all);
	
}
	
        
    } 

	
}}





