import java.util.Scanner;

public class QuadrantSelection {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int x = getEntrada();
		int y = getEntrada();

		while (x < -1001 || x > 1001 || y < -1001 || y > 1001 || x == 0 || y == 0) {
			System.out.println("Os valores devem estar entre -1000 e 1000 e nao podem ser 0");
			x = getEntrada();
			y = getEntrada();
		}
		System.out.println(getQuadrante(x, y));
	}

	private static int getEntrada() {
		String entrada = scanner.nextLine();
		int valor = Integer.parseInt(entrada);
		return valor;
	}

	private static int getQuadrante(int input1, int input2) {
		int valor;
		if (input1 > 0 && input2 > 0) {
			valor = 1;
		} else if (input1 < 0 && input2 > 0) {
			valor = 2;
		} else if (input1 < 0 && input2 < 0) {
			valor = 3;
		} else {
			valor = 4;
		}
		return valor;
	}

}
