package com.core.java;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getPriority());
	t.sleep(10);
		System.out.println("Name of thread is " + t);
	}

}
