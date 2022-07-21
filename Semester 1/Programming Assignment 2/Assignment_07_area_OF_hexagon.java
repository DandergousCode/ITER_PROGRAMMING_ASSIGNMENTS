// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate area of Hexagon.
import java.util.Scanner;

public class Assignment_07_area_OF_hexagon 
{
    public static void main(String[] args) 
    {
        double s;
        double a;
        System.out.println("Enter the side: ");
        try(Scanner S = new Scanner(System.in))
        {
            s = S.nextDouble();
        }

        a = (3*Math.pow(3, 0.5)/2)*(s*s);


        System.out.println("The area of the hexagon is: " + a);
        
    }
    
}