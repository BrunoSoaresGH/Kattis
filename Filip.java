import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		while (a == b) {
			System.out.println("a and b can't be equal");
			a = s.nextInt();
			b = s.nextInt();
		}

		while (a < 100 || a % 100 == 0 || a % 10 == 0) {
			System.out.println("a nao pode ser menor que 100 ou conter 0's");
			a = s.nextInt();
			while (a == b) {
				System.out.println("a and b can't be equal");
				a = s.nextInt();
				b = s.nextInt();
			}
		}

		while (b < 100 || b % 100 == 0 || b % 10 == 0) {
			System.out.println("b nao pode ser menor que 100 ou conter 0's");
			b = s.nextInt();
			while (a == b) {
				System.out.println("a and b can't be equal");
				a = s.nextInt();
				b = s.nextInt();
			}
		}

		if (inverte(a) > inverte(b)) {
			System.out.println(inverte(a));
		} else {
			System.out.println(inverte(b));
		}

	}

	private static int inverte(int number) {
		int invertedNumber = 0;
		int centena = 0;
		int dezena = 0;
		int unidade = 0;

		while (number >= 100) {
			number = number - 100;
			centena++;
		}

		while (number >= 10) {
			number = number - 10;
			dezena++;
		}

		unidade = number;

		invertedNumber = unidade * 100 + dezena * 10 + centena;
		return invertedNumber;
	}
}