package anudip;
import java.util.Scanner;

class Animals {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class dogs extends Animals {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends dogs {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
		    Animals animals;

		    System.out.println("Choose an animal:");
		    System.out.println("1. Animal");
		    System.out.println("2. Dog");
		    System.out.println("3. Cat");
		    System.out.print("Enter your choice: ");

		    if (!sc.hasNextInt()) {
		        System.out.println("Invalid input! Please enter a number.");
		        sc.close();
		        return;
		    }

		    int choice = sc.nextInt();

		    switch (choice) {
		        case 1: animals = new Animals(); break;
		        case 2: animals = new dogs(); break;
		        case 3: animals = new Cat(); break;
		        default:
		            System.out.println("Invalid choice!");
		            sc.close();
		            return;
		    }

		    animals.makeSound();
		    sc.close();
		
	}

}



