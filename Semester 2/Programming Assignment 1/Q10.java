/*
 	Rewrite question 9 with instance method setData(String,int,double). Use the setter method 
	setData() to initialize members.
*/

class STUDENT1
{
	String name;
	int roll;
	int mark;
	
	void setData(String n, int r, int m)
	{
		this.name = n;
		this.roll = r;
		this.mark = m;
	}
	void display()
	{
		System.out.println("Name of the student : "+name);
		System.out.println("Roll NO : "+roll);
		System.out.println("Marks : "+mark+"\n");
	}
}



public class Q10
{
	public static void main(String[] args) 
	{
		STUDENT1 s1 = new STUDENT1();
		STUDENT1 s2 = new STUDENT1();
		STUDENT1 s3 = new STUDENT1();
		
		s1.setData("ABC", 1, 100);
		s2.setData("DEF", 2, 99);
		s3.setData("GHI", 3, 98);
		
		s1.display();
		s2.display();
		s3.display();
	}
}