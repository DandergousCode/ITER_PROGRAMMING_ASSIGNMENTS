// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: User Input number of minutes, calculate it and display number of years & days.
import java.util.Scanner;

public class Assignment_13_Displays_number_of_years_and_days_for_the_minutes 
{
    public static void main(String[] args) 
    {
        try(Scanner m = new Scanner(System.in))
        {
            long min;
            long  y;
            long d;
            long minutesInYear = 60*24*365;
            System.out.println("Enter the number of minutes: ");
            min = m.nextLong();

            y = min/minutesInYear;
            d = (min/60/24)%365;
            System.out.println("\n" + min + " minutes is approximately " + y + " years and " + d + " days");
        } 
        
        catch (Exception e) 
        {
            System.out.println("Exception thrown: " + e);   
        }
    }
}