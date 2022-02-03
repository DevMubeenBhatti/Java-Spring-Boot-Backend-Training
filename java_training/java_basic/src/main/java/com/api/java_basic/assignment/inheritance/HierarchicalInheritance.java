package com.api.java_basic.assignment.inheritance;


class OurAnimal{
	void ourEat() {
		System.out.println("eating...");
	}
}

class OurDog extends OurAnimal{
	void ourDog() {
		System.out.println("dog...");
	}
}
class OurDogPets extends OurAnimal{
	void ourPet() {
		System.out.println("pets...");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		OurDogPets obj = new OurDogPets();
		obj.ourEat();
		obj.ourPet();
//		obj.ourDog(); // get an error
	}

}
