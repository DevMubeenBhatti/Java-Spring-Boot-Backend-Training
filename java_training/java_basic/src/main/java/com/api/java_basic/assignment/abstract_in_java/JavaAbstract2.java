package com.api.java_basic.assignment.abstract_in_java;

abstract class Bike1{
	Bike1(){
		System.out.println("bike is created...");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed...");
	}
}
class Honda3 extends Bike1{
	void run() {
		System.out.println("running safely...");
	}
}

public class JavaAbstract2 {
	public static void main(String[] args) {
		Bike1 obj2 = new Honda3();
		obj2.run();
		obj2.changeGear();
	}
}
