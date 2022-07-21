// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.

public class Assignment_15_CLA_02 
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        int ans = (int)((b-a)*Math.random());
        System.out.println("Result = " + ans);       
    }
}