// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate BMI. Enter weight in 'pound' unit and height in 'inch' unit. After that system
//              converts the value of pound to kilogram and converts the value of inch to meter and then
//              kg is divided by square of meter.
import java.util.Scanner;

public class Assignment_06_Calculate_BMI 
{
    public static void main(String[] args) 
    {
        double kg;
        double m;
        double p;
        double inch;
        
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter your weight(kg) and height(meters): ");
            kg = input.nextDouble();
            m = input.nextDouble();
        }
        
        p = kg/0.453592;
        inch = m/0.0254;

        System.out.println("\nEnter weight in pounds: " + p);
        System.out.println("Enter height in inches: " + inch);
        System.out.println("BMI is: " + kg/(m*m));
        
    }
    
}