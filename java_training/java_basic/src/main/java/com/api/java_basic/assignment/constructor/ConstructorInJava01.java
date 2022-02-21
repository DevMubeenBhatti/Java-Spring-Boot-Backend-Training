package com.api.java_basic.assignment.constructor;

class STD3{
	int id;
	int age;
	String name;
	STD3(){
		System.out.println("no parameter dafault");
	}
	STD3(int id, String name){
		this.id = id;
		this.name = name;
	}
	STD3(int Id, int Age, String Name){
		id = Id;
		age = Age;
		name = Name;
	}
	void display() {
		System.out.println(" id :" + id + " name :" + name + " age :" + age);
	}
}

public class ConstructorInJava01 {

	public static void main(String[] args) {
		System.out.println("ANEEQ");
		STD3 s1 = new STD3(10, 24, "aneeq");
		STD3 s3 = new STD3();
		s1.display();
//		s3.display();
	}
}
