package com.core.java;

public class PolymorphismExample {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	//overload
	public int add(int a, int b,int c) {
		return a*b*c;
	}

}

class B extends PolymorphismExample{
	//override
	//with inheritance we can change the name of the method add to add1
	public int add(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		PolymorphismExample ref= new PolymorphismExample();
		B b= new B();
		System.out.println(b.add(1, 2));
		System.out.println(b.add(1, 2, 3));
		System.out.println(ref.add(2, 3));
		System.out.println(ref.add(2, 3, 4));
	}
	
}