import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(input.length() > 100) {
			input = s.nextLine();
		}
		
		String inputMaiusculo = input.toUpperCase();
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == inputMaiusculo.charAt(i) && input.charAt(i) != '-') {
				output.append(input.charAt(i));
			}
		}
		
		System.out.println(output);
	}

}
