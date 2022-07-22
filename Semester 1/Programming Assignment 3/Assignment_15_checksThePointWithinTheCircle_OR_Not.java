// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Check the point within the circle or not.
import java.util.Scanner;

public class Assignment_15_checksThePointWithinTheCircle_OR_Not 
{
    public static void main(String[] args) 
    {
        double x, y, X, Y;
        double distance;
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter a point with two co-ordinates: ");
            x = input.nextDouble();
            y = input.nextDouble();
            X = Math.pow((x-0), 2);
            Y = Math.pow((y-0), 2);
            distance = Math.pow((X+Y), 0.5);
            if (distance<=10) 
            {
                System.out.println("Point (" + x +", " + y + ") is in the circle." );
            }
            else
            {
                System.out.println("Point (" + x + ", " + y +") is not in the circle.");
            }

        }
        
    }
    
}