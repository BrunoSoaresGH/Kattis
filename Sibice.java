import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		int weight = s.nextInt();
		int height = s.nextInt();
		double maxSize = Math.sqrt((weight*weight) + (height*height));
		String output = "";
		
		while(amount < 1 || amount > 50) {
			amount = s.nextInt();
		}
		while(weight < 1 || weight > 100) {
			weight = s.nextInt();
		}
		while(height < 1 || height > 100) {
			height = s.nextInt();
		}
		
		for(int count = 0; count < amount; count++) {
			int size = s.nextInt(); 
			if(size > maxSize) { 
				output = output + "NE";
			}
			else {
				output = output + "DA";
			}
		}
		
		String result = "";
		for(int count = 0; count < output.length(); count++) {
			if(count%2 == 1) {
				result = result + output.charAt(count - 1) + output.charAt(count);
				System.out.println(result);
			}
			result = "";
		}
	}

}
