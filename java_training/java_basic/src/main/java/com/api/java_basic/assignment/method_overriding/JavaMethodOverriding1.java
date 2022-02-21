package com.api.java_basic.assignment.method_overriding;

// parent class
class Bank{
	int getRateOfInterest() {
		return 0;
	}
}
// creating child classes
class SBI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class ICIC extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}

public class JavaMethodOverriding1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		SBI  s = new SBI();
		ICIC c = new ICIC();
		AXIS a = new AXIS();
		System.out.println("Bank interest: " + b.getRateOfInterest());
		System.out.println("SBI interest: " + s.getRateOfInterest());
		System.out.println("ICIC interest: " + c.getRateOfInterest());
		System.out.println("AXIS interest: " + a.getRateOfInterest());
		

	}

}
