// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Feet to meter converter.
import java.util.Scanner;

public class Assignment_03_Feet_to_Meters 
{
    public static void main(String[] args) 
    {
        try (Scanner feet = new Scanner(System.in)) 
        {
            double f;
            System.out.println("Enter a value for feet: ");
            f = feet.nextDouble();
            System.out.println(f + " feet is " + f/3.281 + " meters");
        }
        
        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
        
    }
    
}