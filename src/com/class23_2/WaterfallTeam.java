package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee {

	public static void main(String[] args) {
		
		WaterfallTeam wt=new WaterfallTeam();
	wt.salary1=90000;//can access protected values from different package through inheritance
	//wt.salary=54541;//default values can not be accessed in different package same with method
	
	wt.test();//available coz it is protected
	//wt.test1();not available coz it is default
	
	}
	
}
