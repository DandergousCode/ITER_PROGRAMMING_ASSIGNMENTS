// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_14_CLA_01 
{
    public static void main(String[] args) 
    {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            boolean result = (a%b == 0 || b%a == 0);
            System.out.println("Result: " + result);
    }
    
}