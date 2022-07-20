/*
 	Write a Java program to read your lucky number from keyboard. Treat –ve no. as 
	NumberFormatException. Write appropriate Exceptional handler
*/

import java.util.Scanner;
public class Q1 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		try
		{
			if (n<0)
				throw new NumberFormatException("Invalid Input!");
			else
				System.out.print("Your lucky no : "+n);
		}
		catch(NumberFormatException e) {System.out.println(e);}
		sc.close();
	}
}