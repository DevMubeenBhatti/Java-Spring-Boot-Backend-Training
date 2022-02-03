package com.api.java_basic.assignment.constructor;


class stdNew{
	int id;
	String name;
	
	stdNew(int i, String s){
		id = i;
		name = s;
	}
	void display() {
		System.out.println(id + name);
	}
}

public class Paramerizedconstructor {

	public static void main(String[] args) {
		stdNew obj = new stdNew(1, " Mubeen");
		obj.display();
		
	}

}
