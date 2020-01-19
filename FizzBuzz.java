import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int n = s.nextInt();
		
		while(x < 1 || x > y) {
			x = s.nextInt();
		}
		
		while(y > n) {
			y = s.nextInt();
		}
		
		while(n > 100) {
			n = s.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			boolean notDivided = true;
			if(i%x == 0 && i%y != 0) {
				System.out.println("Fizz");
				notDivided = false;
			} 
			if (i%x != 0 && i%y == 0) {
				System.out.println("Buzz");
				notDivided = false;
			} 
			if(i%x == 0 && i%y == 0) {
				System.out.println("FizzBuzz");
				notDivided = false;
			}
			if(notDivided) {
				System.out.println(i);
			}
			
		}
		s.close();
	}
}
