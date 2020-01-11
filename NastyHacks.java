import java.util.Scanner;

public class NastyHacks {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		int r = 0, e = 0, c = 0;
		String[] output = new String[cases];
		
		while (cases < 1 || cases > 100) {
			cases = s.nextInt();
		}
		
		for (int count = 0; count < cases; count++) {
			r = s.nextInt();
			e = s.nextInt();
			c = s.nextInt();
			while (r < -1000000) {
				r = s.nextInt();
			}
			while (e > 1000000) {
				e = s.nextInt();
			}
			while (c < 0 || c > 1000000) {
				c = s.nextInt();
			}
			if (e > (r + c)) output[count] = "advertise";
			if (e == (r + c)) output[count] = "does not matter";
			if (e < (r + c)) output[count] = "do not advertise";
		}
		
		for (String string : output) {
			System.out.println(string);
		}		
	}
}
