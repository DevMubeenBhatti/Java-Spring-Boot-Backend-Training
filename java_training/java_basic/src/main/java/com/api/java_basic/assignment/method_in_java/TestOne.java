package com.api.java_basic.assignment.method_in_java;

class Adder{
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
public class TestOne {
	public static void main(String[] args) {
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10, 20, 30));
	}
}
