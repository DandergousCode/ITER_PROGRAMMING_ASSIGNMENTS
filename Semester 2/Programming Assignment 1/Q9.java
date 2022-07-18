/*
 	Create a class Student with instance variables name, roll, mark and instance methods 
	setData(), display(). Write a Java program to create three objects of Student class to input 
	details of three different students and display the details. Enclose main() method inside 
	another class StudentDetails. (Use the setter method setData() to input details.)
*/

class Student
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
		System.out.println("Marks : "+mark);
	}
}



public class Q9 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setData("ABC", 1, 100);
		s2.setData("DEF", 2, 99);
		s3.setData("GHI", 3, 98);
		
		s1.display();
		s2.display();
		s3.display();
	}
}