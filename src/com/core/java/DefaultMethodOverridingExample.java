package com.core.java;

@FunctionalInterface
public interface DefaultMethodOverridingExample {
	
	void show();
	
	//static you can't override
	//default method you can override
	default void display() {
		System.out.println("Base default class");
	}


//implementing two interfaces at a time(multiple inheritance)
class A implements DefaultMethodOverridingExample,InterfaceExample{

	@Override
	public void show() {
		System.out.println("child class");
		
	}
	
	
	public void display() {
		System.out.println("child default class");
	}

	
	@Override
	public void news() {
		// TODO Auto-generated method stub
		
	}

	
	
}
public static void main(String[] args) {
	A a= new A();
	a.display();
	a.show();
	
}

}
