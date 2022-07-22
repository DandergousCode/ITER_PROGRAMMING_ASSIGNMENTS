// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Check the marks of a student.
import java.util.Scanner;

public class Assignment_02_Check_Marks 
{
    public static void main(String[] args) 
    {
        try(Scanner Marks = new Scanner(System.in);) 
        {
            int marks;
            System.out.println("Enter marks: ");
            marks = Marks.nextInt();
            if (marks >= 40) 
            {
                System.out.println("Congratulation! You have passed the exam.");   
            } 
            else 
            {
                System.out.print("Sorry! You have failed the exam.");    
            }

        }

        catch (Exception e) 
        {
            System.out.println("Excemption thrown: " + e);
        }
        
    }
    
}