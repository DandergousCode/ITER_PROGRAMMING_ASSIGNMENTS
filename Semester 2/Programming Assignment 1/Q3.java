/*
 	Write a Java program that outputs all possible strings formed by using the characters 'c', 
	'a', 'r', 'b', 'o', and 'n' exactly once.
*/

public class Q3 
{
	public static void main(String[] args) 
	{
		char[] c = {'c','a','r','b','o','n'};
		for (int i1=0; i1<c.length; i1++)
		{
			for (int i2=0; i2<c.length; i2++)
			{
				for (int i3=0; i3<c.length; i3++)
				{
					for (int i4=0; i4<c.length; i4++)
					{
						for (int i5=0; i5<c.length; i5++)
						{
							for (int i6=0; i6<c.length; i6++)
							{
								if (i1!=i2 && i1!=i3 && i1!=i4 && i1!=i5 && i1!=i6 && i2!=i3 && i2!=i4 && i2!=i5 && i2!=i6 && i3!=i4 && i3!=i5 && i3!=i6 && i4!=i5 && i4!=i6 && i5!=i6)
								{
									System.out.println(c[i1]+" "+c[i2]+" "+c[i3]+" "+c[i4]+" "+c[i5]+" "+c[i6]);
								}
							}
						}
					}
				}
			}
		}
	}
}