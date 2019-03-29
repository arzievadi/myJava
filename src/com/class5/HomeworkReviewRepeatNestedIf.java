package com.class5;

public class HomeworkReviewRepeatNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check if user has credit card----
		//check what is the balance if balance is more than 1000 ----pay off now
	//else "you are good"
	
	boolean creditCard=true;
	int balance=900;
	if(creditCard) {
		System.out.println("lets check the balance");
		if(balance>=1000) {
			
		System.out.println("pay off now");
		}else
		{
			System.out.println("you are good");
		}
	}else {
		System.out.println("do you want a credit card");
	}
	}

}
