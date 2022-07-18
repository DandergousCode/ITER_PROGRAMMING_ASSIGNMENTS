/*
  	Write a Java program that takes two arrays a and b of length n storing int values, and returns 
	the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], 
	for i = 0, . . . , n − 1
*/

import java.util.Scanner;
import java.util.Arrays;
public class Q8 
{
	static int[] arrayOne;
	static int[] arrayTwo;
	static int[] resultArray;
	
	int arrayLimit;
	public void initializeArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array limit for first and second array : ");
		arrayLimit = sc.nextInt();
		
		arrayOne = new int[arrayLimit];
		arrayTwo = new int[arrayLimit];
		resultArray = new int[arrayLimit];
		
		System.out.println("Enter first array elements : ");
		for (int i=0; i<arrayOne.length; i++)
		{
			System.out.print("Enter numbers : ");
			arrayOne[i] = sc.nextInt();
		}
		
		System.out.println("Enter second array elements : ");
		for (int i=0; i<arrayTwo.length; i++)
		{
			System.out.print("Enter numbers : ");
			arrayTwo[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void findArrayProduct()
	{
		for (int i=0; i<arrayOne.length; i++)
		{
			resultArray[i] = arrayOne[i]*arrayTwo[i];
		}
		System.out.println("Result : "+Arrays.toString(resultArray));
	}
	
	
	public static void main(String[] args) 
	{
		Q8 q = new Q8();
		q.initializeArray();
		System.out.println("The first array elements are "+Arrays.toString(arrayOne));
		System.out.println("The second array elements are "+Arrays.toString(arrayTwo));
		q.findArrayProduct();
	}
}