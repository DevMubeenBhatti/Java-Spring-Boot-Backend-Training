package com.api.java_basic.assignment.method_in_java;

class OverLoadingCalcuation2{
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}
	void sum(long a, long b) {
		System.out.println("long method invoked");
	}
}

public class TestOne2 {

	public static void main(String[] args) {
		OverLoadingCalcuation2  obj = new OverLoadingCalcuation2();
		obj.sum(20,22);

	}

}
