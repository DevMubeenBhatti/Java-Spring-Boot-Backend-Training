package com.api.oop.assignment02;

abstract class Animal{
	abstract public void sound();
}

class Cat extends Animal {
	public void sound() {
		System.out.println("Cat Moow");
	};
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog Barke");
	}
}

public class Assingment02 {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.sound();
		dog.sound();
	}
}
