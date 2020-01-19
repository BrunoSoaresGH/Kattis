import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int articles = s.nextInt();
		int impact = s.nextInt();
		
		while(articles < 1 || articles > 100) {
			articles = s.nextInt();
		}
		
		while(impact < 1 || impact > 100) {
			impact = s.nextInt();
		}
		
		System.out.println((articles*(impact - 1) + 1));
		s.close();

	}

}
