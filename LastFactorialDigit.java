import java.util.Scanner;

public class LastFactorialDigit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		int[] output = new int[cases];

		while (cases < 1 || cases > 10) {
			cases = s.nextInt();
		}

		for (int count = 0; count < cases; count++) {
			int input = s.nextInt();
			int factor = 1;
			for (int i = 0; i < input; i++) {
				factor += factor * i;
			}
			output[count] = factor % 10;
		}

		for (int i : output) {
			System.out.println(i);
		}
	}

}
