import java.util.Scanner;

public class HissingMicrophone {

	static Scanner scanner = new Scanner(System.in); 
	
	private static String getInput() {
		String text = scanner.nextLine(); 
		return text;
	}
	
	public static void main(String[] args) {
		String input = getInput(); 
		if(input.contains("ss")) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
	}

}
