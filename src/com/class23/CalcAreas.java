package com.class23;

public class CalcAreas {
	/*Create 1 class in which create a methods that will calculate the area of
Rectangle-----  width*length(5*4)
Square----width*width(4)
box----width*length*height
Use separate class to test your code
	 * /
	 */
	
	
	public void getArea(int a,int b) {
		System.out.println("the area of rectangle "+(a*b));
		
	}
	public void getArea(int a) {
		System.out.println("area of square "+(a*a));
		
	}
	public void getArea(int width,int length,int height) {
		System.out.println("area of box "+(width*length*height));
		
	}
}
