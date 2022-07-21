// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_17_CLA_04 
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean ans = (a<=(b+c) || b<=(c+a) || c<=(a+b));
        System.out.println("Result: " + ans);
        
    }
    
}