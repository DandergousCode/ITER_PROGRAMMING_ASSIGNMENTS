/*
	Write a Java program that takes as input three integers, a, b, and c, from the Java console 
	and determines if they can be used in a correct arithmetic formula (in the given order), like 
	“a + b = c”, “a = b − c”, or “a x b = c”.
*/

import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.print("Enter the value of c : ");
		int c = sc.nextInt();
		
		if (a+b==c || a==b-c || a*b==c)
		{
			System.out.println("Values satisfy the arithmetic formula");
		}
		else
			System.out.println("Values satisfy with none of these arithmetic formulas");
		sc.close();
	}
}
