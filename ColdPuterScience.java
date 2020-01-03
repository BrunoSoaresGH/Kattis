import java.util.Scanner;

public class ColdPuterScience {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int counter = 0;
		int quantity = s.nextInt();
		while(quantity < 1 || quantity > 101) {
			System.out.println("Please insert a value between 0 and 101");
			quantity = s.nextInt();
		}
		
		for(int i = 0; i < quantity; i++) {
			int temperature = s.nextInt(); 
			if(temperature < 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
