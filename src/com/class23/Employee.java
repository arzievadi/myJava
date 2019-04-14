package com.class23;

public class Employee {

public static String department ="IT";//static variables
	
int salary;//default

	 protected int salary1;//protected

public void getPaid() {
System.out.println("employee gets paid "+salary);	
}
public static void  work() {//static method
	System.out.println("employee works in "+department+"department");
}

protected void test() {
	System.out.println("im a protected method");
}
void test1() {
	System.out.println("im a default method");
}
}
