import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String word = "Hello World";
        String x;
        System.out.print("Enter any integer between 1 and 1000: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            if ((i%10==1) || (i%100==1)){x = "st";}
            else if ((i%10==2) || (i%100==2)){x = "nd";}
            else if ((i%10==3) || (i%100==3)){x = "rd";}
            else {x = "th";}
            System.out.println(i+x+" "+word);
        }
        sc.close();
    }   
}