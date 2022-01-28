package com.api.java_basic.assignment.loop;

public class WhileLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11};
		int i = 0;
		System.out.println("even");
		while(i<a.length) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			i+=1;
		}
		int b = 0;
		System.out.println("odd");
		while(b<a.length) {
			if(a[b]%2!=0) {
				System.out.println(a[b]);
			}
			b+=1;
		}

	}

}
