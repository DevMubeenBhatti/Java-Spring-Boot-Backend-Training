package com.api.java_training.statement;
//import java.util.Scanner;

public class myFirstClass {

	public static void main(String[] args) {
	   /*int k = 4;
		for (int i = 0; i < k; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tempurature: ");
		int temperature = sc.nextInt();
		if(temperature > 50) {
			System.out.println("Too Hot temperature");
			return;
		}
		String temperatureType = (temperature <= 20) ? "Cool " : 
			(temperature >= 20 && temperature <= 30) ? "Normal " : 
			(temperature >= 30 && temperature <= 50) ? "Summer " : " ";
		System.out.println("Temperature is => " + temperature + "... It is " + temperatureType);
		}*/
		
		int temperature = 19;
		if(temperature < 20) {
			System.out.println("Cool");
		}else if(temperature >= 20 && temperature <= 30) {
			System.out.println("Normal");
		}else{
			System.out.println("Summer");
		}
	}
};