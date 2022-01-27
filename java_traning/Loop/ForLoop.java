package com.api.training.loop;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("For loop print even odd");
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("even");
		for(int i =0; i<num.length; i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("odd");
		for(int b= 0; b<num.length; b++) {
			if(num[b]%2 !=0) {
				System.out.println(num[b]);
			}
		}

	}

}
