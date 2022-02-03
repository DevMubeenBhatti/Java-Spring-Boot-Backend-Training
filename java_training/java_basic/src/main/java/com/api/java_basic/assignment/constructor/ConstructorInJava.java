package com.api.java_basic.assignment.constructor;


class Calc{
	int numb1;
	int numb2;
	int result;
	
	public Calc() {
		numb1 = 5;
		numb2 = 5;
		System.out.println("Constructor call Auto" );
	}
	public Calc(int n) {
		numb1 = n;
		numb2 = n;
	}
	public Calc(double d, int n) {
		numb1 = (int)d;
		numb2 = n;
	}
}

public class ConstructorInJava {

	public static void main(String[] args) {

//		Calc obj = new Calc();
		Calc obj = new Calc(18.75, 7);
		System.out.println(obj.numb1);
	}

}
