// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Check the number, is it EVEN or ODD.
import java.util.Scanner;

public class Assignment_03_Check_EVENorODDnumber 
{
    public static void main(String[] args) 
    {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer number: ");
            n = sc.nextInt();

            if (n%2 == 0) 
            {
                System.out.println("The number is EVEN.");   
            }
            else 
            {
                System.out.println("The number is ODD");   
            } 
        }
         
    }
    
}