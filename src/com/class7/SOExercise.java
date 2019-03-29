package com.class7;

public class SOExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//compound operator
		
	//	1. Declare variable and increase by 100 using shorthand operator
       // * 2. Declare variable and decrease by 67 using shorthand operator
     //   * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
     ///   * each person should get an equal piece of cake
     ///   *
      ///  * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
      //  * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people	
		
		
		
		//1. 
		int a=100;
		a+=100;
		System.out.println(a);
		
		//.2
		int b;
		
		b=67;
		b-=67;
		System.out.println(b);
		
		//3.
		int cakep=11;
cakep/=4;
		
		System.out.println(cakep);
		
		
		//////
		cakep%=4;
		System.out.println(cakep);
		
		
		//4.
		int cakep1=25;
		 cakep1/=7;
		 System.out.println(cakep1);// would be 3
		////////
	 
	 cakep1%=7;
	 System.out.println(cakep1);//would be 4 with mod
	 
	 
	}

}
