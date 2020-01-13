import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class IsItHalloweenCom {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String month = s.next();
        int day = s.nextInt();
         
        if((day == 31 && month.equals(("OCT"))) || (day == 25 && month.equals("DEC"))) { 
            System.out.println("yup");
        } else System.out.println("nope");  
    }
}

