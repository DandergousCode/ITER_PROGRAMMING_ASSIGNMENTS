public class Q9
{
    public static void main(String[] args) 
    {
        int s=0;
        for (int i=0; i<1000; i++)
        {
            if ((i%3==0) || (i%5==0))
            {
                System.out.println(i);
                s=s+i;
            }
        }
        System.out.println("Sum of these numbers are : "+s);
    }
}