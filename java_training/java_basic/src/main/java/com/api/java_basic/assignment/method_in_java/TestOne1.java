package com.api.java_basic.assignment.method_in_java;

class Adder1{
	static int add1(int a, int b) {
		return a + b;
	}
	static double add1(double a, double b) {
		return a + b;
	}
}

class TestOne1 {
	public static void main(String[] args) {
		System.out.println(Adder1.add1(10, 20));
		System.out.println(Adder1.add1(10.75, 18.75));
	}

}
