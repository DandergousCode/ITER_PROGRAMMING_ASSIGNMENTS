// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display the marks out of 100.
import java.util.Scanner;

public class Assignment_16_display_grade_depends_on_its_marks 
{
    public static void main(String[] args) 
    {
        double marks;
        System.out.println("Enter marks of the student: ");
        Scanner input = new Scanner(System.in);
        marks = input.nextDouble();
        System.out.println("His/Her marks is " + marks + "out of 100");

        input.close();
    }
    
}