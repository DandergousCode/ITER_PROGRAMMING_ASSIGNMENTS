// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Show three integer number as non-decreasing order, thats mean increasing order.
import java.util.Scanner;

public class Assignment_12_showThreeInteger_non_decreasing_order 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            int a, b, c;
            System.out.println("Enter three integers: ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if (a>b && a>c) 
            {
                if (b>c) 
                {
                    System.out.println(c + " " + b + " " + a);
                }
                else
                {
                    System.out.println(b + " " + c + " " + a);
                }
            }
            else if(b>a && b>c)
            {
                if(a>c)
                {
                    System.out.println(c + " " + a + " " + b);
                }
                else
                {
                    System.out.println(a + " " + c + " " + b);
                }
            }
            else if(c>a && c>b)
            {
                if(a>b)
                {
                    System.out.println(b + " " + a + " " + c);
                }
                else
                {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
        
    }
    
}