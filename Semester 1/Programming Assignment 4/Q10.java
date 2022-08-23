import java.util.Scanner;
public class Q10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer to see its multiplication table: ");
        int n = sc.nextInt();
        System.out.println("__MULTIPLICATION TABLE__");
        for (int i=1; i<=10; i++)
        {
            System.out.println(n+"x"+i+" = "+(n*i));
        }
        sc.close();
    }    
}