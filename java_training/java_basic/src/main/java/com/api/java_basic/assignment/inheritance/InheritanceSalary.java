package com.api.java_basic.assignment.inheritance;

class Employee{
	float salary = 45000;
}

public class InheritanceSalary extends Employee {
	int bound = 5000;
	public static void main(String[] agrs) {
		InheritanceSalary obj = new InheritanceSalary();
		System.out.println("salary: " + obj.salary);
		System.out.println("bouns: " + obj.bound);
	}
}
