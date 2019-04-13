package com.class22;

public class Child2 extends Parent {

	
	public static void main(String[] args) {
		
		Child1 childObject2=new Child1();
		System.out.println("Child 1 eye color "+childObject2.eyeColor);
		System.out.println("Child 1 hair color "+childObject2.hairColor);
		System.out.println("Child 1 has "+childObject2.nose+" nose");
		childObject2.sing();
		childObject2.swim();
		
}
	public void swim() {
		System.out.println("Child 2 can swim");
	}	
}
