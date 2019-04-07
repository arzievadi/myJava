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
ne.replace();
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
void replace() {
	String repl="hello world my name is weqas";
char empty;
char[] r=repl.toCharArray();
for(int i=0;i<=r.length-1;i++) {
	if(r[i]=='a' || r[i]=='A' ||r[i]=='e'||r[i]=='E'||r[i]=='i'||r[i]=='A'||r[i]=='o'||r[i]=='O'||r[i]=='u'||r[i]=='U'){
		empty= r[i];
		System.out.println(empty+",");
	}
}




}
}
