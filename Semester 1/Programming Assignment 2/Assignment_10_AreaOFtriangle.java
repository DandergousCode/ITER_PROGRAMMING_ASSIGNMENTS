// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate area of a triangle.
import java.util.Scanner;

public class Assignment_10_AreaOFtriangle 
{
    public static void main(String[] args) 
    {
        double x1, y1;
        double x2, y2;
        double x3, y3;
        double side1, side2, side3;
        double s;
        double area;
        System.out.println("Enter three points for a triangle: ");
        try(Scanner input = new Scanner(System.in);)
        {
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            x3 = input.nextDouble();
            y3 = input.nextDouble();
        }

        side1 = Math.pow((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);
        side2 = Math.pow((Math.pow(y3-y2, 2) + Math.pow(x3-x2, 2)), 0.5);
        side3 = Math.pow((Math.pow(y1-y3, 2) + Math.pow(x1-x3, 2)),0.5);

        s = (side1 + side2 + side3)/2;
        area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.println("The area of the triangle is: " + area);
        
    }
    
}