class Person
{
	String name;
	int age;
	
	Person(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class Student extends Person
{
	String course;
	int roll;
	int marks;
	
	public Student(String n, int a, String c, int r, int m) 
	{
		super(n,a);
		this.course=c;
		this.roll=r;
		this.marks=m;
	}
	void display()
	{
		super.display();
		System.out.println("Course : "+course);
		System.out.println("Roll : "+roll);
		System.out.println("Marks : "+marks);
	}
}

class Teacher extends Person
{
	String subject_assigned;
	int contact_hour;
	
	public Teacher(String n, int a, String sub, int ch) 
	{
		super(n,a);
		this.subject_assigned=sub;
		this.contact_hour=ch;
	}
	void display()
	{
		super.display();
		System.out.println("Subject Assigned : "+subject_assigned);
		System.out.println("Contact hour : "+contact_hour);
	}
}



public class Q5 
{
	public static void main(String[] args) 
	{
		Student s = new Student1("ABC", 20, "DSA", 15, 90);
		Teacher t = new Teacher("XYZ", 35, "IGT", 2);
		System.out.println("***Student Details***");
		s.display();
		System.out.println("\n|-|Teacher Details|-|");
		t.display();
	}
}
