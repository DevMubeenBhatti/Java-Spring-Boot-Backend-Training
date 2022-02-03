package com.api.java_basic.assignment.constructor;

class Employee{
//	default constructor
	Employee(){
		
	}
//	first constructor
	Employee(String s, int i){
		System.out.println("Empoyee id:" + i);
		System.out.println("Employee name:" + s);
	}
//	constructor overloaded
	Employee(String s, int i, int salary){
		System.out.println("emp id: " + i);
		System.out.println("emp name: " + s);
		System.out.println("emp salary: " + salary);
	}
}
public class ConstructorJava {
	public static void main(String[] args) {
		Employee obj = new Employee("Mubeen", 1);
		Employee obj2 = new Employee("mubeen", 10000);
	}
}
