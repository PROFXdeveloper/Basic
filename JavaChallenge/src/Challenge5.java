
import java.util.Scanner;

public class Challenge5{
public static void main (String[]args){

    
    Scanner scan = new Scanner(System.in);

    System.out.print("Input weight in pounds ");
    int weight = scan.nextInt();

    System.out.print("Input height in pounds ");
    int inches = scan.nextInt();

    double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
    System.out.print("Body Mass Index is "+BMI);

    }


}