import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		
		if(amount%2 == 1) System.out.println("Alice");
		else System.out.println("Bob");
			
	}

}
