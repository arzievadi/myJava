package com.Review4;

import java.util.Scanner;

public class Tasks1OnMethods {
	
String eyes;
public static void main (String [] args) {

	Tasks1OnMethods ne=new Tasks1OnMethods();
	
	ne.scannerfirstName();
	ne.type();

ne.scannerInt();
ne.ReverseString();

}	
	
	
	
	
	
	void type() {
	System.out.println("i do not have a return type");
}

void  scannerfirstName() {
	Scanner scan=new Scanner(System.in);

scan.nextLine();

}

void scannerInt() {
	Scanner scan=new Scanner(System.in);
scan.nextInt();

}
void ReverseString() {
	
	String str= "seigolonhceT xatnyS";
	String reverse="";
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		//System.out.println(reverse);
}
	System.out.println(reverse);	
}

}
