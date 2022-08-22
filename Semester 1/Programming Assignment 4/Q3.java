import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++)
        {
            System.out.print(i+"  ");
        }System.out.println();sc.close();
    }
}