/*
 	Write a recursive method in Java that computes 
 	the factorial of a given integer
*/
public class Q7 
{
	static int fact(int n)
	{
		if (n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Factorial : "+fact(5));
	}
}