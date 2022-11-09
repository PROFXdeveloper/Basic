import java.util.Scanner;


public class Challenge4 {

    public static void main(String[] Strings) {

        int minutesinYear = 60*24*365;

        Scanner scan = new Scanner(System.in);
    
        System.out.print("Input the numbers of minutes: ");
        int min = scan.nextInt();
    
        int years =  (min / minutesinYear);
        int days =  (min / 1440) % 365;
    
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    
         }
    
    }