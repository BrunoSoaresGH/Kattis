import java.util.Scanner;

public class R2 {
	
	static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) { 
		int[] entradas = getValores();
		int R1 = entradas[0]; 
		int S = entradas[1]; 
		
		System.out.println((2*S - R1));
	}

	private static int[] getValores() {
		String entrada = scanner.nextLine();
		int[] valores = new int[2];
		String R1 = entrada.split(" ")[0];
		String S = entrada.split(" ")[1];
		valores[0] = Integer.parseInt(R1);
		valores[1] = Integer.parseInt(S);

		return valores;
	}

}
