// Name: Soumyadip Majumder
// Section: 11
// Registration no.: 2141013055
// Problem description: Swapping the values of two variables using third variable.

public class Question_07 
{

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 10;
		int C;
		
		System.out.println("---Before swapping values---");
		System.out.println("The value of A is: " + a);
		System.out.println("The value of B is: " + b);
		
		C = a;
		a = a - b;
		b = C;
		
		System.out.println("---After swapping values---");
		System.out.println("The value of A is: " + a);
		System.out.println("The value of B is: " + b);
	}

}