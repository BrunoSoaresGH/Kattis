import java.util.ArrayList;
import java.util.Scanner;

public class Oddities {

	static Scanner scanner = new Scanner(System.in);

	private static int getInput() {
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}

	private static String oddOrEven(int number) {
		if (number % 2 == 0) {
			return " is even";
		} else {
			return " is odd";
		}
	}

	public static void main(String[] args) {
		
		int input = getInput(); 
		int[] numbers = new int[input];
		
		for(int i = 0; i < input; i++) {
			String numberRead = scanner.nextLine(); 
			int number = Integer.parseInt(numberRead); 
			numbers[i] = number;
		}
		
		for(int i = 0; i< input; i++) {
			System.out.println(numbers[i] + oddOrEven((int) numbers[i])); 
		}
}
}