package com.class16;

public class Car {
//defining state
String make,model,color;
int door,wheels;
//behaviour:reverse,stop,drive

public static void main(String[] args)
{
	//className variableName=new ClassName();
	
	//1st object
	//assigning values
	
	Car  car1=new Car();
	
	car1.make="Honda";
	car1.model="Civic";
	car1.color="Black";	
	car1.door=4;
	car1.wheels=4;
	//we want to print this msg
	/*car honda has 4 wheels
	 * 
	 * /
	 *///my honda has 4 wheels
	System.out.println("car "+car1.make+"has "+car1.wheels+" wheels");
//define behaviour
	car1.drive();
	car1.reverse();
	car1.stop();

//my car is blue tesla 


System.out.println("-----2nd object-----------------");
//2nd object
	Car car2=new Car();
	
	car2.make="Tesla";
	car2.model="X";
	car2.color="Blue";	
	car2.door=4;
	car2.wheels=4;
	//define behaviour
		car1.drive();
		car1.reverse();
		car1.stop();




}

void drive(){
	System.out.println("car can drive");
}
void reverse(){
	
System.out.println("car can reverse");

}
void stop (){
	
System.out.println("car can stop");

}

}








