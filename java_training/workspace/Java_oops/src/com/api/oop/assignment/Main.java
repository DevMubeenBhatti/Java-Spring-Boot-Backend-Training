package com.api.oop.assignment;

interface Animal{
	public void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat implements Animal {
	public void sound() {
		System.out.println("Cat moow");
	}
}

//public class Main {
//	public static void main(String[] args) {
//		Animal cat = new Cat();
//		Animal dog = new Dog();
//		cat.sound();
//		dog.sound();
//	}
//}
