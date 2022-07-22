// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate BMI.
import java.util.Scanner;

public class Assignment_11_Calculate_BMI 
{
    public static void main(String[] args) 
    {
        double BMI;
        double weight;
        double height;
        try(Scanner input = new Scanner(System.in);)
        {
            System.out.println("Enter your weight in kg: ");
            weight = input.nextDouble();
            System.out.println("Enter your height in meter: ");
            height = input.nextDouble();
            BMI = (weight)/Math.pow(height, 2);
            System.out.println("Your BMI is: " + BMI);
            if (BMI < 18.5) 
            {
                System.out.println("Your BMI is underweight.");    
            }
            else if(18.5<=BMI && BMI<=24.9)
            {
                System.out.println("Your BMI is normal weight.");
            }
            else if(25.0<=BMI && BMI<=29.9)
            {
                System.out.println("Your BMI is overweight.");
            }
            else

            {
                System.out.println("Your BMI is obese!");
            }

        }
        
    }
    
}