/*
  	Write a Java method, isOdd, that takes an int i and returns true if and only if i is odd. Your 
	method can't use the multiplication, modulus, or division operators, however.
*/

import java.util.Scanner;
public class Q5 
{
	public boolean isOdd(int i)
	{
		while (i>0)
		{
			i = i-2;
			if (i==1)
			{
				System.out.print("Checking ODD : ");
				return true;
			}
		}System.out.print("Checking ODD : ");
		return false;
	}
	
	public static void main(String[] args) 
	{
		Q5 q = new Q5();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check is it ODD or EVEN : ");
		int n = sc.nextInt();
		System.out.println(q.isOdd(n));
		sc.close();
	}
}