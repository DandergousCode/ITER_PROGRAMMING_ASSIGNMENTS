// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Find the roots of Quadratic equation.
import java.util.Scanner;

public class Assignment_05_Find_roots_of_Quadratic_equation 
{
    public static void main(String[] args) 
    {
        try(Scanner A = new Scanner(System.in); Scanner B = new Scanner(System.in); Scanner C = new Scanner(System.in);)
        {
            double a;
            double b;
            double c;
            double discriminent;
            double root1;
            double root2;
            System.out.println("Enter a, b, c: ");
            a = A.nextDouble();
            b = B.nextDouble();
            c = C.nextDouble();

            discriminent = Math.pow(b, 2) - (4*a*c);
            System.out.print("The equation has: ");

            if (discriminent > 0) 
            {
                root1 = (-b + Math.pow(discriminent, 0.5))/(2*a);
                root2 = (-b - Math.pow(discriminent, 0.5))/(2*a);
                System.out.println("First root is: " + root1 + "\nSecond root is: " + root2);  
            }
            else if(discriminent == 0) 
            {
                root1 = (-b + Math.pow(discriminent, 0.5))/(2*a);
                System.out.println("There is only one root " + root1);
            }
            else
            {
                System.out.println("No real roots.");
            }
            
        }
    }
    
}