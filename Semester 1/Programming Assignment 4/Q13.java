import java.util.Scanner;
public class Q13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number :");
        int n = sc.nextInt();
        int a;
        int sum = 0;

        while (n>0)
        {
            a = n%10;
            System.out.print(a);
            sum = sum +a;
            n = n/10;
        }
        System.out.println();
        if (sum %9 == 0)
        {
            System.out.println("Number is divisible by 9.");
        }
        else
        {
            System.out.println("Nmuber is not divisible by 9.");
        }
        sc.close();
    }
}