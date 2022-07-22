// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display 'Cramer Rule' 2x2 matrix of linear equation.
import java.util.Scanner;

public class Assignment_06_Cramer_Rule_2x2_system_of_Linear_Equation 
{
    public static void main(String[] args) 
    {
        double a, b, c, d, e, f, x, y;
        System.out.println("Enter a, b, c, d, e, f: ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        if ((a*d)-(b*c) != 0) 
        {
            System.out.println("X is: " + x + "\nY is: " + y);
        }
        else
        {
            System.out.println("The equation has no solution.");    
        }

        input.close();
    }
    
}