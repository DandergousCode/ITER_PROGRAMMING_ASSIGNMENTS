// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_19_CLA_06 
{
    public static void main(String[] args) 
    {   
        double basic = Double.parseDouble(args[0]);
        System.out.println("Input basic salary: " + basic);

        double DA = 0.4*basic;
        double HRA = 0.2*basic;

        double gross = basic + DA + HRA;
        System.out.println("Gross salary of the employee is: " + gross);
        
    }
    
}