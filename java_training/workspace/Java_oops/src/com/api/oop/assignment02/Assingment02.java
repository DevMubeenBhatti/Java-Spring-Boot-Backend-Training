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
//		Animal cat = new Cat();
//		Animal dog = new Dog();
//		cat.sound();
//		dog.sound();
		
	       // integer-type
		int s1 = 10;
		char s2 = 'a';
        System.out.println(s1 == s2);
 
        // char-type
        System.out.println('a' == 'b');
 
        // char and double type
        System.out.println('a' == 97.0);
 
        // boolean type
        System.out.println(true == true);
	}
}
