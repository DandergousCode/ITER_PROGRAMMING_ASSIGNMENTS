// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate gross, dozen amount from total number of eggs and finally calculate the rest amount.
import java.util.Scanner;

public class Assignment_12 
{
    public static void main(String[] args) 
    {
        int n;
        int gross;
        try(Scanner N = new Scanner(System.in))
        {
            System.out.println("Enter total number of eggs: ");
            n = N.nextInt();
            gross = n/144;
            System.out.println("Your number of eggs is " + gross + " gross, " + (n-(gross*144))/12 + " dozen, and " + n%12);
        }

        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
    }
}