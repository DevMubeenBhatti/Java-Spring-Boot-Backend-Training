package com.api.java_basic.assignment.exception_handling;

public class TestException {

	public static void main(String[] args) {
		int i,j,k=0;
		i=8;
		j=0;
		try {
			k=i/j;
		}
		catch(Exception e) {
			System.out.println("Cannot Divide By Zero: " + e);
		}
		System.out.println("K out put: " + k);
	}
}

/*
Throwable:
==========
	- Exception
		-Checked
			-IOException
			-SQLException
		-Unchecked
			-RuntimeExcetption
				-ArithmeticException
	-Error
*/
