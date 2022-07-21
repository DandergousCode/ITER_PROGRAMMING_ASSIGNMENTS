// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate distance between two points. Like, (x1, y1) and (x2, y2).
import java.util.Scanner;

public class Assignment_09_Computing_distance_between_twoPoints 
{
    public static void main(String[] args) 
    {
        double x1, y1, P;
        double x2, y2, Q;
        double a;
        System.out.println("Enter x1 and y1: ");
        try(Scanner input = new Scanner(System.in))
        {
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            System.out.println("Enter x2 and y2: ");
            x2 = input.nextDouble();
            y2 = input.nextDouble();
        }
        

        P = x2-x1;
        Q = y2-y1;
        a = Math.pow(P, 2) + Math.pow(Q, 2);
        System.out.println("The distance between the two points is: " + Math.pow(a, 0.5));
        
    }
    
}