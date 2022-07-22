// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: User input his/her height in centemeter and system shows height in 'feet' unit. If height is
//                  equal or above 6 feet then system shows that the person is tall.

import java.util.Scanner;

public class Assignment_01_Check_height 
{
    public static void main(String[] args) 
    {
        
        double cm;
        double feet;
        System.out.println("Enter your height in cm: ");
        Scanner CM = new Scanner(System.in);
        cm = CM.nextDouble();
        feet = cm/30.48;
        System.out.println("your height is " + feet +" feet.");

        if (feet >=6) 
        {
            System.out.println("The person is tall.");
        }  

        CM.close();
    }
    
}