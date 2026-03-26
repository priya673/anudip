package anudip;

abstract class Animal {

	// Abstract method (no body)
	abstract void sound();


	void sleep() {
		System.out.println("Animal is sleeping");
	}
}


class Dog extends Animal {


	void sound() {
		System.out.println("Dog barks");
	}
}

public class Abstraction{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.sleep();
	}
}

