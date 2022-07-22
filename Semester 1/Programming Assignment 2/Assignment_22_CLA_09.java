// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_22_CLA_09 
{
    public static void main(String[] args) 
    {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        
        System.out.println(P*Math.pow(Math.E, (r*t)));
    }
    
}