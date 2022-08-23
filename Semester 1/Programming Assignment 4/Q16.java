public class Q16 
{
    public static void main(String[] args) 
    {
        // Pattern 1  
        System.out.println("PATTERN_1");
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }System.out.println();
        }

        // Pattern 2
        System.out.println("\nPATTERN_2");
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }System.out.println();
        }

        // Pattern 3
        System.out.println("\nPATTERN_3");
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }System.out.println();
        }

        // Pattern 4
        System.out.println("\nPATTERN_4");
        int a = 1;
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i>=j)
                {
                    System.out.print(a+" ");
                    a++;
                }
            }System.out.println();
        }
    }   
}