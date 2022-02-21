package com.api.java_basic.assignment.exception_handling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestExecptionBufferReader {
	public static void main(String[] args) {
		int i,j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=8;	
		try {
			System.out.println("Enter a number:");
			j=Integer.parseInt(br.readLine());
			k=i/j;
			System.out.println("Output is: " + k);
			System.out.println("BYE: ");
		}
		catch(IOException e) {
			System.out.println("Some IO Error: " + e);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide By Zero: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum number of value is 4: ");
		}
		catch(Exception e) {
			System.out.println("Unknown Exception: ");
		}
		finally {
			System.out.println("Finally BYE: ");
		}
		System.out.println(k);
	}	
}
