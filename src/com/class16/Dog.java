package com.class16;

public class Dog {

	//task1 
		/*create a class "Phone" 
	    create 3 objects:
	    iphone 
	    android 
	    nokia
		 * 
		 * with specific attributes and behaviors
		 *  
		 *  
		 * task
		 * /
		 * create "Dog" class and create different objects of it:
		 * husky
		 * Bulldog
		 * Labrador
		 * with specific attributes and behaviors
		 * 
		 * 
		 * 
		 *       push the code
		 */

String breed,gender,color;
int age,size;
boolean dogFriendly;

//behavior bark, sit, play, wiggletail,run

public static void main (String []args) 
{
	

//husky
Dog husky=new Dog();
husky.breed="Siberian";
husky.gender="female,male";
husky.color="white";
husky.age=10;
husky.size=25;
husky.dogFriendly=false;

//behavior
husky.bark();
husky.sit();
husky.wiggleTail();

//bulldog
Dog bulldog=new Dog();
bulldog.breed="hddb";
bulldog.gender="female,male";
bulldog.color="orange";
bulldog.age=5;
bulldog.size=15;
bulldog.dogFriendly=false;

//behavior
bulldog.bark();
bulldog.sit();
bulldog.wiggleTail();


//labrador

Dog labrador=new Dog();
labrador.breed="kmjfij";
labrador.gender="female,male";
labrador.color="brown";
labrador.age=11;
labrador.size=8;
labrador.dogFriendly=true;

//behavior
labrador.bark();
labrador.sit();
labrador.wiggleTail();


}

void bark() {
	System.out.println("this "+breed+ " can bark");
}
void sit() {
	System.out.println("this "+breed+" can sit"+gender );
}void wiggleTail(){
	System.out.println("this dog can wiggle tail "+breed);
	
}
}
