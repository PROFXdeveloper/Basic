import java.util.Scanner;

public class Challenge2{

public static void main(String[]args){

        
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a width: ");
        double width =scan.nextDouble();

        System.out.print("Input a height: ");
        double height = scan.nextDouble();

        double area = (width*height);

        double perimeter = 2*(width + height);

        System.out.printf("Area is %.1f * %.1f = %.2f \n",width,height,area );
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n",width,height,perimeter );

        
      
    }   
}