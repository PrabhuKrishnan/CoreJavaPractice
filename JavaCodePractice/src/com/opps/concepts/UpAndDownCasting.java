package com.opps.concepts;

class Animal {

	void eat() {
		System.out.println("eat method from parent class...");
	}
}

	class Cat extends Animal {

		@Override
		void eat() {

			System.out.println("eat method from cat class...");

		}

		void catSound() {
			System.out.println("catSound method from cat class...");
		}

	}



public class UpAndDownCasting {
	public static void main(String[] args) {

		Animal animal = new Cat();
		animal.eat();  //cat class method
		
		   ((Cat) animal).catSound();
		
		
		
		

	}
}
