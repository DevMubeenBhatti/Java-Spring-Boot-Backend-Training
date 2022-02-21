package com.api.oop.assignment03;

public class Assingment03 {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.setId(1);
		dev.setName("Aneeq");
		dev.setPosition("Full_Stack");
		dev.setDepartment("Intergration_FrameWork");
		dev.setCanCode(true);
		System.out.println(
				dev.getId() + " " +
				dev.getName() + " " +
				dev.getPosition() + " " +
				dev.getDepartment() + " " +
				dev.isCanCode() 
		);
		
		Manager manger = new Manager();
		manger.setId(2);
		manger.setName("Tariq");
		manger.setPosition("G.Manager");
		manger.setDepartment("Intergration_FrameWork");
		manger.setManager(true);
		manger.setResponsibility("Team Lead");
		System.out.println(
				manger.getId() + " " +
				manger.getName() + " " +
				manger.getPosition() + " " +
				manger.getDepartment() + " " +
				manger.isManager() + " " +
				manger.getDepartment()
		);
		
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Office Boy");
		emp.setPosition("Observer");
		emp.setDepartment("Service");
		System.out.println(
				emp.getId() + " " +
				emp.getName() + " " +
				emp.getPosition() + " " +
				emp.getDepartment()
		);
	}

}