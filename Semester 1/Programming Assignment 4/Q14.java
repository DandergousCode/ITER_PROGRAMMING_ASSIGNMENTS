import java.util.Scanner;
public class Q14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number :");
        int n = sc.nextInt();
        int res = 1;        
        while (res < n) 
        {
            res = res * 2;
        }
        System.out.println(res); sc.close();
    }   
}