import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		
		while(cases < 1 || cases > 1000) {
			cases = s.nextInt();
		}
		
		int count = 0;
		double[][] output = new double[cases][3];

		while (cases > count) {
			int beats = s.nextInt();
			double period = s.nextDouble();

			while (beats < 2 || beats > 1000) {
				beats = s.nextInt();
			}
			while (period < 0 || period > 999) {
				period = s.nextDouble();
			}

			double tax = 60 / period;
			double calculated = 60 * beats / period;
			double min = calculated - tax;
			double max = calculated + tax;

			output[count][0] = min;
			output[count][1] = calculated;
			output[count][2] = max;

			count++;
		}

		for (int l = 0; l < cases; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%.4f ", output[l][c]);
			}
			System.out.println(" ");
		}
		
		s.close();
	}

}
