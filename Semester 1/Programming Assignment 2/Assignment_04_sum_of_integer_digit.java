// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate sum of digits of a integer number.
import java.util.Scanner;

public class Assignment_04_sum_of_integer_digit 
{
    public static void main(String[] args) 
    {
        try (Scanner num = new Scanner(System.in)) 
        {
            int n;
            int digit;
            int remain;
            
            System.out.println("Enter a number between 0 and 1000: ");
            n = num.nextInt();

            digit = n%10;
            remain = n/10;
            digit = digit + remain%10;
            remain = remain/10;
            digit = digit + remain%10;
            remain = remain/10;
            System.out.println("The sum of the digits is:" + digit);
        }

        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
        
    }
    
}