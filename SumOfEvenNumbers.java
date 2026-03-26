//OUTPUT
//Sum of even numbers: 12

package anudip;
import java.util.ArrayList;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// Create an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		int sum = 0;

		// Loop through the ArrayList
		for (int num : numbers) {
			if (num % 2 == 0) {   // Check if number is even
				sum += num;
			}
		}

		// Display result
		System.out.println("Sum of even numbers: " + sum);
	}


}


