/*
 	Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write 
	exceptional handler in Java.
*/

import java.util.Arrays;
import java.util.Scanner;
public class Q2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many colors you want in the array : ");
		int n = sc.nextInt();
		
		String[] color = new String[n];
		try
		{
			for (int i=0; i<n; i++)
			{
				System.out.print("Enter color_"+i+" : ");
				color[i] = sc.next();
			}
			System.out.println("\nThe array is : "+Arrays.toString(color));
			System.out.print("\n>>Pick the color from array (1-"+(n)+") : ");
			int x = sc.nextInt();
			x=x-1;
			if (x-1>=color.length)
				throw new NullPointerException("The color is not present");
			System.out.println("The color : "+color[x]);
			System.out.println("The color is present at index no : "+x);
		}
		catch(NullPointerException e)
		{
			System.out.println(ArrayIndexOutOfBoundsException.class+"\n"+e);
		}
		sc.close();
	}
}