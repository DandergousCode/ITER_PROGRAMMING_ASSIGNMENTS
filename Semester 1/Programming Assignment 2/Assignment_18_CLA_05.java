// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_18_CLA_05 
{
    public static void main(String[] args) 
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean ans = (( (x>y) && (y>z) ) || ( (x<y) && (y<z) ));
        System.out.println("Result: " + ans);
        
    }
    
}