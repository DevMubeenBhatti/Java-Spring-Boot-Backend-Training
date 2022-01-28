package com.api.java_training.loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("Even odd nmber useing do while loop");
		int a[]= {1,2,3,4,5,6,7,8,9,10}; 
		
		System.out.println("even");
		int i = 0;
		do {
			if(a[i]%2==0)
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
		System.out.println("odd");
		int b = 0;
		do {
			if(a[b]%2!=0)
			System.out.println(a[b]);
			b++;
		}while(b<a.length);

	}

}
