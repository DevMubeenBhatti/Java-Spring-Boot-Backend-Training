package com.api.java_basic.assignment.abstract_in_java;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle1 extends Shape{
	void draw() {
		System.out.println("Drawing circle");
	}
}


public class TestAbstraction {
	
	public static void main(String[] args) {
	Shape r = new Rectangle();
	Shape c = new Circle1();
	r.draw();
	c.draw();

	}

}
