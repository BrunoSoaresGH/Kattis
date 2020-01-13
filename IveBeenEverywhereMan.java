import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhereMan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casesCont = s.nextInt();
		int[] output = new int[casesCont];
		int count = 0;

		ArrayList<String> differents = new ArrayList();

		while (casesCont > count) {

			int numberCities = s.nextInt();
			String[] cities = new String[numberCities];

			for (int i = 0; i < numberCities; i++) {
				cities[i] = s.next();
			}

			differents.add(cities[0]);

			for (int counter = 1; counter < cities.length; counter++) {
				String cidade = cities[counter];
				boolean cidadeRepetida = false;
				for (int i = 0; i < differents.size(); i++) {
					if (differents.contains(cidade)) {
						cidadeRepetida = true;
					}
				}

				if (!cidadeRepetida) {
					differents.add(cidade);
				}
			}
			output[count] = differents.size();
			differents.clear();
			count++;
		}

		for (int i : output) {
			System.out.println(i);
		}
	}
}