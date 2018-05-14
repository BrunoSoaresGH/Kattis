import java.util.Scanner;

public class StuckInATimeLoop {

	static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
	 
		int input = getEntrada(); 
		
		for(int i = 1; i<= input; i++) {
			System.out.println(i + " Abracadabra");
		} 
	}

	private static int getEntrada() {
		String entrada = scanner.nextLine();
		int valor = Integer.parseInt(entrada);
		return valor;
	} 
	
}