import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		int plano = s.nextInt(); 
		int quantidadeMeses = s.nextInt();
		int totalMeses = plano*(quantidadeMeses + 1);
		
		for(int i = 0; i < quantidadeMeses; i++) {
			int gastoMes = s.nextInt(); 
			totalMeses -= gastoMes;
		}
		
		System.out.println(totalMeses);
	}

}
