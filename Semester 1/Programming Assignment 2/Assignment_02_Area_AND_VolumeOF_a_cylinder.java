// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Calculate volume of a cylinder.
import java.util.Scanner;
public class Assignment_02_Area_AND_VolumeOF_a_cylinder 
{
    public static void main(String[] args) 
    {
    
        System.out.println("Enter the radius and length of a cylinder: ");
        try (Scanner input = new Scanner(System.in))
        {
            double r = input.nextDouble();
            double l = input.nextDouble();
                
            double a = r*r*Math.PI;
            System.out.println("The area is: " + a);
            System.out.println("Volume is: " + a*l);
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown: " + e);
        }
        
    }
    
}