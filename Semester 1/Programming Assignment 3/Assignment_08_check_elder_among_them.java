// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Check who is elder.
import java.util.Scanner;

public class Assignment_08_check_elder_among_them 
{
    public static void main(String[] args) 
    {
    
       int age1, age2, age3;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter age of Rahul: ");
       age1 = input.nextInt();
       System.out.println("Enter age of Ayush: ");
       age2 = input.nextInt();
       System.out.println("Enter age of Ajay: ");
       age3 = input.nextInt();

       if(age1>age2 && age1>age3)
       {
           System.out.println("Rahul is the eldest among them.");
       }
       else if(age2>age1 && age2>age3)
       {
           System.out.println("Ayush is the eldest among them.");
       }
       
       else
       {
           System.out.println("Ajay is the eldest among them.");
       }
    
       input.close();
    }
    
}