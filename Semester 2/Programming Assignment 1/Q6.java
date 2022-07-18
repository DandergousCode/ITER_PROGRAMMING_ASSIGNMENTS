/*
 	Write a Java method for finding the smallest and largest numbers in an array of integers and 
	compare that to a java method that would do the same thing.
*/
import java.util.Arrays;
public class Q6 
{
	public static void main(String[] args) 
	{
		int[] n = {32, 43, 52,59,23,65,63,98,43,23};
		
		int smallest = n[0];
		int largest = n[0];
		
		for (int i=0; i<n.length-1; i++)
		{
			if (n[i]>largest)
			{
				largest = n[i];
			}
			else if (n[i]<smallest)
			{
				smallest = n[i];
			}
		}
		System.out.println("Given Array : "+Arrays.toString(n));  // <-- Arrays.toString is used for printing the array.
		System.out.println("Smallest number from the array : "+smallest);
		System.out.println("Largest number from the array : "+largest);
	}
}