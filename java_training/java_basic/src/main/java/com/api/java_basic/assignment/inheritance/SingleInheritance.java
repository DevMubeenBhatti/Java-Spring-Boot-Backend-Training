package com.api.java_basic.assignment.inheritance;

// class 
class Animal{
//	method
	void eat() {
		System.out.println("cat eat...");
	}
}
// class
class Dog extends Animal{
//	method
	void bark() {
		System.out.println("dog bark...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();
		obj.bark();
	}
	
}
