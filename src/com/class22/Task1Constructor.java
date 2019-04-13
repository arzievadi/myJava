package com.class22;

public class Task1Constructor {
/*
 * Write a program that will have a constructor: one with parameters and second without any parameters. Create a separate Test class where you will execute both of the constructors.



Write a java program of Class Students that takes students name and 
3 subject grades. Inside your class also have a method to 
Calculate Average Grade. Test Student class for 5 different students
 with different marks. Your program should print an average mark of
  each students name.
NOTE: please male different names for instance and local variables.




Write a program  that will have a private default constructor class 
and create 2 objects of this class: 1 - inside same class; 2 - from outside the class.

Write program that have static constructor and observe result./
 */

    public Task1Constructor(String name) {
	System.out.println("i am a constructor with parameter "+name);
} 
   public Task1Constructor() {
	System.out.println("i am a contsructor Without parameter");
}
public static void main(String [] args) {
	Task1Constructor obj=new Task1Constructor("Dee");
	Task1Constructor obj1=new Task1Constructor();

	
	
	Task1Constructor obj2=new Task1Constructor ();
	Task1Constructor obj3=new Task1Constructor ();
	Task1Constructor obj4=new Task1Constructor ();
	Task1Constructor obj5=new Task1Constructor ();
	Task1Constructor obj6=new Task1Constructor ();
	
    obj.getStudGrades( "lee ",25, 16,27 );
	obj3.getStudGrades("",25, 84, 25);
	obj4.getStudGrades("",15, 55, 78);
	obj5.getStudGrades("",45, 78, 52);
	obj6.getStudGrades("",12, 13, 15);
	
	
	System.out.println("------------------------task 2-------------------------------");
System.out.println();	
	
String studName;
	int score1,score2,score3;

	
	
}
public void getStudGrades( String studName,int score1,int score2,int score3 ) {
	int total=0;
	total=(score1+score2+score3)/3;
System.out.println(studName+" got score average of  "+total);
}

}
