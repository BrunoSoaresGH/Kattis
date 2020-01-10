import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int hours = s.nextInt();
		int minutes = s.nextInt();
		int hourReturn = 0; 
		int minuteReturn = 0;
		
		while(hours < 0 || hours > 23) {
			hours = s.nextInt();
		}
		while(minutes < 0 || minutes > 59) {
			minutes = s.nextInt();
		}
		
		if(minutes >= 45) {
			hourReturn = hours; 
			minuteReturn = minutes - 45;
		}
		
		if(minutes < 45 && hours == 0) {
			hourReturn = 23; 
			minuteReturn = 60 - (45 - minutes);
		}
		
		if(minutes < 45 && hours > 0) {
			hourReturn = hours - 1; 
			minuteReturn = 60 - (45 - minutes);
		}
		
		System.out.println(hourReturn + " " + minuteReturn);
	}

}
