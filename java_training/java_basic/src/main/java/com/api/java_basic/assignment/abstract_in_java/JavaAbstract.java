package com.api.java_basic.assignment.abstract_in_java;

abstract class Bike{
	abstract void run();
}

public class JavaAbstract extends Bike {
	void run() {
		System.out.println("running safely...");
	}
	public static void main(String[] args) {
	Bike obj = new JavaAbstract();
	obj.run();
	}
}
