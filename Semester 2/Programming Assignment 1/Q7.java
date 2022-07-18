/*
 	Write a Java method that takes an array of int values and determines if there is a pair of 
	distinct elements of the array whose product is odd.
*/

import java.util.Scanner;
public class Q7 
{
	int[] number_of_array;
	int array_limit;
	
	public void initializeArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want in the array ? : ");
		array_limit = sc.nextInt();
		number_of_array = new int[array_limit];
		
		for (int i=0; i<=number_of_array.length-1; i++)
		{
			System.out.print("Enter the number : ");
			number_of_array[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public boolean isODD_Product()
	{
		boolean oddProduct=false;
		for (int i=0; i<=number_of_array.length-1; i++)
		{
			for (int j=i+1; j<=number_of_array.length-1; j++)
			{
				if ((number_of_array[i]*number_of_array[j])%2==1)
				{
					if (number_of_array[i]==number_of_array[j] && (number_of_array[i]*number_of_array[j])%2==1)
					{
						oddProduct = true;
						break;
					}
				}
				else if ((number_of_array[i]*number_of_array[j])%2==0)
				{
					oddProduct = false;
					break;
				}
			}
		}
		return oddProduct;
	}
	
	
	public static void main(String[] args) 
	{
		Q7 q = new Q7();
		q.initializeArray();
		System.out.println("\nIs the given array contains a pair of distinct elements whose product is ODD?");
		System.out.println("Answer : "+q.isODD_Product());
	}
}