import java.util.Scanner;

class Complex
{
	double real, imag;
	Scanner sc = new Scanner(System.in); 
	
	void setData()
	{
		System.out.print("Enter a real number : ");
		real = sc.nextDouble();
		System.out.print("Enter a imaginary number : ");
		imag = sc.nextDouble();
	}
	public Complex add(Complex a, Complex b)
	{
		Complex c = new Complex();
		c.real = a.real+b.real;
		c.imag = a.imag+b.imag;
		return c;
	}
	void display()
	{
		System.out.println("The number is : "+real+"  "+imag);
	}
}


public class Q2 
{
	public static void main(String[] args) 
	{
		Complex n1 = new Complex();
		Complex n2 = new Complex();
		Complex result = new Complex();
		
		n1.setData();
		n2.setData();
		result = result.add(n1, n2);
		result.display();
	}
}