import java.util.Scanner;

public class Planina {

	static Scanner scanner = new Scanner(System.in);
	
	private static int getValue() {
		String input = scanner.nextLine(); 
		int value = Integer.parseInt(input); 
		return value;
	} 
	
	private static int getNumber(int value){
		int total = 0; 
		for(int i = 1; i <= value; i++) {
			total += (int) Math.pow(2, (i-1));
		}
		return (int) Math.pow((2 + total),2);
	}
	
	public static void main(String[] args) {
		int input = getValue(); 
		System.out.println(getNumber(input));
	}

}
