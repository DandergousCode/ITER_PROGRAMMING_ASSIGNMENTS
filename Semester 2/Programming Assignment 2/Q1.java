import java.util.Scanner;

class Commission
{
	double sales;
	
	Commission(double s)
	{
		sales = s;
	}
	
	public double getCommission()
	{
		if (sales<500)
			return 0.02*sales;
		else if (sales>=500 && sales<5000)
			return 0.05*sales;
		else
			return 0.08*sales;
	}
}


public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sales : ");
		double s = sc.nextDouble();
		Commission c = new Commission(s);
		double com = c.getCommission();
		
		if (s<0)
			System.out.println("Invalid Input!");
		else
			System.out.println("Commission : "+com);
		sc.close();
	}
}
