package com.api.java_basic.assignment.constructor;

class MyEmployee{
	private int id;
	private String name;
//	constructor
	MyEmployee(String myName, int myId){
		id = myId;
		name = myName;
	}
	
//	getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class ConstructorJavaOverLoading {
	public static void main(String[] args) {
		MyEmployee obj = new MyEmployee("Mubeen", 1);
		System.out.println("emp id: " + obj.getId());
		System.out.println("emp name: " + obj.getName());
	}

}
