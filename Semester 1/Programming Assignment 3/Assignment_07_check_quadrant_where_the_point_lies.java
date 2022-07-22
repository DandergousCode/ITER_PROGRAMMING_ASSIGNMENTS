// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display the quadrant where the point lies, which is given by user in 2D dimensional graph.
import java.util.Scanner;

public class Assignment_07_check_quadrant_where_the_point_lies 
{
    public static void main(String[] args) 
    {
        
        double x, y;
        System.out.println("Enter two points: ");
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        if(x>0 && y>0)
        {
            System.out.println("Lies in First Quadrant.");
        }
        else if(x<0 && y>0)
        {
            System.out.println("Lies in Second Quadrant.");
        }
        else if(x<0 && y<0)
        {
            System.out.println("Lies in Third Quadrant.");
        }
        else if(x>0 && y<0)
        {
            System.out.println("Lies in Fourth Quadrant.");
        }
        else if(x==0 && y>0)
        {
            System.out.println("Lies at positive y axis.");
        }
        else if(x==0 && y<0)
        {
            System.out.println("Lies at negative y axis.");
        }
        else if(y==0 && x<0)
        {
            System.out.println("Lies at negative x axis.");
        }
        else if(y==0 && x>0)
        {
            System.out.println("Lies at positive x axis.");
        }
        
        else
        {
            System.out.println("Lies at Origin");
        }
          
        input.close();
    }
    
}