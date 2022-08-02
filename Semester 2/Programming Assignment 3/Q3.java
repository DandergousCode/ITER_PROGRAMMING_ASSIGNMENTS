import java.util.Scanner;
class Student
{
	static String name;
	static int mark;
	void input()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter name : ");
			name = sc.nextLine();
			System.out.print("Enter marks : ");
			mark = sc.nextInt();
			
			if (mark>100)
				throw new Exception("MarksOutOfBoundException: ");
		}catch(Exception e) {System.out.println(e.getMessage()+"Invalid marks input");}
	}
	void output()
	{
		System.out.println("NAME : "+name);
		if (mark<=100)
			System.out.println("MARKS : "+mark+" out of 100");
		else
			System.out.println("INVALID MARKS INPUT!");
	}
}


public class Q3 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.input();
		s.output();
	}
}
