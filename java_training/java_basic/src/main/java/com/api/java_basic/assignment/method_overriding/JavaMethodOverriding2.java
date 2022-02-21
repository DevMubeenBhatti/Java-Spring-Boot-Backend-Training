package com.api.java_basic.assignment.method_overriding;

// parent class
class Vehicles{
	void run() {
		System.out.println("vehicle is running");
	}
}
// creating child class

public class JavaMethodOverriding2 extends Vehicles{
	public static void main(String[] args) {
//		creating an instance of a child class
		JavaMethodOverriding2 obj = new JavaMethodOverriding2();
		obj.run();
	}
}
