package com.class16;

public class Computer {

//defining
boolean mouse,keyboard;
int screen,ram;
String os, brand;

 
public static void main(String []args) {
	
	//className variableName=new ClassName();
	
	//1st object
	
	Computer comp1=new Computer();
	
	comp1.mouse=true;
	comp1.keyboard=true;
	comp1.screen=2;
	comp1.ram=8;
	comp1.os="Windows";
	comp1.brand="HP";
	
	
	//behaviour
	comp1.watchmovie();
	comp1.doJavaCoding();
	comp1.playMusic();
	
	
	System.out.println("----------2nd comp------------");
	
   Computer comp2=new Computer();
	
	comp2.mouse=false;
	comp2.keyboard=false;
	comp2.screen=4;
	comp2.ram=6;
	comp2.os="Mac OS";
	comp2.brand="Apple";
	
	//behaviour
	
	
	comp2.watchmovie();
	comp2.doJavaCoding();
	comp2.playMusic();
	
	
	
	
}

void watchmovie(){
System.out.println("we can watch movie on a computer "+brand);	

}
void doJavaCoding() {
	System.out.println("we can do java coding on our computer "+brand); 
}
void playMusic(){
	System.out.println("we can play music on our computer "+brand);
}

}
