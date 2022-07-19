import java.util.Scanner;

interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}

abstract class Employee
{
	int empID;
	String fname;
	String lname;
	double salary;
	
	Employee(int id, String fn, String ln, double s)
	{
		this.empID=id;
		this.fname=fn;
		this.lname=ln;
		this.salary=s;
	}
}

class Manager extends Employee implements EmpInterface
{
	double bonus;
	Manager(int id, String fn, String ln, double s)
	{
		super(id, fn, ln, s);
	}
	
	@Override
	public void displayEmp()
	{
		System.out.println("EmpID : "+empID);
		System.out.println("Name : "+fname+" "+lname);
		System.out.println("Salary : "+salary+"/per month");
	}
	@Override
	public void giveBonus(double amount)
	{
		try
		{
			if (amount>bonus)
				bonus=amount;
			else if (bonus<=0)
				System.out.println("There is an error in bonus "+new Exception("Arithmetic error"));
		}catch(ArithmeticException e) {System.out.println("Bonus error -> "+e.getMessage());}
	}
}



public class Q8 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Manager[] m = new Manager[3];
		int i;
		
		for (i=0;i<3; i++)
		{
			System.out.println("***Manager Details***");
			System.out.print("Enter ID : ");
			int empID = sc.nextInt();
			System.out.print("Enter first name : ");
			String fname = sc.next();
			System.out.print("Enter last name : ");
			String lname = sc.next();
			System.out.print("Enter salary : ");
			double salary = sc.nextDouble();
			
			m[i] = new Manager(empID, fname, lname, salary);
			System.out.println((i+1)+" Emp bonus amount");
			double amount  = sc.nextDouble();
			m[i].giveBonus(amount);
		}
		for (i=0; i<3; i++)
		{
			m[i].displayEmp();
		}
	}
}