import e_sports.Sports;		// This 'Sports' interface file in e_sports package which you can find from Sports.java file.
import java.util.Scanner;
class Student2 implements Sports
{
	String name;
	int roll;
	Scanner sc = new Scanner(System.in);
	 void input(String n, int r)
	 {
		 this.name=n;
		 this.roll=r;
	 }
	 void output()
	 {
		 System.out.println("**Student Details**");
		 System.out.println("NAME : "+name);
		 System.out.println("ROLL : "+roll);
	 }
}

class Test extends Student2
{
	int mark1, mark2;
	void input(String n, int r, int m1, int m2)
	{
		super.input(n, r);
		this.mark1=m1;
		this.mark2=m2;
	}
}


public class Q9 extends Test
{
	public static void main(String[] args) 
	{
		Q9 t = new Q9();
		t.input("ABC", 3, 100, 100);
		t.output();
		Sports.print();
	}
}
