import java.lang.Math;
public class Q11 
{
    public static void main(String[] args) 
    {
        int sum1=0;
        for (int i=1; i<=10; i++)
        {
            sum1 = sum1+ (int)Math.pow(i, 2);
        }
        System.out.println("The sum of the squares of the first ten natural numbers is: "+ sum1);

        int sum2=0;
        for (int j=1; j<=10; j++)
        {
            sum2 = sum2+j;
        }
        int SUM2 = (int)Math.pow(sum2, 2);
        System.out.println("The square of the sum of the first ten natural numbers is: "+SUM2);

        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+SUM2+"-"+sum1+" = "+(SUM2-sum1));
    }
}