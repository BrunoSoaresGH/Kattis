import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int kings = s.nextInt();
		int queens = s.nextInt();
		int rooks = s.nextInt();
		int bishops = s.nextInt();
		int knights = s.nextInt();
		int pawns = s.nextInt();
		
		System.out.println((1 - kings) + " " + (1 - queens) + " " + (2 - rooks) + 
				" " + (2 - bishops) + " " + (2 - knights) + " " + (8 - pawns));
	}

}
