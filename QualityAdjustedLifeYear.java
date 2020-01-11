import java.util.Scanner;

public class QualityAdjustedLifeYear {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int periods = s.nextInt(); 
		double qualityPeriod = 0; 
		double period = 0;
		double qualityLife = 0;
		
		while(periods < 1 || periods > 100) {
			periods = s.nextInt();
		}
		
		for(int count = 0; count < periods; count++) {
			qualityPeriod = s.nextDouble(); 
			period = s.nextDouble();
			
			while(qualityPeriod < 0 || qualityPeriod > 1) {
				qualityPeriod = s.nextDouble();
			}
			
			while(period < 0 || period > 100) {
				period = s.nextDouble();
			}

			qualityLife = qualityLife + (qualityPeriod*period);
		}
		
		System.out.println(qualityLife);
	}

}
