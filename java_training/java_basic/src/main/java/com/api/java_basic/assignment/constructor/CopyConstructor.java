package com.api.java_basic.assignment.constructor;

class Student3{
	int id;
	String name;
	
//	constructor
	Student3(int i, String n){
		id = i;
		name = n;
	}
//  construtor inilization other obj
	Student3(Student3 s){
		id = s.id;
		name = s.name;
	}
//	method
	void display() {
		System.out.println(id + name);
	}
	
}


public class CopyConstructor {

	public static void main(String[] args) {
		Student3 obj = new Student3(1, "Mubeen");
		Student3 s3 =  new Student3(obj);
		obj.display();
		s3.display();
	}

}
