package anudip;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Intentionally accessing beyond array limit
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        }

        System.out.println("Program continues after exception handling.");
    
	}

}
