
import java.util.Scanner;
public class Main{

public static void main(String[]args){


        Scanner scan =  new Scanner (System.in);

        int num1;
        System.out.print("Input a number ");
        int num2 = scan.nextInt();

        for (num1 = 1; num1 <= 20; num1++){  

        System.out.println(num2 + " x "+ num1 + " = " + (num1*num2));


        }



    }

}

