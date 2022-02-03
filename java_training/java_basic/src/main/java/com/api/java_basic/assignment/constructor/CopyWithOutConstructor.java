package com.api.java_basic.assignment.constructor;

class Student9{
	int id;
	String name;
	
	Student9(int i, String n){
		id = i;
		name = n;
	}
	Student9(){}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
}
public class CopyWithOutConstructor {

	public static void main(String[] args) {
		Student9 s1 = new Student9(1, "Mubeen");
		Student9 s2 = new Student9();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}

}
