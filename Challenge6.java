import java.util.Scanner;


public class Challenge6 {

    public static void main(String[] Strings) {

        int minutesinYear = 60*24*365;
        

        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the numbers of minutes: ");
        int min = scan.nextInt();
    
        int years =  (min / minutesinYear);
        int remainder = (365*years);
        int days =  (min / 1440 ) - remainder;
    
        System.out.println( min + " minutes is approximately " + years + " years and " + days + " days");
    
         }
    
    }
