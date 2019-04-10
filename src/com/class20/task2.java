package com.class20;



public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*create a class student that will have a method getgrade
 * ur method should accept the score of a student and return a grade
 * /
 */
	task2 obj=new task2();	
		System.out.println("students grade is "+obj.getGrade(60));
	}
char getGrade(int score) {
char grade=0;
	if(score>=90) {
		grade='a' ;
	}else if(score>=80) {
		grade='b' ;
	}else if(score>=70) {
		grade='c' ;
	}else if(score>=50) {
		grade='d' ;
	}else {
		grade='f' ;
	}
return grade;
}




}
