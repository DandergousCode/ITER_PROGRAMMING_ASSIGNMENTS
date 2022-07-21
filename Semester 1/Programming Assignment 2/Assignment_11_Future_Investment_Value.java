// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate investment value.
import java.util.Scanner;

public class Assignment_11_Future_Investment_Value 
{
    public static void main(String[] args)
    {
        double futureInvestmentValue, InvestmentAmount, AnnualInterest_Rate, number_of_years; 
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter investment amount: ");
            InvestmentAmount = input.nextDouble();
            System.out.println("Enter annual interest rate in percentage: ");
            AnnualInterest_Rate = input.nextDouble()/100;
            System.out.println("Enter number of years: ");
            number_of_years = input.nextDouble();

            futureInvestmentValue = InvestmentAmount*Math.pow((1+(AnnualInterest_Rate/12)), (number_of_years*12));
            System.out.println("Accumulated value is $" + futureInvestmentValue);
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
    }
    
}