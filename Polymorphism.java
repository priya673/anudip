package anudip;

class animal {
	void sound() {
		System.out.println("Animals make a sound");
	}
}

class dog extends animal{
	void sound() {
		System.out.println("Dog barks");
	}
}

class cat extends animal{
	void sound()
	{
	System.out.println("cats meows");	
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		animal a;
		a = new dog();
		a.sound();
		
		a = new cat();
		a.sound();
	}

}
