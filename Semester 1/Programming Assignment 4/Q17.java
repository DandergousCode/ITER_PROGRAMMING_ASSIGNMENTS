public class Q17 
{
    public static void main(String[] args) 
    {
        for (int i=1; i<=10; i++)
        {
            System.out.print("* ");
            for (int k=2; k<=10; k++)
            {
                if ((k%i==0) || (i%k==0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.print(i);
            System.out.println();
        }
    }   
}