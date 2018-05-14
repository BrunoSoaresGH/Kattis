import java.util.Scanner;

public class Zamka {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int L = getMinimo(); 
		int R = getMaximo(); 
		int X = getSoma();
		
		while(R < L) {
			System.out.println("O valor maximo tem que ser maior ou igual ao minimo!");
			L = getMinimo(); 
			R = getMaximo(); 
		} 
		
		while(R > 10000 || L > 10000 || R < 0 || L < 0){
			System.out.println("Valores invalidos! Deve estar entre 1 e 10000"); 
			L = getMinimo(); 
			R = getMaximo();
		}
		
		while(X < 0 || X > 37) {
			System.out.println("A soma dos algarismos deve estar entre 1 e 36!");
			X = getSoma();
		}
		
		
		for(int i = L; i <= R; i++) {
			if(getSomaAlgarismo(i) == X){
				System.out.println(i);
				break; 
			}
		}
		
		for(int i = R; i >= L; i--) {
			if(getSomaAlgarismo(i) == X){
				System.out.println(i);
				break; 
			}
		}
		
	}
	
	private static int getMinimo() {
		String valorMinimo = scanner.nextLine();
		int minimo = Integer.parseInt(valorMinimo);
		return minimo;
	} 
	
	private static int getMaximo() {
		String valorMaximo = scanner.nextLine();
		int maximo = Integer.parseInt(valorMaximo);
		return maximo;
	} 
	
	private static int getSoma() {
		String valorSoma = scanner.nextLine();
		int soma = Integer.parseInt(valorSoma);
		return soma;
	} 
	
	  private static int getSomaAlgarismo(int numero) {
		  int soma = 0; 
		  while(numero >= 10) {
		  soma = soma + (numero%10);  
		  numero = Math.round(numero/10);
		  } 
		  if(numero < 10) soma = soma + numero; 
		  return soma; 
	  }
	
}
