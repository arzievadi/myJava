package com.class11;

public class ReCapArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//lets create array of names that will hold 5 elements 
		//and retreat all values
		
	//1,2 ways
	
   String[] names=new String[7];//5 elements     
   names[0]="Asel";
   names[1]="Awet";
   names[2]="Arif";
   names[3]="Weqas";
   names[4]="Dzmitri";
   names[5]="Shiva"; //will get a runtime exception when trying to access it
	names[6]="Sandesh";
   for(int i=0;i<names.length;i++) {
	   System.out.println(names[i]);
   }
   
   //2.create an array using literal array-------------for loop-----------------
   
   String[] studentNames= {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"} ;

   for(int i=0;i<=studentNames.length-1;i++) {
	   System.out.println(studentNames[i]);
   }
   
  // ---------------------retrieve values using: -advanced for loop,
  //                                              - for each loop,
  //                                               -enhanced for loop
   
   
   //syntax will be
   
   //     type  any name   array or collection------advanced for loop---------------
    for (String student:studentNames) {//studentNames will be stored in student ea name
    	 System.out.println(student);//student going to loop all elements, access all elements
    }
    
   
	}

}
