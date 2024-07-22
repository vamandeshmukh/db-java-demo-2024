package com.db.demo.lamb;

// DRY - Don't Repeat Yourself.

public class InheritanceDemo {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();

	}
}

class Animal {

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {

}

class Cat extends Animal {

}
