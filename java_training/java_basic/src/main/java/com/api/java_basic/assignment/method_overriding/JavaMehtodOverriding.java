package com.api.java_basic.assignment.method_overriding;

//  creating a parent class.
class Vehicle{
//	defining a method
	void run() {
		System.out.println("vehicle is running...");
	}
}
class Bike{
//	defining as same method in parent class
	void run() {
		System.out.println("Bick is runing");
	}
}


public class JavaMehtodOverriding {

	public static void main(String[] args) {
		Bike obj= new Bike();// creating object
		obj.run();// calling method
	}
}
