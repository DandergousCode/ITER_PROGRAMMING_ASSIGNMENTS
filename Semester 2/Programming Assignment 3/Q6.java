public class Q6 
{
	public static <T> int count(T[] array, T item)
	{
		int count=0;
		for (int i=0; i<array.length; i++)
		{
			if (array[i]==item)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int count;
		Integer[] a = {1,2,3,4,1,5,1};
		Character[] c = {'a','1','b','2','a'};
		System.out.print("Count the occurence of the INTEGER array : ");
		count = count(a,1);
		System.out.println(count);
		System.out.print("Count the occurence of the CHARACTER array : ");
		count = count(c,'a');
		System.out.println(count);
	}
}