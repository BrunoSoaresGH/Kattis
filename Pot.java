import java.util.Scanner;
import java.lang.Math;

public class Pot {

	static Scanner scanner = new Scanner(System.in);

	static int repeticoes = getRepeticoes();
	static int valorTotal = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= repeticoes; i++) {
			valorTotal += getValorSoma();
		}

		System.out.println(valorTotal);

	}

	private static int getRepeticoes() {
		String entrada = scanner.nextLine();
		int valor = Integer.parseInt(entrada);
		return valor;
	}

	private static int getValor() {
		String entrada = scanner.nextLine();
		int valor = Integer.parseInt(entrada);
		return valor;
	}

	private static int getValorSoma() {
		int valorSoma;
		int valorEntrada = getValor();
		double valorBase = Math.round(valorEntrada / 10);
		double expoente = valorEntrada % 10;
		valorSoma = (int) Math.pow(valorBase, expoente);
		return valorSoma;
	}

}
