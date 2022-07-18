/*
 	Write a Java program that can take a positive integer greater than 2 as input 
 	and write out the number of times one must repeatedly divide this number by 2 
 	before getting a value less than 2.
*/

import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		if (n<2)
		{
			count=n;
			System.out.println("The no. of division of this digit is "+count+" times");
		}
		else if (n<=0)
		{
			System.out.println("Invalid Input!");
		}
		while (n>2)
		{
			n = n/2;
			count++;
		}
		System.out.println("The number of division of this digit is "+count+" times");
		sc.close();
	}
}