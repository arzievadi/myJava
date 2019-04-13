package com.class22;

public class TestTask1Constructor {

	String studName;
	int score1,score2,score3;	
	
public static void main (String [] args) {
	
		
		Task1Constructor obj=new Task1Constructor("dee");
	
		Task1Constructor obj2=new Task1Constructor();
	
		
//------------------------------------------------------		
		Task1Constructor obj3=new Task1Constructor ();
		Task1Constructor obj4=new Task1Constructor ();
		Task1Constructor obj5=new Task1Constructor ();
		Task1Constructor obj6=new Task1Constructor ();
		System.out.println("--------------------------");
	
		//   obj.getStudGrades("dinar", 25, 16,27 );
			obj3.getStudGrades("lee",0, 0, 0);
			obj4.getStudGrades("bee",15, 55, 78);
			obj5.getStudGrades("sam",45, 78, 52);
			obj6.getStudGrades("dinar", 12, 13, 15);
	}
public void getStudGrades(String studName,int score1,int score2,int score3 ) {
		int total=0;
		total=(score1+score2+score3)/3;
		System.out.println(studName+" got score average of  "+total);
	}
	
}
