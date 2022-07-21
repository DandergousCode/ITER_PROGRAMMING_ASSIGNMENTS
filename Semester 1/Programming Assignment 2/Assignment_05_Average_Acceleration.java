// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate average acceleration using physics formula.
import java.util.Scanner;

public class Assignment_05_Average_Acceleration 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in))
        {
            double v0, v1, t;
            double a;

        
            System.out.println("Enter v0, v1, and t: " );
            v0 = input.nextDouble();
            v1 = input.nextDouble();
            t = input.nextDouble();
            a = (v1-v0)/t;
            System.out.println("The average acceleration is: " + a);
        }

        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
        
    }
    
}