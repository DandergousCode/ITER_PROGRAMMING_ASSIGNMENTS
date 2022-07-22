// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_24_CLA_11 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        float min = (float)Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        float max = (float)Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
        float average = (float)(x1 + x2 + x3 + x4 + x5)/n;

        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
    
}