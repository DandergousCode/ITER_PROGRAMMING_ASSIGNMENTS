// Name: Soumyadip Majumder
// Section: 11
// Registration no.: 2141013055
// Problem description: Swapping the values of two variables without using third variable.

public class Question_08 
{
	public static void main(String[] args) 
	{
		int x = 40;
		int y = 30;
	
		System.out.println("---Before swapping the valus---");
		System.out.println("The value of X is: " + x);
		System.out.println("The value of Y is: " + y);
		
		x = x - y;
		y = y + x;
		x = y - x;
		
		System.out.println("---After swapping the values---");
		System.out.println("The value of X is: " + x);
		System.out.println("The value of Y is: " + y);
	}

}