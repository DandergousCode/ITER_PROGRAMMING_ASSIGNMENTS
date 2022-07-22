// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_21_CLA_08 
{
    public static void main(String[] args) 
    {
         double t = Double.parseDouble(args[0]);
         double radian = Math.toRadians(t);
         int ans = (int)Math.round(Math.sin(2*radian) + Math.sin(3*radian));
         System.out.println("Result: " + ans);
         
    }
    
}