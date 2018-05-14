import java.util.Scanner;

public class GrassSeed {

	static Scanner scanner = new Scanner(System.in);  
	
	private static double getValue() {
		String text = scanner.nextLine(); 
		double value = Double.parseDouble(text);
		return value;
	} 
	
	private static int getNumberLawns() {
		String text = scanner.nextLine();
		int numberLawns = Integer.parseInt(text); 
		return numberLawns;
	} 
	
	private static double getArea() {
		
		String widthAndLenght = scanner.nextLine();
		double[] area = new double[2];
		String width = widthAndLenght.split(" ")[0];
		String lenght = widthAndLenght.split(" ")[1];
		area[0] = Double.parseDouble(width);
		area[1] = Double.parseDouble(lenght);

		return area[0]*area[1];
	}
	
	public static void main(String[] args) {
		
		double cost = getValue(); 
		int numberLawns = getNumberLawns(); 
		double totalCost = 0; 
		
		for(int i = 1; i <= numberLawns; i++){
			double area = getArea(); 
			double areaCost = area*cost; 
			totalCost += areaCost;
		}
		String resultado = String.format("%.6f", totalCost);
		System.out.println(resultado);
	}

}
