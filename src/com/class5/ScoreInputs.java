package com.class5;

import java.util.Scanner;

public class ScoreInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//three inputs:
		//quiz//mid term//final score
		//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		//if the average score >=90 =>grade=A
				//if the average score >= 70 and <90 => grade=B
				//if the average score>=50 and <70 =>grade=C
				//if the average score<50 =>grade=F
		
	
	
		Scanner scan1=new Scanner(System.in);
		
		
		System.out.println("please enter score number for quiz");
		int qScore = scan1.nextInt();
		
		
		System.out.println("please enter score number for midterm");
		int mScore = scan1.nextInt();
		System.out.println("please enter score number for final score");
		int fScore = scan1.nextInt();
		
		int avScore=(qScore+mScore+fScore )/3;
		
		
		 if(avScore>=90) {
			 System.out.println("grade A");
		 }else if(avScore>=70 && avScore<90) {
			 System.out.println("grade B");
			 
		 }else if(avScore>=50 && avScore<70) {
			 System.out.println("grade C");
		 }else {
			 System.out.println("grade F");
		 }
	
		System.out.println(avScore);
		
	}

}
