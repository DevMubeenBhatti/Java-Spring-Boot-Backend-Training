package com.api.java_basic.assignment.constructor;


class Student {
//	public Student() {
//		System.out.println("Default consturtor");
//	}
	
	
	int id;
	String name;
	
//	method
	void display() {
		System.out.println(id + name);
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
//		Student obj = new Student();
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.display();
		obj2.display();
	
	}

}
