// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Celsius to Fahrenheit converter.
import java.util.Scanner;

public class Assignment_01_Celcius_to_Farenheit 
{
    public static void main(String[] args) 
    {
        try (Scanner cel = new Scanner(System.in)) 
        {
            double c;
            System.out.println("Enter a degree in Celsius: ");
            c = cel.nextDouble();
            System.out.println(c + " Celsius is " + ((c * (9.0/5)) + 32) + " Fahrenheit");
        }
         catch (Exception e) 
        {
            System.out.println("Exception thrown: " + e);
        }
        
        
    }
    
}