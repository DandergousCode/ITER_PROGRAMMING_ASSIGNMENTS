public class Q5 
{
	public static <E> void printArray(E[] inputArray)
	{
		for (int i=0; i<inputArray.length;i++)
			System.out.println(inputArray[i]+" ");
	}
	
	public static void main(String[] args) 
	{
		Integer[] a = {1,2,3,4};
		Float[] b = {8.2f,9.1f,9.4f,9.6f};
		String[] c = {"Java","Python","C++","Go"};
		printArray(a);
		System.out.println();
		printArray(b);
		System.out.println();
		printArray(c);
	}
}