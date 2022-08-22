// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display details about a person.
import java.util.Scanner;

public class Assignment_18_show_details_about_a_person 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String first_name;
        String last_name;
        int age;
        char gender;
        System.out.println("What is your gender (M or F): ");
        gender = input.next().charAt(0);
        System.out.println("Enter your first name: ");
        first_name = input.nextLine();
        System.out.println("Enter your last name: ");
        last_name = input.nextLine();
        System.out.println("Enter Age: ");
        age = input.nextInt();
        if (gender=='f' || gender=='F') 
        {
            if (age>=20) 
            {
                System.out.println("Are you married (Y or N): ");   
                input.nextLine();
                char m = input.nextLine().charAt(0);
                if (m=='Y' || m=='y') 
                {
                    System.out.println("Then I shall I call you Mrs. " + first_name + " " + last_name);
                }
                else
                {
                    System.out.println("Then I shall I call you Ms. " + first_name + " " + last_name);
                }
            }          else
            {
                System.out.println("Then I shall call you Ms. " + first_name + " " + last_name);
            }
        }      
        
        else
        {
            if (age>=20) 
            {
                System.out.println("Then I shall call you Mr. " + first_name + " " + last_name);
            }
            else
            {
                System.out.println("Then I shall call you " + first_name + " " + last_name);
            }
        }
        
        input.close();
    }
    
}