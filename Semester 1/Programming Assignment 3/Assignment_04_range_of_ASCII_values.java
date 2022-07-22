// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display the ASCII value of digits and Upper letter characters, Lower letter characters and special characters.
import java.util.Scanner;

public class Assignment_04_range_of_ASCII_values 
{
    public static void main(String[] args) 
    {
        try(Scanner character = new Scanner(System.in);)
        {
            char ch;
            int ascii;
            System.out.println("Enter a character: ");
            ch = character.next().charAt(0);
            ascii = ch;
            System.out.println("ASCII value of " + ch + " is " + ascii);
            
            if (ascii>=65 && ascii<=90) 
            {
                System.out.println(ch + " is a capital letter.");    
            }

            else if (ascii>=48 && ascii<=57) 
            {
                System.out.println(ch + " is a digit.");    
            }

            else if(ascii>=0 && ascii<=47 || ascii>=58 && ascii<=64 || ascii>=91 && ascii<=96 || ascii>=123 && ascii<=127)
            {
                System.out.println(ch + " is a special symbol.");    
            }
        }
        
    }
    
}