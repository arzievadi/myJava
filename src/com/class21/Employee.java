package com.class21;

public class Employee {
/*
 * Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects/
 */

int eID;
int salary;
public static String CEO="Sumair";

public static void main(String []args) {
	Employee obj=new Employee();
	
	
	obj.eID=123;
	obj.salary=140000;
	
	Employee obj2=new Employee();
	
	obj2.eID=456;
	obj2.salary=780000;
	
	//calling objects
	obj.getEmployeeInfo();
	obj2.getEmployeeInfo();
}
void getEmployeeInfo() {
	System.out.println(CEO+" "+eID+" "+salary);
}
}
