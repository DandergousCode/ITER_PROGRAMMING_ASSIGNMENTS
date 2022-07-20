/*
 	Write a recursive method in Java which, given real value x and a positive integer n, returns 
	the value of xⁿ
.*/
import java.util.Scanner;
public class Q8 
{
	static int multiplication(int x, int n)
	{
		if (x==0)
			return 0;
		else if (n==0)
			return 1;
		else
		{
			int result = x*multiplication(x, n-1);
			return result;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X : ");
		int X = sc.nextInt();
		System.out.print("Enter the value of ⁿ : ");
		int ⁿ = sc.nextInt();
		int fact = multiplication(X, ⁿ);
		System.out.println("Value of Xⁿ : "+fact);
		sc.close();
	}
}