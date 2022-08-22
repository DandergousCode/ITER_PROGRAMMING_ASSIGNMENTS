// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Divisible by (5 and 6), (5 or 5), or divisible (5 or 6 but not both.)
import java.util.Scanner;

public class Assignment_17_disvisibleBy_5and6_5or6_Whether_it_is_disvisibleBy5or6But_not_both 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            int n;
            System.out.println("Enter an integer: ");
            n = input.nextInt();
            System.out.println("Is " + n + " divisible by 5 and 6? " + ((n%5==0) && (n%6==0)));
            System.out.println("Is " + n + " divisible by 5 or 6? " + ((n%5==0) || (n%6==0)));
            System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + ((n%5==0) ^ (n%6==0)));           
        }    
    }
    
}