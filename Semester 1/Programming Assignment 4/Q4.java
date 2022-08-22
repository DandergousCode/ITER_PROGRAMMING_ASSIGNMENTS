import java.util.Scanner;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter final integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter increments : ");
        int incN = sc.nextInt();
        System.out.println("Count from: "+n1);
        System.out.println("Count to: "+n2);
        System.out.println("Count by: "+incN);System.out.println();
        for (int i=n1; i<=n2;)
        {
            System.out.println("Integers: "+i+" ");
            i = i+incN;
        }sc.close();
    }
}