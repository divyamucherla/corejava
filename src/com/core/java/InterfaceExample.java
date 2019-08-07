package com.core.java;

public interface  InterfaceExample {

	void news();
	
}

class Paper implements InterfaceExample{

	
	public void news() {
		
		System.out.println("in news method");
	}
	
	public String magazine() {
		return "news from magazine";
		
	}
	
	public static void main(String[] args) {
		Paper paper= new Paper();
		paper.news();
		System.out.println(paper.magazine());
	}
}
