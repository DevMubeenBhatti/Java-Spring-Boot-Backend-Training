package com.api.java_basic.assignment.loop;

public class ForEachLoop {

	public static void main(String[] args) {
		/*		System.out.println("ForEach loop use print even odd number");
		int[] numb = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("even");
		for(int i: numb) {
			if(numb[i]%2==0) {
				System.out.println(numb[i]);
			}
			
		}
		System.out.println("odd");
		for(int b: numb) {
			if(numb[b]%2 != 0) {
				System.out.println(numb[b]);
			}
		}
		//https://www.geeksforgeeks.org/for-each-loop-in-java/
		//https://runestone.academy/ns/books/published//csawesome/Unit6-Arrays/topic-6-3-arrays-with-foreach.html
		*/

		System.out.println("ForEach loop print even odd number");
		int[] values = {1,2,3,4,5,6,7,8,9,10};

		for(int val: values) {}

		System.out.println("even");
		for(int e: values) {
			if(e%2==0) {				
				System.out.println(e);
			}
		}
		System.out.println("odd");
		for(int o: values) {
			if(o%2 != 0) {
				System.out.println(o);
			}
		}

	}

}
