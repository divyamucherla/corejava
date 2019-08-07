package com.core.java;

public abstract class AbstractionExample {
	// without return type
	// abstract void vechicle();
	abstract String vechicle();

	public String bike() {
		System.out.println("this is base class");
		return "base with return type";
	}

	abstract String Cost() ;/*{
		return "4L";
		
	}*/
	static void m1() {
		
	}
}

class Car extends AbstractionExample {
	/*
	 * without return type void vechicle() {
	  System.out.println("this is child class"); }
	 */
	String vechicle() {
		System.out.println("child class");
		return "child with return type";
	}
	
	

public static void main(String[] args) {
	Car car = new Car();
		/*
		  car.bike(); car.vechicle();
		 */
	String str=car.bike();
	System.out.println(str);
	String s=car.vechicle();
	System.out.println(s);
	String s1=car.Cost();
	System.out.println(s1);
}

final String Cost() {
	// TODO Auto-generated method stub
	return "4L";
}
}
