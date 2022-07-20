/*
 	Write a recursive method in Java which, given an integer n, print it with its digits reversed.
	For example , given 4735, it prints 5374
*/
import java.util.Scanner;
public class Q9 
{
	static void reverse_Digit(int N)
	{
		if (N==0)
			return;
		else
		{
			System.out.print(N%10);
			reverse_Digit(N/10);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
		reverse_Digit(n);
		sc.close();
	}
}