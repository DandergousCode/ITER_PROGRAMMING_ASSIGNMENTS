// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Command Line Arguments.
public class Assignment_23_CLA_10 
{
    public static void main(String[] args) 
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int x = Math.min(a, b);
        int min = Math.min(x, c);
        int z = Math.max(a, b);
        int max = Math.max(z, c);
        int mid = a+b+c-min-max;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
    
}