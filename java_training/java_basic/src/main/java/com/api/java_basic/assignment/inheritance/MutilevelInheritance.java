package com.api.java_basic.assignment.inheritance;


class MyAnimal{
	void eat() {
		System.out.println("eat...");
	}
}
class MyDog extends MyAnimal{
	void bark() {
		System.out.println("bark...");
	}
}

class BabyAnimal extends MyDog{
	void crying() {
		System.out.println("weeping...");
	}
}

public class MutilevelInheritance {

	public static void main(String[] args) {
		BabyAnimal obj = new BabyAnimal();
		obj.eat();
		obj.bark();
		obj.eat();
	}
}
