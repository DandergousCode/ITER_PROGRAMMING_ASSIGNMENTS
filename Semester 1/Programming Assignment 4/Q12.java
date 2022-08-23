import java.lang.Math;
public class Q12 
{
    public static void main(String[] args) 
    {
        long n = 0;
        long a=0;
        System.out.println("log(N)"+"\t   "+"N"+"\t   "+"Nlog(N)"+"\t"+"N²"+"\t   "+"N^3"+"\t\t               "+"2*N");
        System.out.println("----------------------------------------------------------------------");
        for (n=16; n<=2048; n=n*2)
        {
            a = (long)Math.log(n);
            System.out.println("  "+a+"\t   "+n+"\t   "+(n*a)+"\t\t"+(n*n)+"\t   "+(n*n*n)+"\t             "+(2*n));
        }
    }
}